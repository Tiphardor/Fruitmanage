<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	 	<font size="20"><b>阿甘水果店</b></font>
	</div>
	<% if(session.getAttribute("id")==null){
		System.out.println("ssssssss");
    %>
    	<div align="right" style="right:0px;margin-right:230px;"><a href="register.jsp">注册</a>&nbsp;<a href="login.jsp">登录</a>&nbsp;<a href="ViewFruitListToC.action">去主页</a></div>
    <%}else{	
	    String userName = (String)session.getAttribute("userName");
	    System.out.println(userName);
    %>
        <div align="right" style="right:0px;margin-right:200px;">您好!<%=userName%>&nbsp;<a href="viewShopcar.action">查看购物车</a>&nbsp;<a href="viewOrder.action">查看订单</a>&nbsp;<a href="logoutUser.action">注销</a>&nbsp;<a href="ViewFruitListToC.action">去主页</a></div>
	<%}
 	%>
	<hr />
</body>
</html>