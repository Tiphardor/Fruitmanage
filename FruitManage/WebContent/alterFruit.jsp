<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<s:form action="alterFruit" method="post" enctype="multipart/form-data">
  <input type="hidden" name="id" value="${param.id}"/>
	<table align="center">
		<tr>
		  <td colspan="2" align="center">修改水果信息</td>
		</tr>
		<tr>
		  <td colspan="2">水果编号：${param.fruitId}</td>
		</tr>
		<tr>
		  <td>水果名称：</td>
		  <td><input type="text" value="${param.fruitName}"/></td>
		</tr>
		<tr>
		  <td colspan="2">库存余量：${param.fruitCount}</td>
		</tr>
		<tr>
		  <td colspan="2">入库时间：${param.date}</td>
		</tr>
		<tr>
		  <td colspan="2">销售累计：${param.calCount}</td>
		</tr>
		<tr>
		  <td>季节：</td>
		  <td><input type="radio" name="seasonId" value="1" checked>春季</input>
		      <input type="radio" name="seasonId" value="2">夏季</input>
		      <input type="radio" name="seasonId" value="3">秋季</input>
		      <input type="radio" name="seasonId" value="4">冬季</input>
		      <input type="radio" name="seasonId" value="5">全季</input>
		  </td>
		</tr>
		<tr>
		  <td>价格：</td>
		  <td><input type="text" name="fruitPrice" value="${param.fruitPrice}"/></td>
		</tr>
		<tr>
		  <td colspan="2">
			<s:file name="uploadImage" label="图片上传"></s:file>
		  </td>
		</tr>
		<tr>
		  <td><s:submit value="修改"/></td>
		  <td><input type="button" value="返回" onclick="goBack()"/></td>
		</tr>		
	</table>
</s:form>
</body>
</html>