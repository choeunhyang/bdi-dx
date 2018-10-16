<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>스프링테스트</title>
<link rel="stylesheet" type="text/css" href="${resPath}/dhtmlx/skins/skyblue/dhtmlx.css"/>
</head>
<script>
	var dfGrid; 
	window.addEventListener('load',function(){
		dfGrid = new dhtmlXGridObject('divGrid');
		dfGrid.setImagePath('${resPath}/dhtmlx/skins/skyblue/imgs/dhxgrid_skyblue/');
		dfGrid.setHeader('번호,이름,설명,조회수');
		dfGrid.setColumnIds('dino,diname,didesc,dicnt');
		dfGrid.setColAlign('center,center,center,center');
		dfGrid.setColTypes('ro,ed,ed,re');
		dfGrid.setColSorting('int,str,str,int');
		dfGrid.init();
		au.send({url:'/depart',success:function(res){
			res = JSON.parse(res);
			dfGrid.parse(res,'js');
		}});
	});
</script>
<body>
	<div id="divGrid" style="width:auto; height:350px;"></div>
</body>
</html>