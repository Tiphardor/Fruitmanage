<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="javascript" type="text/javascript">
	function alter(id,fruitId,fruitName,fruitCount,date,season,fruitPrice,calCount,seasonId){
		alert(id+" "+fruitId+" "+fruitName+" "+fruitCount+" "+date+" "+season+" "+fruitPrice+" "+calCount+" "+seasonId);
		var params = "id="+id+"&fruitId="+fruitId+"&fruitName="+fruitName+"&fruitCount="+fruitCount+"&date="+date+"&season="+season+"&fruitPrice="+fruitPrice+"&calCount="+calCount+"&seasonId="+seasonId;
		alert(params);
		location.href="alterFruit.jsp?"+params;
	}
	function deleteFruit(id){
		if(confirm("确定删除该水果吗？")){
			window.location.href="deleteFruit.action?id="+id;
		}
	}
	function addFruitCount(id,fruitId,fruitName){
		var params = "id="+id+"&fruitId="+fruitId+"&fruitName="+fruitName;
		window.location.href="addFruitCount.jsp?"+params;
	}
</script>
</head>
<body>
<%
	String alterResult = (String)request.getAttribute("alterResult");
	if(alterResult != null){
		out.print("<script>alert('"+alterResult+"');</script>");
	}
	String deleteResult = (String)request.getAttribute("deleteResult");
	if(deleteResult != null){
		out.print("<script>alert('"+deleteResult+"');</script>");
	}
	String addResult = (String)request.getAttribute("addResult");
	if(addResult != null){
		out.print("<script>alert('"+addResult+"');</script>");
	}
%>
<table align="center">
	<tr>
		<td>水果编号</td>
		<td>名称</td>
		<td>库存余量</td>
		<td>入库时间</td>
		<td>季节</td>
		<td>价格</td>
		<td>销量累计</td>
		<td>操作</td>
	</tr>
	<s:iterator id="fruitList" value="viewFruitList">
	<input type="hidden" name="id" value="<s:property value='id'/>"/>
		<tr>
			<td><s:property value="fruitId"/></td>
			<td><s:property value="fruitName"/></td>
			<td><s:property value="fruitCount"/></td>
			<td><s:property value="date"/></td>
			<td><s:property value="season"/></td>
			<td><s:property value="fruitPrice"/></td>
			<td><s:property value="calCount"/></td>
			<td><input type="button" onclick="alter('${id}','${fruitId}','${fruitName}','${fruitCount}','${date}','${season}','${fruitPrice}','${calCount}','${seasonId}')" value="修改"/>
			    <input type="button" onclick="addFruitCount('${id}','${fruitId}','${fruitName}')" value="添加余量"/>
			    <input type="button" onclick="deleteFruit('${id}')" value="删除" /></td>		
		</tr>
	</s:iterator>
</table>
</body>
</html>