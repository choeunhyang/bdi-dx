<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
	<link rel="stylesheet" type="text/css" href="${resPath}/dhtmlx/skins/terrace/dhtmlx.css"/> 
</head>
<script>

	var scGrid;
	function doInit(){
		scGrid = new dhtmlXGridObject('divGrid');
		scGrid.setImagePath('${resPath}/dhtmlx/skins/terrace/imgs/dhxgrid_terrace');
		scGrid.setHeader('번호,이름,이메일,전화번호,생일,자기소개');
		scGrid.setColumnIds('scnum,scname,scemail,scmobile,scbirth,scdesc')
		scGrid.init();
	};
	window.addEventListener('load',doInit);
</script>
<body>
	<div id="divGrid" style="width:700px; height:500px;"></div>
</body>
</html>