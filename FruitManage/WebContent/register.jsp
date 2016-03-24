<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function check(){
		var userName = document.getElementById("userName");
		var pwd = document.getElementById("pwd");
		var repwd = document.getElementById("repwd");
		var realName = document.getElementById("realName");
		var phone = document.getElementById("phone");
		var address = document.getElementById("address");
		if(userName.value.trim() == ""){
			alert("用户名不能为空！");
			return false;
		}
		if(pwd.value.trim() == "" ){
			alert("密码不能为空！");
			return false;
		}
		if(repwd.value.trim() != pwd.value.trim() ){
			alert("两次密码不一致！");
			return false;
		}
		if(realName.value.trim() == "" ){
			alert("名字不能为空！");
			return false;
		}
		if(phone.value.trim() == "" ){
			alert("联系方式不能为空！");
			return false;
		}
		var re = /^[1-9]+[0-9]*]*$/;
		if(!re.test(phone.value)){
			alert("联系方式输入不正确！");
			return false;
		}
		if(address.value.trim() == "" ){
			alert("收件地址不能为空！");
			return false;
		}
	}
</script>
<style type='text/css'>
	a{
		color:black;
		text-decoration:none;
	}
</style>
</head>
<body>
<jsp:include page="top.jsp"></jsp:include>
<s:form action="registerUser" method="post">
	<table align="center">
		<tr align="center">
			<td align="center" colspan="2"><font size="3"><b>用户注册</b></font></td>
		</tr>
		<tr>
			<td>用户名：</td>
			<td><input id="userName" type="text" name="user.userName" /><font color="red">*</font></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input id="pwd" type="password" name="user.password" /><font color="red">*</font></td>
		</tr>
		<tr>
			<td>确认密码：</td>
			<td><input id="repwd" type="password" name="user.repassword" /><font color="red">*</font></td>
		</tr>
		<tr>
			<td>姓名：</td>
			<td><input id="realName" type="text" name="user.realName" /><font color="red">*</font></td>
		</tr>
		<tr>
			<td>性别：</td>
			<td><input type="radio" name="user.gender" value="1" checked>男</input>
			    <input type="radio" name="user.gender" value="2">女</input></td>
		</tr>
		<tr>
			<td>email：</td>
			<td><input id="email" type="text" name="user.email" /></td>
		</tr>
		<tr>
			<td>联系方式：</td>
			<td><input id="phone" type="text" name="user.phone" /><font color="red">*</font></td>
		</tr>
		<tr>
			<td>收件地址：</td>
			<td><input id="address" type="text" name="user.address" /><font color="red">*</font></td>
		</tr>
		<tr>
			<td><input type="submit" value="注册" onclick="return check();"/></td>
			<td><input type="reset" value="重置" /></td>
		</tr>
	</table>
</s:form>
</body>
</html>