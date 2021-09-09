<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><!-- ←これがディレクティブ(このページはこういう属性を持っていますよ) -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World! </h1>
</body>
</html>
<!-- pageディレクティブ -->
<!-- 実際に上に描いてるやつ
　　　主にページの表示に関する設定を記述している
　　　・language：JSPで使用する言語の指定
　　　　 ex.language=”java"
     ・contentType：JPSページのデータ型、文字コードの指定
        ex.contentType=”text/html; charset=UTF-8″
     ・pageEncoding：JPSページの文字コードの指定
        ex.pageEncoding=”UTF-8
      
      使用する言語がJava・かつHTMLのデータをUTF-8形式で出力するといった書き方が上記のソースとなる
      もし文字コードをSHIFT-JISに変更したいとなれば、
      contentType=”SHIFT-JIS” にすればOK！！！
      
      今回上記ではcontentType="UTF-8" に加えて、 pageEncoding="UTF-8" と指定していますが、
	　 contentTypeで文字コードを指定すればpageEncodingで再度文字コードを指定しなくても大丈夫！！！
	  ※上記の他にも「import(JSPで使用するクラスの指定、import=”java.util.Date”)」
	  　　　　　　　「session(セッションの有効・無効を指定、session=”true”)」
	              「errorPage(エラーが発生した際の遷移先を指定、errorPage=”(遷移先ページのパス)”)」
      -->
