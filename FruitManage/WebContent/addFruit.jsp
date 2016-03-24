<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加水果</title>
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	$("#fruitIdR").blur(function(){
		var fruitId = $("#fruitId").val();
		alert(fruitId);
		$.ajax({
			url: 'checkFruitId.action',
	        type: 'post',
	        data:{'fruitId':fruitId},
	        dataType: 'json',
	        error: function(){
				alert("请求错误");
	        },
	        success: function(fruit){
	        	var id = fruit.id;
	        	if(fruit != null){
	        		alert("水果编号已存在！");
	        	}else{
	        		alert(".");
	        	}
	        }
		});
	});
</script>
</head>
<body>
	<s:form action="addFruit" method="post" enctype="multipart/form-data">
	<table align="center">
	<tr>
		<td>添加水果</td>
	</tr>
	<tr>
		<td id="fruitIdR"><s:textfield id="fruitId" name="fruit.fruitId" label="水果编号"/></td>
	</tr>
	<tr>
		<td><s:textfield name="fruit.fruitName" label="水果名"/></td>
	</tr>
	<tr>
		<td><s:textfield name="fruit.fruitCount" label="数量"/></td>
	</tr>
	<tr>
		<td><s:textfield name="fruit.fruitPrice" label="价格"/></td>
	</tr>
	<tr>
		<td><s:textarea name="fruit.fruitDes" width="30px" label="详细描述"/></td>
	</tr>
	<tr>
		<td><s:radio list="#{1:'春季',2:'夏季',3:'秋季',4:'冬季',5:'全季'}" name="fruit.seasonId" listKey="key" listValue="value" value="1" label="季节"/></td>
	</tr>
	<tr>
		<td><s:file name="uploadImage" label="图片上传"></s:file></td>
	</tr>
	<tr>
		<td><s:submit value="添加"></s:submit></td>
	</tr>
	</table>
	</s:form>
</body>
</html>