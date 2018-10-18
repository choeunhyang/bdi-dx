<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
</head>
<script>

	var	loginFormData = [{type:'fieldset',name:'login',label:'자신의정보수정하러가기',inputwidth:'auto',
			list:[
				{type:'input',name:'id',label:'ID',validate:'ValidAplhaNumeric',required:true},
				{type:'password',name:'pwd',label:'PASSWORD',validate:'ValidAplhaNumeric',required:true},
				{type:'button',name:'btn',value:'LOGIN'}
			]
		}];
</script>
<body>
	<div id="divForm"></div>
</body>
</html>