<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function register(){
		window.location.href="register.jsp";
	};
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
<% 
	String loginErrorResult = (String)request.getAttribute("loginErrorResult");
	if(loginErrorResult != null){
		out.print("<script>alert('"+loginErrorResult+"');</script>");
	}
	String loginResult = (String)request.getAttribute("loginResult");
	if(loginResult != null){
		out.print("<script>alert('"+loginResult+"');</script>");
	}
%>
<s:form action="loginUser" method="post">
	<table align="center">
		<tr align="center">
			<td align="center" colspan="2"><font size="3"><b>用户登录</b></font></td>
		</tr>
		<tr>
			<td>用户名：</td>
			<td><input type="text" name="userName" /></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" name="password" /></td>
		</tr>
		<tr>
			<td>类型：</td>
			<td><input type="radio" name="style" value="1">管理员</input>
			    <input type="radio" name="style" value="2" checked>客户</input></td>
		</tr>
		<tr>
			<td><input type="submit" value="登录" /></td>
			<td><input type="button" value="注册" onclick="register();"/></td>
		</tr>
	</table>
</s:form>
</body>
</html>