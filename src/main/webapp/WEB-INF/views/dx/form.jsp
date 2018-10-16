<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
	<meta charset="utf-8">
	<title>스프링테스트</title>
</head>
<script>
	var dxForm;
//	var wWidth = screen.width;
//	var wHeight = screen.height;
	var dxForm,dxWin;
	var loginFormData =[
		{type:'fieldset', name:'login', label:'login', inputWidth:'auto',
			list:[
				{type:'input',name:'id',label:'ID',validate:'ValidAplhaNumeric',required:true},
				{type:'password',name:'pwd',label:'PWD',validate:'ValidAplhaNumeric',required:true},
				{type:'button',name:'loginbtn',value:'LOGIN'}
			]
		}
	];
	function doInit(){
		var forms = [
			/* {type:'settings',position:'lable-left',labelWidth:100,inputWidth:200,inputHeight:50},
			{type:'fieldset',label:'부서',list:[
				{type:'input',label:'test'},
				{type:'input',label:'test2'}
			]}, */
			{type:'button',value:'버튼',name:'btn'},
			{type:'button',value:'오픈',name:'open'},
		];
		var dxForm = new dhtmlXForm('dxForm',forms);
		dxForm.attachEvent('onButtonClick',function(name){
			if(name=='btn'){
				alert(name);
			}else if(name=='open'){
				if(!dxWin){ // !붙이면 한번만 생성된다.
					dxWin = new dhtmlXWindows();
					dxWin.createWindow('w1',0,0,250,250); // 나중에 이 객체를 받아올 id,x,y,가로,세로 새로운 윈도우를 만드는 방법
					dxWin.window('w1').centerOnScreen();
					dxForm.addItem(null,{type:'button',value:'숨김',name:'hide'});
					dxForm.addItem(null,{type:'button',value:'짜잔',name:'show'});
					var loginForm = new dhtmlXForm('loginForm',loginFormData);
					dxWin.window('w1').attachObject('loginForm');
					loginForm.attachEvent('onButtonClick',function(name){
						if(name=='loginbtn'){
							if(loginForm.validate()){
								var id=loginForm.getItemValue('id');
								var pwd=loginForm.getItemValue('pwd');
								//alert(id + ' , ' + pwd);
								var conf = {
									url : '/login',
									method : 'POST',
									param : JSON.stringify({id:id,pwd:pwd}), //{"id":"test","pwd":"test"}
									success : function(res){
										res = JSON.parse(res);
										alert(res.msg);
									}
								};
								au.send(conf);
							};
						};
					});
				};
			}else if(name=='hide'){
				dxWin.window('w1').hide();
			}else if(name=='show'){
				dxWin.window('w1').show();
			}
		});
	};
	window.addEventListener('load',doInit);
</script>
<body>
	<div id="dxForm" style="height:100px"></div>
	<div id="loginForm" style="width:200px; height:200px" align="center"></div>
</body>
</html>