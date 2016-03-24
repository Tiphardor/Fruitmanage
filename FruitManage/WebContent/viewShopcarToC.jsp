<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	function change(id,totalPrice){
		var count = parseInt(document.getElementById("count").innerHTML,10);
		var price = parseFloat(document.getElementById("price").innerHTML,10);
		var checkboxObj = document.getElementById("checkbox"+id);
		if(checkboxObj.checked){
			count++;
			price += parseFloat(totalPrice,10);
			$("#summany").empty();
			$("#summany").append("<font size='5'>选择了<font id='count' color='red'>"+count+"</font>件商品！总共<font id='price' color='red'>"+price+"</font>元</font><a href='javascript:void(0)' onclick='settlement();'><img src='image/settlement.png'/></a>");
		}else{
			count--;
			price -= parseFloat(totalPrice,10);
			$("#summany").empty();
			$("#summany").append("<font size='5'>选择了<font id='count' color='red'>"+count+"</font>件商品！总共<font id='price' color='red'>"+price+"</font>元</font><a href='javascript:void(0)' onclick='settlement();'><img src='image/settlement.png'/></a>");
		}
	}
	function deleteShopcar(id,fruitId,buyCount){
		if(confirm("确定删除该水果吗？")){
			var params = "id="+id+"&fruitId="+fruitId+"&buyCount="+buyCount;
			window.location.href="deleteShopcar.action?"+params;
		}
	}
	function settlement(){
		var params = "idString=";
		var checkBoxObjs = document.getElementsByName("checkbox");
		for(var i = 0;i < checkBoxObjs.length; i++){
			if(checkBoxObjs[i].checked){
				var id = checkBoxObjs[i].value;
				params = params + id + ",";
			}
		}
		window.location.href="commitShopcar.action?"+params;
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
<%
	String commitResult = (String)request.getAttribute("commitResult");
	if(commitResult != null){
		out.print("<script>alert('"+commitResult+"');</script>");
}
%>
<jsp:include page="top.jsp"></jsp:include>
<div style="padding-left:230px;padding-right:230px;"><font size="10"><b>购物车</b></font>
<font size="5" color="red"><b>阿甘水果店</b></font><br /></div>
<table align="center">
	<tr>
		<td colspan="3" width="350px">商品信息</td>
		<td width="120px">单价（元）</td>
		<td width="100px">数量</td>
		<td width="100px">金额</td>
		<td width="100px">操作</td>
	</tr>
	<s:iterator id="viewShopcar" status="st" value="viewShopcarList">
	<input type="hidden" name="id" value="${id}"/>
	<input type="hidden" name="fruitId" value="${fruitId}"/>
	<input type="hidden" name="userId" value="${userId}"/>
	<tr>
		<td colspan="7"><hr /></td>
	</tr>
	<tr>	
		<td><input id="checkbox${id}" type="checkbox" name="checkbox" value="${id}" onchange="change('${id}','${totalPrice}');"/></td>
		<td><img width="50" height="50" src="<%=request.getContextPath()%>/file/<s:property value="imageUrl"/>" /></td>
		<td width="340"><font size="3" color="blue">${fruitLongName} </font><br />
		    <font size="2" color="gray">此商品不支持7天无理由退货！</font></td>
		<td>${fruitPrice}</td>
		<td>${count}</td>
		<td>${totalPrice}</td>
		<td><a href="javascript:void(0)" onclick="deleteShopcar('${id}','${fruitId}','${count}');">删除</a></td>
	</tr>
	</s:iterator>
</table>
<div style="padding-left:230px;padding-right:230px;"><hr /></div>
<div id="summany" align="right" style="right:0px;margin-right:230px;"><font size="5">选择了<font id="count" color="red">0</font>件商品！总共<font id="price" color="red">0.00</font>元</font><a href="javascript:void(0)" onclick="settlement();"><img src="<%=request.getContextPath()%>/image/settlement.png"/></a></div>
</body>
</html>