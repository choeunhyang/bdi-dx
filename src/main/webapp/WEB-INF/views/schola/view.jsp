<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
</head>
<script>
function doInit(){
	var	formData = [{type:'fieldset',name:'sign',label:'',inputwidth:'auto',
			list:[
				{type:'input',name:'id',label:'ID',value:'${sc.scid}',validate:'ValidAplhaNumeric',required:true},
				{type:'password',name:'pwd',label:'PASSWORD',validate:'ValidAplhaNumeric',required:true},
				{type:'input',name:'name',label:'NAME',validate:'ValidAplhaNumeric',required:true},
				{type:'input',name:'age',label:'AGE',validate:'ValidAplhaNumeric',required:true},
				{type:'input',name:'email',label:'EMAIL'},
				{type:'input',name:'addr',label:'ADDRESS'},
				{type:'input',name:'mobile',label:'MOBILE',validate:'ValidAplhaNumeric',required:true},
				{type:'input',name:'birth',label:'BIRTHDAY'},
				{type:'textarea',name:'desc',label:'DESC'},
				{type:'button',name:'btn',value:'LOGIN'}
			]
		}];
	var	scForm;
	scForm = new dhtmlXForm('divForm',formData);
	
}
window.addEventListener('load',doInit);
</script>
<body>
	<div id="divForm"></div>
</body>
</html>