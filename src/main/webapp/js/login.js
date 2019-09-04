function logo(){
	var txtusername=document.getElementById("txtusername").value;
	var pswd=document.getElementById("pswd").value;
	/*判断用户名和密码不能为空*/
	if(txtusername==""){
		alert("您还没输入名字呐QAQ");
		return 1;
	}
	if(pswd==""){
		alert("您的密码没输入呢QAQ");
		return 2;
	}

//	//登录之后进入主页面
//		window.open("../index.html");
//		return;
//	
}
//进入注册页面
function registe(){
	window.open("../html/register.html")
}
