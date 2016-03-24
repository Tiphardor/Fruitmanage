<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type='text/css'>
	a{
		color:black;
		text-decoration:none;
	}
	img{ 
    	border-width:0; 
	}
</style>
<title>Insert title here</title>
</head>
<body>
<%
	String orderResult = (String)request.getAttribute("orderResult");
	if(orderResult != null){
		out.print("<script>alert('"+orderResult+"');</script>");
	}
	String addShopcarResult = (String)request.getAttribute("addShopcarResult");
	if(addShopcarResult != null){
		out.print("<script>alert('"+addShopcarResult+"');</script>");
	}
%>
<jsp:include page="top.jsp" flush="true" />
<div style="padding-left:195px;padding-right:195px;"><font size="6" color="blue"><b>本店所有水果：</b></font><br /><hr /></div>
<table align="center">
	<s:iterator id="fruitList" status="st" value="viewFruitList">
		<s:if test="(#st.index)%5==0 && #st.index !=0">
			</tr>
		</s:if>
		<s:if test="(#st.index)%5==0">
			<tr>
				<td>
					<table>
						<tr>
							<td><a href="transToFruitToC.action?id=${id}"><img  width="180" height="180" src="<%=request.getContextPath()%>/file/<s:property value="imageUrl"/>"/></a></td>
						</tr>
						<tr>
							<td>¥<s:property value="fruitPrice"/></td>
						</tr>
						<tr>
							<td width="180"><a href="transToFruitToC.action?id=${id}"><s:property value="fruitLongName"/></a></td>
						</tr>
						<tr>
							<td>总销量：<s:property value="calCount"/></td>
						</tr>
					</table>
				</td>
		</s:if>
		<s:else>
			<td>
				<table>
					<tr>
						<td><a href="transToFruitToC.action?id=${id}"><img  width="180" height="180" src="<%=request.getContextPath()%>/file/<s:property value="imageUrl"/>"/></a></td>
					</tr>
					<tr>
						<td>¥<s:property value="fruitPrice"/></td>
					</tr>
					<tr>
						<td width="180"><a href="transToFruitToC.action?id=${id}"><s:property value="fruitLongName" /></a></td>
					</tr>
					<tr>
						<td>总销量：<s:property value="calCount"/></td>
					</tr>
				</table>
			</td>
		</s:else>
	</s:iterator>
	<tr>
</table>
<!-- <table align="right">
	<tr>
		<td>
			<div align="right" style="right:0px;margin-right:230px;">第几页/共几页&nbsp;上一页&nbsp;下一页</div>
		</td>
	</tr>
</table> -->
<br />
<br />
<div style="padding-left:195px;padding-right:195px;"><font size="6" color="blue"><b>热卖水果：</b></font><br /><hr /></div>
<table align="center">
	<s:iterator id="hotFruitList" status="st" value="hotViewFruitList">
		<s:if test="(#st.index)%5==0 && #st.index !=0">
			</tr>
		</s:if>
		<s:if test="(#st.index)%5==0">
			<tr>
				<td>
					<table>
						<tr>
							<td><a href="transToFruitToC.action?id=${id}"><img  width="180" height="180" src="<%=request.getContextPath()%>/file/<s:property value="imageUrl"/>"/></a></td>
						</tr>
						<tr>
							<td>¥<s:property value="fruitPrice"/></td>
						</tr>
						<tr>
							<td width="180"><a href="transToFruitToC.action?id=${id}"><s:property value="fruitLongName"/></a></td>
						</tr>
						<tr>
							<td>总销量：<s:property value="calCount"/></td>
						</tr>
					</table>
				</td>
		</s:if>
		<s:else>
			<td>
				<table>
					<tr>
						<td><a href="transToFruitToC.action?id=${id}"><img  width="180" height="180" src="<%=request.getContextPath()%>/file/<s:property value="imageUrl"/>"/></a></td>
					</tr>
					<tr>
						<td>¥<s:property value="fruitPrice"/></td>
					</tr>
					<tr>
						<td width="180"><a href="transToFruitToC.action?id=${id}"><s:property value="fruitLongName" /></a></td>
					</tr>
					<tr>
						<td>总销量：<s:property value="calCount"/></td>
					</tr>
				</table>
			</td>
		</s:else>
	</s:iterator>
	<tr>
</table>
</body>
</html>