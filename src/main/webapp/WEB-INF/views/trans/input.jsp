<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
	<style>
		select{width:100px; height:40px; text-align:center;	}
		textarea{width:300px; height:100px;}
		button{margin-left:60px; width:70px; height:70px; text-align:center; background-color:maroon; color:white; border:blue;}
	</style>
</head>
<body>
<form>
	번역할 언어1 : <select id="source">
				<option value="ko">한국어</option>
				<option value="en">영어</option>
				<option value="ja">일본어</option>
				<option value="zh-CN">중국어-간체</option>
				<option value="zh-TW">중국어-번체</option>
			</select>
	번역될 언어2 : <select id="target">
				<option value="ko">한국어</option>
				<option value="en">영어</option>
				<option value="ja">일본어</option>
				<option value="zh-CN">중국어-간체</option>
				<option value="zh-TW">중국어-번체</option>
			</select><br><br>
	번역내용 : <textarea id="text" rows="3"></textarea>
	번역 후 : <textarea id="text2" rows="3"></textarea><br>
	<button type="button" onclick="tran()">번역</button>
</form>
<script>
	function tran(){
		var source = document.querySelector('#source').value;
		var target = document.querySelector('#target').value;
		var text = document.querySelector('#text').value;
		var text2 = document.querySelector('#text2');
		var param = 'source=' + source + '&target=' + target + '&text=' + text;
		
		var conf={
				url : encodeURI('/trans?' + param),
				success : function(res){
					res = JSON.parse(res);
					if(source==target){
						text2.value = text.value;
					}else{
						text2.value = res.message.result.translatedText;
					}
					//alert(res);
				}
		};
		au.send(conf);
	}
</script>
</body>
</html>