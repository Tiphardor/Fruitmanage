<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript" type="text/javascript">
	function goBack(){
		window.location.href="ViewFruitList.action";
	}
</script>
</head>
<body>
	<s:form action="addFruitCount" method="post">
		<input type="hidden" name="id" value="${param.id}"/>
		<table>
			<tr>
			  <td colspan="2">添加水果余量</td>
			</tr>
			<tr>
			  <td>水果编号:</td>
			  <td>${param.fruitId}</td>
			</tr>
			<tr>
			  <td>水果名称:</td>
			  <td>${param.fruitName}</td>
			</tr>
			<tr>
			  <td>添加数量:</td>
			  <td><input type="text" name="fruitCount"/></td>
			</tr>
			<tr>
			  <td><input type="submit" value="添加"/></td>
			  <td><input type="button" onclick="goBack()" value="返回"/></td>
			</tr>
		</table>
	</s:form>
</body>
</html>