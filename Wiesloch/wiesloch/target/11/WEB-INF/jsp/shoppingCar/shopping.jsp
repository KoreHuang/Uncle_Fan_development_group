<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head lang="en">
<base href="<%=basePath%>">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,height=device-height, user-scalable=no,initial-scale=1, minimum-scale=1, maximum-scale=1">
    <title>购物车</title>
    <link rel="stylesheet" href="css/shopping.css"/>
    <link href="css/head.css" rel="stylesheet" type="text/css">
    <script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
    <script type="text/javascript" src="js/qxsp.js"></script>
    <script type="text/javascript" src="js/head.js"></script>
</head>
<body>
	<div class="body">
		<div class="publicHead" id="head">
			<div class="head clearfix">
				<a class="back" href="goods/index.action" ></a>
				<h2 class="headTitle">选酒</h2>
				<a class="navBar" href=""></a>
			</div>
			<ul class="nav">
				<li class="home"><i></i><span>首页</span><a href="goods/index.action"></a></li>
					<li class="topsearch"><i></i><span>搜索</span><a href=""></a></li>
					<li class="cart"><i></i><span>购物车</span><a href="orderDetail/ShopperingCarView.action"></a></li>
					<li class="commuser"><i></i><span>我的</span><a href="user/Login.action"></a></li>
			</ul>
		</div>
	
	    <form action="<%=request.getContextPath()%>/orderDetail/toPayForAddressView.action" method="post">
	        <div class="spxz">
	        <c:forEach items="${shoppingCarList}" var="item" varStatus="status">  
	 			    <ul class="main">
	 			    	<input type="hidden" name="orderDetailList[${status.index}].orderDetail_id" value="${item.orderDetail_id}"/>
	 			    	<input type="hidden" name="orderDetailList[${status.index}].orderDetail_price" value="${item.orderDetail_price}"/>
				        <li class="li1"><input type="checkbox" onclick="javascript:total(this);" value="${item.orderDetail_id}" name="orderDetailList[${status.index}].orderDetail_id"/></li>
				        <li class="li2"><a href="spxq.html"><img src="${item.goods_pictureUrl}" alt="" style="width: 60px;height: 60px"/></a></li>
				        <li class="li3">
				        	<p style="width:100%; text-overflow:ellipsis;  white-space:nowrap;   overflow:hidden;">${item.goods_name}</p>
				   
				        	<span style="color: red" >￥</span>
				        	<input type="text" name="orderDetailList[${status.index}].orderDetail_price" value="${item.orderDetail_price}" class="one" disabled="disabled">
				       	</li>
				        <li class="li4">
				        	<div >
				        		<a class="reduce" onclick="javascript:editNumSub(this);">-</a>
				        			<input type="text" name ="orderDetailList[${status.index}].orderDetail_amount" value="${item.orderDetail_amount}" class="num"/>
				        		<a class="plus" onclick="javascript:editNumAdd(this);">+</a>
				        		<a class="deleteItem" href="deleteShoppingCarItemById.action?orderId=${item.orderDetail_id}"></a>
				        	</div>
				        </li>
	   				 </ul>
			</c:forEach>  
	    
		</div>
	
			<div class="footing">
	    		<ul>
			        <li class="li5"><input type="checkbox" id="checkbox" value="1" onclick="javascript:totalAllSelect(this);" />全选</li>
			        <li class="li6">合计：<span class="red">￥<input  id ="totalMoney" type="text" name="total_money"  style="border-left:0px;border-top:0px;border-right:0px;border-bottom:0px;background-color:#ccc;font-size:10pm; " disabled="disabled"></span></li>
			        <li class="li7"><input type="submit" class="submit" value="结算" onclick="javascript:return checkOrderState(this);"></li>
	    		</ul>
			</div>
		</form>
	</div>
</body>
</html>