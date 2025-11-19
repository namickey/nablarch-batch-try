### ビルド＆実行

```
mvnw.cmd -P gsp clean generate-resources

mvnw.cmd package

データバインドを使用した住所登録バッチ
mvnw.cmd exec:java -Dexec.mainClass=nablarch.fw.launcher.Main -Dexec.args="'-requestPath' 'ImportZipCodeFileAction/ImportZipCodeFile' '-diConfig' 'classpath:import-zip-code-file.xml' '-userId' '105'"
```


# H2に格納されているデータを確認する方法

以下の手順で確認する。

1.h2/bin/h2.batを実行する。

2.しばらく待つとブラウザが起動するので、各項目に以下の通りに入力し、[Connect]ボタンをクリックする。

| 項目     | 値                  |
|:---------|:--------------------|
|JDBC URL  |jdbc:h2:../db/SAMPLE |
|User Name |SAMPLE               |
|Password  |SAMPLE               |

3.左側のペインのテーブル名をクリックすると、クリックしたテーブルに対するSELECT文が生成される。

4.[Run]ボタンをクリックすると、生成したSELECT文が実行され、テーブルのデータを確認することができる。

5.使用終了時は、左上のdisconnectボタン(赤色で書かれたアイコンのボタン)をクリックして切断する。
  **切断を忘れると、バッチアプリからH2に接続できなくなる。**
