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
		scGrid.setHeader('이름,나이,이메일,전화번호,생일,자기소개');
		scGrid.setColumnIds('scname,scage,scemail,scmobile,scbirth,scdesc');
		scGrid.setColTypes('ro,ro,ro,ro,ro,ro');
		scGrid.setColSorting('str,int,str,str,str,str');
		scGrid.init();
		au.send({url:'/schola',success:function(res){
			res = JSON.parse(res);
			scGrid.parse(res,'js');
		}});
		var scForm,scWin,loginFormData;
		loginFormData = [{type:'fieldset',name:'login',label:'자신의정보수정하러가기',inputwidth:'auto',
				list:[
					{type:'input',name:'id',label:'ID',validate:'ValidAplhaNumeric',required:true},
					{type:'password',name:'pwd',label:'PASSWORD',validate:'ValidAplhaNumeric',required:true},
					{type:'button',name:'btn',value:'LOGIN'}
				]
		}];
		var form = [
			{type:'button',value:'가입',name:'sign'},
			{type:'button',value:'수정',name:'update'}
		];
		scForm = new dhtmlXForm('divForm',form);
		scForm.attachEvent('onButtonClick',function(name){
			if(name=='sign'){
				alert('sss');
			}else if(name=='update'){
				if(!scWin){
					scWin = new dhtmlXWindows();
					scWin.createWindow('wlogin',0,0,300,300);
					scWin.window('wlogin').centerOnScreen();
					var loginForm = new dhtmlXForm('loginForm',loginFormData);
					scWin.window('wlogin').attachObject('loginForm');
					loginForm.attachEvent('onButtonClick',function(name){
						if(name=='btn'){
							if(loginForm.validate()){
								var id = loginForm.getItemValue('id');
								var pwd = loginForm.getItemValue('pwd');
								var conf = {
										url : '/schola/'+ id + '/' + pwd,
										success : function(res){
											res = JSON.parse(res);
											
										}
									};
								au.send(conf);
							}
						}
					});
				}
			}
		});
	};
	window.addEventListener('load',doInit);
</script>
<body>
	사람들목록
	<div id="divGrid" style="width:800px; height:500px;"></div>
	<div id="divForm"></div>
	<div id="loginForm"></div>
</body>
</html>