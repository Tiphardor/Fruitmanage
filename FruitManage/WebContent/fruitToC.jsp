<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function buy(id,fruitCount){
		var re = /^[1-9]+[0-9]*]*$/;
		var buyCount = document.getElementById("buyCount");
		if(!re.test(buyCount.value)){
			alert("输入非法！");
			return false;
		}
		if(buyCount.value > fruitCount){
			alert("购买数量不能大于库存余量！");
			return false;
		}
		var params = "id="+id+"&buyCount="+buyCount.value;
		window.location.href="buyFruit.action?"+params;
	}
	function add(id,fruitCount){
		var re = /^[1-9]+[0-9]*]*$/;
		var buyCount = document.getElementById("buyCount");
		if(!re.test(buyCount.value)){
			alert("输入非法！");
			return false;
		}
		if(buyCount.value > fruitCount){
			alert("购买数量不能大于库存余量！");
			return false;
		}
		var buyCount = document.getElementById("buyCount");
		var params = "fruitId="+id+"&buyCount="+buyCount.value;
		window.location.href="addShopcar.action?"+params;
	}
</script>
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
<jsp:include page="top.jsp"></jsp:include>
<input type="hidden" name="id" value="${param.id}"/>
<table align="center">
	<tr>
		<td rowspan="6">
			<img width="260" height="260" src="<%=request.getContextPath()%>/file/<s:property value="viewFruit.imageUrl"/>"/>
		</td>	
	</tr>
	<tr>
		<td><font size="3"><b>&nbsp;&nbsp;&nbsp;<s:property value="viewFruit.fruitLongName" /></b></font>
		<br /><font size="2" color="red"><b>&nbsp;&nbsp;&nbsp;<s:property value="viewFruit.fruitLongName" /></b></font></td>
	</tr>
	<tr>
		<td><div style="width:400px; height:20px;padding-top:5px;">
			<font size="3" color="gray">&nbsp;&nbsp;&nbsp;价格</font>
			<font size="6" color="red">&nbsp;&nbsp;&nbsp;&nbsp;¥<s:property value="viewFruit.fruitPrice"/></font></div></td>
	</tr>
	<tr>
		<td><font size="3" color="gray">&nbsp;&nbsp;&nbsp;销售量:</font>
		<font size="4"><b><s:property value="viewFruit.calCount"/></b></font>
		<font size="3" color="gray">&nbsp;&nbsp;&nbsp;库存余量:</font>
		<font size="4"><b><s:property value="viewFruit.fruitCount"/></b></font></td>
	</tr>
	<tr>
		<td><font size="3" color="gray">&nbsp;&nbsp;&nbsp;购买量:</font>
		<input id="buyCount" name="buyCount" value="1"/></td>
	</tr>
	<tr>
		<td><a href="javascript:void(0)" onclick="return buy('${param.id}','${viewFruit.fruitCount}');"><img src="<%=request.getContextPath()%>/image/buy.png"/></a>
		<a href="javascript:void(0)" onclick="return add('${param.id}','${viewFruit.fruitCount}');"><img src="<%=request.getContextPath()%>/image/add.png"/></a></td>
	</tr>
	<tr>
		<td colspan="2" width="200"><font size="5" color="gray">水果详细描述：</font><br />
		<font size="3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:property value="viewFruit.fruitDes"/></font></td>
	</tr>
</table>
</body>
</html>