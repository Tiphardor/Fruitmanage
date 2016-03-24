<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type='text/css'>	
	a{
		color:black;
		text-decoration:none;
	}
	img{ 
    	border-width:0; 
	}
</style>
</head>
<body>
<div style="padding-left:50px;padding-right:230px;"><font size="6" color="blue">审核不通过订单信息列表：</font><br /></div>
<table align="center">
	<tr>
		<td colspan="2" width="350px">店铺：阿甘水果店</td>
		<td width="110px">单价（元）</td>
		<td width="50px">数量</td>
		<td width="90px">金额（元）</td>
		<td width="90px">提交日期</td>
		<td width="90px">买家名字</td>
		<td width="90px">状态</td>
	</tr>
	<s:iterator id="viewOrder" status="st" value="viewOrderList">
		<tr>
			<td colspan="8"><hr /></td>
		</tr>
		<tr>
			<td><img width="50" height="50" src="<%=request.getContextPath()%>/file/<s:property value="imageUrl"/>" /></td>
			<td width="310"><font size="3" color="blue">${fruitLongName}</font><br />
		   		<font size="2" color="gray">此商品不支持7天无理由退货！</font></td>
			<td>${fruitPrice}</td>
			<td>${count}</td>
			<td>${totalPrice}</td>
			<td>${date}</td>
			<td>${userName}</td>
			<td>${stateDes}</td>
		</tr>
	</s:iterator>
</table>
<div style="padding-left:50px;padding-right:50px;"><hr /></div>
</body>
</html>