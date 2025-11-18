package com.example;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 * 郵便番号データ
 *
 */
@Generated("GSP")
@Entity
@Table(schema = "PUBLIC", name = "ZIP_CODE_DATA")
public class ZipCodeData implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 郵便番号データID */
    private Integer zipCodeDataId;

    /** 全国地方公共団体コード */
    private String localGovernmentCode;

    /** 郵便番号（5桁） */
    private String zipCode5digit;

    /** 郵便番号（7桁） */
    private String zipCode7digit;

    /** 都道府県名カナ */
    private String prefectureKana;

    /** 市区町村名カナ */
    private String cityKana;

    /** 町域名カナ */
    private String addressKana;

    /** 都道府県名漢字 */
    private String prefectureKanji;

    /** 市区町村名漢字 */
    private String cityKanji;

    /** 町域名漢字 */
    private String addressKanji;

    /** 一町域が二以上の郵便番号 */
    private Short multipleZipCodes;

    /** 小字毎に番地が起番されている町域 */
    private Short numberedEveryKoaza;

    /** 丁目を有する町域 */
    private Short addressWithChome;

    /** 一つの郵便番号で二以上の町域 */
    private Short multipleAddress;

    /** 更新 */
    private String updateData;

    /** 変更理由 */
    private String updateDataReason;
    /**
     * 郵便番号データIDを返します。
     *
     * @return 郵便番号データID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ZIP_CODE_DATA_ID", precision = 32, nullable = false, unique = true)
    public Integer getZipCodeDataId() {
        return zipCodeDataId;
    }

    /**
     * 郵便番号データIDを設定します。
     *
     * @param zipCodeDataId 郵便番号データID
     */
    public void setZipCodeDataId(Integer zipCodeDataId) {
        this.zipCodeDataId = zipCodeDataId;
    }
    /**
     * 全国地方公共団体コードを返します。
     *
     * @return 全国地方公共団体コード
     */
    @Column(name = "LOCAL_GOVERNMENT_CODE", length = 5, nullable = false, unique = false)
    public String getLocalGovernmentCode() {
        return localGovernmentCode;
    }

    /**
     * 全国地方公共団体コードを設定します。
     *
     * @param localGovernmentCode 全国地方公共団体コード
     */
    public void setLocalGovernmentCode(String localGovernmentCode) {
        this.localGovernmentCode = localGovernmentCode;
    }
    /**
     * 郵便番号（5桁）を返します。
     *
     * @return 郵便番号（5桁）
     */
    @Column(name = "ZIP_CODE_5DIGIT", length = 5, nullable = false, unique = false)
    public String getZipCode5digit() {
        return zipCode5digit;
    }

    /**
     * 郵便番号（5桁）を設定します。
     *
     * @param zipCode5digit 郵便番号（5桁）
     */
    public void setZipCode5digit(String zipCode5digit) {
        this.zipCode5digit = zipCode5digit;
    }
    /**
     * 郵便番号（7桁）を返します。
     *
     * @return 郵便番号（7桁）
     */
    @Column(name = "ZIP_CODE_7DIGIT", length = 7, nullable = false, unique = false)
    public String getZipCode7digit() {
        return zipCode7digit;
    }

    /**
     * 郵便番号（7桁）を設定します。
     *
     * @param zipCode7digit 郵便番号（7桁）
     */
    public void setZipCode7digit(String zipCode7digit) {
        this.zipCode7digit = zipCode7digit;
    }
    /**
     * 都道府県名カナを返します。
     *
     * @return 都道府県名カナ
     */
    @Column(name = "PREFECTURE_KANA", length = 128, nullable = false, unique = false)
    public String getPrefectureKana() {
        return prefectureKana;
    }

    /**
     * 都道府県名カナを設定します。
     *
     * @param prefectureKana 都道府県名カナ
     */
    public void setPrefectureKana(String prefectureKana) {
        this.prefectureKana = prefectureKana;
    }
    /**
     * 市区町村名カナを返します。
     *
     * @return 市区町村名カナ
     */
    @Column(name = "CITY_KANA", length = 128, nullable = false, unique = false)
    public String getCityKana() {
        return cityKana;
    }

    /**
     * 市区町村名カナを設定します。
     *
     * @param cityKana 市区町村名カナ
     */
    public void setCityKana(String cityKana) {
        this.cityKana = cityKana;
    }
    /**
     * 町域名カナを返します。
     *
     * @return 町域名カナ
     */
    @Column(name = "ADDRESS_KANA", length = 128, nullable = false, unique = false)
    public String getAddressKana() {
        return addressKana;
    }

    /**
     * 町域名カナを設定します。
     *
     * @param addressKana 町域名カナ
     */
    public void setAddressKana(String addressKana) {
        this.addressKana = addressKana;
    }
    /**
     * 都道府県名漢字を返します。
     *
     * @return 都道府県名漢字
     */
    @Column(name = "PREFECTURE_KANJI", length = 128, nullable = false, unique = false)
    public String getPrefectureKanji() {
        return prefectureKanji;
    }

    /**
     * 都道府県名漢字を設定します。
     *
     * @param prefectureKanji 都道府県名漢字
     */
    public void setPrefectureKanji(String prefectureKanji) {
        this.prefectureKanji = prefectureKanji;
    }
    /**
     * 市区町村名漢字を返します。
     *
     * @return 市区町村名漢字
     */
    @Column(name = "CITY_KANJI", length = 128, nullable = false, unique = false)
    public String getCityKanji() {
        return cityKanji;
    }

    /**
     * 市区町村名漢字を設定します。
     *
     * @param cityKanji 市区町村名漢字
     */
    public void setCityKanji(String cityKanji) {
        this.cityKanji = cityKanji;
    }
    /**
     * 町域名漢字を返します。
     *
     * @return 町域名漢字
     */
    @Column(name = "ADDRESS_KANJI", length = 128, nullable = false, unique = false)
    public String getAddressKanji() {
        return addressKanji;
    }

    /**
     * 町域名漢字を設定します。
     *
     * @param addressKanji 町域名漢字
     */
    public void setAddressKanji(String addressKanji) {
        this.addressKanji = addressKanji;
    }
    /**
     * 一町域が二以上の郵便番号を返します。
     *
     * @return 一町域が二以上の郵便番号
     */
    @Column(name = "MULTIPLE_ZIP_CODES", precision = 16, nullable = false, unique = false)
    public Short getMultipleZipCodes() {
        return multipleZipCodes;
    }

    /**
     * 一町域が二以上の郵便番号を設定します。
     *
     * @param multipleZipCodes 一町域が二以上の郵便番号
     */
    public void setMultipleZipCodes(Short multipleZipCodes) {
        this.multipleZipCodes = multipleZipCodes;
    }
    /**
     * 小字毎に番地が起番されている町域を返します。
     *
     * @return 小字毎に番地が起番されている町域
     */
    @Column(name = "NUMBERED_EVERY_KOAZA", precision = 16, nullable = false, unique = false)
    public Short getNumberedEveryKoaza() {
        return numberedEveryKoaza;
    }

    /**
     * 小字毎に番地が起番されている町域を設定します。
     *
     * @param numberedEveryKoaza 小字毎に番地が起番されている町域
     */
    public void setNumberedEveryKoaza(Short numberedEveryKoaza) {
        this.numberedEveryKoaza = numberedEveryKoaza;
    }
    /**
     * 丁目を有する町域を返します。
     *
     * @return 丁目を有する町域
     */
    @Column(name = "ADDRESS_WITH_CHOME", precision = 16, nullable = false, unique = false)
    public Short getAddressWithChome() {
        return addressWithChome;
    }

    /**
     * 丁目を有する町域を設定します。
     *
     * @param addressWithChome 丁目を有する町域
     */
    public void setAddressWithChome(Short addressWithChome) {
        this.addressWithChome = addressWithChome;
    }
    /**
     * 一つの郵便番号で二以上の町域を返します。
     *
     * @return 一つの郵便番号で二以上の町域
     */
    @Column(name = "MULTIPLE_ADDRESS", precision = 16, nullable = false, unique = false)
    public Short getMultipleAddress() {
        return multipleAddress;
    }

    /**
     * 一つの郵便番号で二以上の町域を設定します。
     *
     * @param multipleAddress 一つの郵便番号で二以上の町域
     */
    public void setMultipleAddress(Short multipleAddress) {
        this.multipleAddress = multipleAddress;
    }
    /**
     * 更新を返します。
     *
     * @return 更新
     */
    @Column(name = "UPDATE_DATA", length = 1, nullable = false, unique = false)
    public String getUpdateData() {
        return updateData;
    }

    /**
     * 更新を設定します。
     *
     * @param updateData 更新
     */
    public void setUpdateData(String updateData) {
        this.updateData = updateData;
    }
    /**
     * 変更理由を返します。
     *
     * @return 変更理由
     */
    @Column(name = "UPDATE_DATA_REASON", length = 1, nullable = false, unique = false)
    public String getUpdateDataReason() {
        return updateDataReason;
    }

    /**
     * 変更理由を設定します。
     *
     * @param updateDataReason 変更理由
     */
    public void setUpdateDataReason(String updateDataReason) {
        this.updateDataReason = updateDataReason;
    }
}
