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
				{type:'password',name:'pwd',label:'PASSWORD',value:'${sc.scpwd}' ,validate:'ValidAplhaNumeric',required:true},
				{type:'input',name:'name',label:'NAME',value:'${sc.scname}',required:true},
				{type:'input',name:'age',label:'AGE',value:'${sc.scage}',validate:'ValidInteger',required:true},
				{type:'input',name:'email',label:'EMAIL',value:'${sc.scemail}'},
				{type:'input',name:'addr',label:'ADDRESS',value:'${sc.scaddr}'},
				{type:'input',name:'mobile',label:'MOBILE',value:'${sc.scmobile}',validate:'ValidAplhaNumeric',required:true},
				{type:'input',name:'birth',label:'BIRTHDAY',value:'${sc.scbirth}'},
				{type:'input',name:'desc',label:'DESC',value:'${sc.scdesc}',rows:'8'},
				{type:'button',name:'abtn',value:'수정하기'},
				{type:'button',name:'dbtn',value:'삭제하기'},
				{type:'button',name:'bbtn',value:'돌아가기'}
			]
		}];
	var	scForm;
	scForm = new dhtmlXForm('divForm',formData);
	scForm.attachEvent('onButtonClick',function(name){
		var id = scForm.getItemValue('id');
		if(name=='abtn'){
			if(scForm.validate()){
				var pwd = scForm.getItemValue('pwd');
				var name = scForm.getItemValue('name');
				var age = scForm.getItemValue('age');
				var email = scForm.getItemValue('email');
				var addr = scForm.getItemValue('addr');
				var mobile = scForm.getItemValue('mobile');
				var birth = scForm.getItemValue('birth');
				var desc = scForm.getItemValue('desc');
				var	conf = {
					url:'/schola/'+id,
					method:'PUT',
					param:JSON.stringify({
						scid:id,scpwd:pwd,scname:name,scage:age,
						scemail:email,scaddr:addr,scmobile:mobile,
						scbirth:birth,scdesc:desc
					}),
					success:function(res){
						if(res=="1"){
							alert('수정에 성공하였습니다.');
							location.href='/uri/schola/list';
						}else{
							alert('수정에 실패하였습니다.');
						}
					}
				};
				au.send(conf);
			}
		}else if(name=='dbtn'){
			au.send({url:'/schola/'+id,method:'DELETE',success:function(res){
				if(res=="1"){
					alert('삭제에 성공하였습니다.');
					location.href='/uri/schola/list';
				}else{
					alert('삭제에 실패하였습니다.');
				}
			}});
		}else if(name=='bbtn'){
			location.href='/uri/schola/list';
		}
	});
	
}
window.addEventListener('load',doInit);
</script>
<body>
	<div id="divForm"></div>
</body>
</html>