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
	function buy(id,count,totalPrice){
		params="fruitId="+id+"&count="+count+"&totalPrice="+totalPrice;
		window.location.href="commitOrder.action?"+params;
	}
	function alterUser(id,realName,phone,address,postcode){
		$("#alterUser").empty();
		$("#alterUser").append("<div>"+realName+"（收）&nbsp;<input id='phone' size='15' name='phone' value="+phone+" >&nbsp;&nbsp;&nbsp;&nbsp;<input id='address' size='40' name='address' value="+address+" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input id='postcode' size='8' name='postcode' value="+postcode+" ></div>");
		$("#reAlter").empty();
		$("#reAlter").append("<a href='javascript:void(0)' onclick='reAlterUser("+id+");'>提交修改</a>");	
	}
	function reAlterUser(id)
	{
		var phone = document.getElementById("phone").value;
		var address = document.getElementById("address").value;
		var postcode = document.getElementById("postcode").value;
		$.ajax({
			url: 'alterUserInfo.action',
	        type: 'post',
	        data:{'id':id,'phone':phone,'address':address,'postcode':postcode},
	        dataType: 'json',
	        error: function(){
				alert("请求错误");
	        },
	        success: function(viewUser){
	        	var id = viewUser.id;
	        	var realName = viewUser.realName;
	        	var phone = viewUser.phone;
	        	var address = viewUser.address;
	        	var postcode = viewUser.postcode;
	        	$("#alterUser").empty();
	        	$("#alterUser").append("<div>"+realName+"（收）&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+phone+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+address+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+postcode+"</div>");
	        	$("#reAlter").empty();
	        	$("#reAlter").append('<a href="javascript:void(0)" onclick="alterUser('+"'"+id+"','"+realName+"','"+phone+"','"+address+"','"+postcode+"'"+');">修改</a>');
	        }
		});
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
<div style="padding-left:230px;padding-right:230px;"><font size="6" color="blue">编辑收件地址：</font><br /><hr /></div>
<table align="center">
	<tr>
		<td width="700px" id="alterUser"><div>${user.realName}（收）&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${user.phone}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${user.address}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${user.postcode}</div></td>
		<td id="reAlter"><a href="javascript:void(0)" onclick="alterUser('${user.id}','${user.realName}','${user.phone}','${user.address}','${user.postcode}');">修改</a></td>
	</tr>
</table>
<div style="padding-left:230px;padding-right:230px;"><font size="6" color="blue">确认订单信息：</font><br /><hr /></div>
<table align="center">
	<tr>
		<td colspan="2" width="380px">店铺：阿甘水果店</td>
		<td width="120px">单价（元）</td>
		<td width="100px">数量</td>
		<td width="100px">优惠</td>
		<td width="100px">小计（元）</td>
	</tr>
	<tr>
		<td><img width="50" height="50" src="<%=request.getContextPath()%>/file/<s:property value="viewFruit.imageUrl" />" /></td>
		<td width="340"><font size="3" color="blue">${viewFruit.fruitLongName}</font><br />
		    <font size="2" color="gray">此商品不支持7天无理由退货！</font></td>
		<td>${viewFruit.fruitPrice}</td>
		<td>${buyCount}</td>
		<td>-</td>
		<td>${totalPrice}</td>
	</tr>
</table>
<div style="padding-left:230px;padding-right:230px;"><hr /></div>
<div align="right" style="right:0px;margin-right:230px;"><a href="javascript:void(0)" onclick="buy('${viewFruit.id}','${buyCount}','${totalPrice}');"><img src="<%=request.getContextPath()%>/image/submit.png"/></a></div>
</body>
</html>