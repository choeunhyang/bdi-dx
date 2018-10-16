<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
	<link rel="stylesheet" type="text/css" href="${resPath}/dhtmlx/skins/skyblue/dhtmlx.css"/>
<script>
	var jpGird;
	window.addEventListener('load',function(){
		jpGrid = new dhtmlXGridObject('divGrid');
		/* jpGrid.setImagePath('${resPath}/codebase/imgs/'); */
		jpGrid.setImagePath('${resPath}/dhtmlx/skins/skyblue/imgs/dhxgrid_skyblue/');
		jpGrid.setHeader('번호,이름,설명');
		jpGrid.setColumnIds('jpnum,jpname,jpdesc');
		jpGrid.setColAlign('center,center,center');
		jpGrid.setColTypes('ro,ed,ed');
		jpGrid.setColSorting('int,str,str');
		jpGrid.init();
		au.send({url:'/japans',success:function(res){
			res = JSON.parse(res);
			jpGrid.parse(res,'js');
		}}); 
		/*var data = [{jpnum:1,jpname:"test",jpdesc:"test data"},
			{jpnum:2,jpname:"test2",jpdesc:"test data4"},
			{jpnum:3,jpname:"test3",jpdesc:"test data5"}
			];
		jpGrid.parse(data,'js'); */
	});
</script>
</head>
<body>
	<div id="divGrid" style="width:500px; height:350px; background-color:white;"></div>
<%-- <table border="1">
	<thead>
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>내용</td>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="j" items="${jList}">
	<tr>
		<td><a href="/japans/${j.jpnum}">${j.jpnum}</a></td>
		<td>${j.jpname}</td>
		<td>${j.jpdesc}</td>
	</tr>
	</c:forEach>
	</tbody>
</table> --%>
</body>
</html>