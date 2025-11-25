package com.example;

import java.util.Set;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import nablarch.common.dao.UniversalDao;

import nablarch.core.beans.BeanUtil;
import nablarch.core.beans.BeansException;
import nablarch.core.log.Logger;
import nablarch.core.log.LoggerManager;
import nablarch.core.message.Message;
import nablarch.core.message.MessageLevel;
import nablarch.core.message.MessageUtil;
import nablarch.core.util.annotation.Published;
import nablarch.core.validation.ee.ValidatorUtil;
import nablarch.fw.DataReader;
import nablarch.fw.ExecutionContext;
import nablarch.fw.Result;
import nablarch.fw.action.BatchAction;

/**
 * 住所ファイルをDBに登録するバッチクラス。
 * @author Nabu Rakutaro
 */
@Published
public class ImportZipCodeFileAction extends BatchAction<ZipCodeForm> {

    /** ロガー */
    private static final Logger LOGGER = LoggerManager.get(ImportZipCodeFileAction.class);

    /**
     * {@link ZipCodeFileReader} から渡された一行分の情報をDBに登録する。
     * <p/>
     * メソッド実行時に{@link ValidateData} がインターセプトされるため、
     * このメソッドには常にバリデーション済みの {@code inputData} が引き渡される。
     *
     * @param inputData 一行分の住所情報
     * @param ctx       実行コンテキスト
     * @return 結果オブジェクト
     */
    @Override
    public Result handle(ZipCodeForm inputData, ExecutionContext ctx) {

        final Validator validator = ValidatorUtil.getValidator();
        final Set<ConstraintViolation<Object>> constraintViolations = validator.validate(inputData);
        if (!constraintViolations.isEmpty()) {
            constraintViolations.stream()
                                .map(violation -> {
                                    // 行番号プロパティが定義されているBeanのみ行番号を設定
                                    Long lineNumber = null;
                                    try {
                                        lineNumber = (Long) BeanUtil.getProperty(inputData, "lineNumber");
                                    } catch (BeansException e) { //CHECKSTYLE IGNORE THIS LINE
                                        // NOP
                                    }

                                    // バリデーションエラーの内容をロギングする
                                    Message message = MessageUtil.createMessage(
                                            MessageLevel.WARN,
                                            "invalid_data_record",
                                            violation.getPropertyPath(),
                                            violation.getMessage(),
                                            lineNumber);
                                    return message.formatMessage();
                                })
                                .forEach(LOGGER::logWarn);
            return null;
        }

        ZipCodeData data = BeanUtil.createAndCopy(ZipCodeData.class, inputData);
        UniversalDao.insert(data);

        return new Result.Success();
    }

    /**
     * リーダを作成する。
     *
     * @param ctx 実行コンテキスト
     * @return リーダーオブジェクト
     */
    @Override
    public DataReader<ZipCodeForm> createReader(ExecutionContext ctx) {
        return new ZipCodeFileReader();
    }
}
