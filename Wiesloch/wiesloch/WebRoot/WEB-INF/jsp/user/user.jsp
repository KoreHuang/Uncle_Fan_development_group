<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">



<link href="css/reset.css" rel="stylesheet" type="text/css">
<link href="css/user.css" rel="stylesheet" type="text/css">
<link href="css/head.css" rel="stylesheet" type="text/css">
  

<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<script type="text/javascript" src="js/head.js"></script>


<style id="style-1-cropbar-clipper">/* Copyright 2014 Evernote Corporation. All rights reserved. */
.en-markup-crop-options {
    top: 18px !important;
    left: 50% !important;
    margin-left: -100px !important;
    width: 200px !important;
    border: 2px rgba(255,255,255,.38) solid !important;
    border-radius: 4px !important;
}

.en-markup-crop-options div div:first-of-type {
    margin-left: 0px !important;
}
</style></head>
<body>
    
		
		


<div class="publicHead" id="head">
	    <div class="head clearfix">
			<a class="back" href="<%=request.getContextPath()%>/user/Login.action" ></a>
			<h2 class="headTitle">个人中心</h2>
            <a class="navBar" href=""></a>
        </div>

        
        <ul class="nav">
            <li class="home"><i></i><span>首页</span><a href="<%=request.getContextPath()%>/goods/index.action"></a></li>
			<li class="topsearch"><i></i><span>搜索</span><a href=""></a></li>
			<li class="cart"><i></i><span>购物车</span><a href="<%=request.getContextPath()%>/orderDetail/ShopperingCarView.action"></a></li>
			<li class="commuser"><i></i><span>我的</span><a href="<%=request.getContextPath()%>/user/Login.action"></a></li>
        </ul>
	</div>
<script>
 $(function(){
     $.ajax({
    	 type:'post',
    	 url:"orderDetail/selectOrderState.action",
    	 dataType : "json",
		 contentType : "application/x-www-form-urlencoded; charset=utf-8",
    	 success:function(data){
    		 console.log(data)
    		 console.log(data[0]+" "+data[1]+" "+data[2]);
    		 $("#waitPay").text(data[0]);
    		 $("#waitAccept").text(data[1]);
    		 $("#complete").text(data[2]);
    	 }
     })
    });
 
 	var backpage = function(){
 		if(history.length==0){
 			//window.location.href='http://m.jiuxian.com';
 		}else{
 			history.back();
 		}
 	};
 
 
 
  </script>
		
	
    
    <section class="userCenter clearfix" id="top">
        <div class="userInfo clearfix">
            <img class="bg" src="<%=request.getContextPath()%>/img/topBg.jpg">
            <div class="userDetail">
                <div class="userPhoto">
                    <div class="mask"></div>
                    <img src="http://120.27.93.175/imgs/pic_0.jpg">
                </div>
                <div class="info">
                    <p class="userName">${sessionScope.user.user_name}</p>
                </div>
            </div>
            <div class="order">
                <p class="grade">LV1 酒虫</p>
                <div class="orderStatus">
                    <a href="orderDetail/waitPayOrderDetail.action"><strong id="waitPay">0</strong><span>待付款</span></a>
                    <a href="orderDetail/waitAcceptOrderDetail.action"><strong id="waitAccept">0</strong><span>待收货</span></a>
                    <a href="orderDetail/completeOrderDetail.action"><strong id="complete">0</strong><span>已完成</span></a>
                    <span class="line line1"></span>
                    <span class="line line2"></span>
                    <span class="line line3"></span>
                </div>
            </div>
        </div>
        <div class="contentFrame">
            <ul class="list clearfix">
                
            	<li><a class="orderList" href="orderDetail/allOrder.action"><img src="img/order.png"><span>全部订单</span></a></li>
                <li><a class="cartList" href="orderDetail/ShopperingCarView.action"><img src="img/cart.png"><span>购物车</span></a></li>
               
                <li><a class="coupon" href=""><img src="img/coupon.png"><span>我的优惠券</span></a></li>
              
		        <li><a class="wallet" href=""><img src="img/wallet.png"><span>我的钱包</span></a></li>
		        <li><a class="exchange" href=""><img src="img/exchange.png"><span>积分兑换</span></a></li>
		        <li><a class="address" href=""><img src="img/address.png"><span>地址管理</span></a></li>
                	
                
            </ul>
        </div>
         
         	
         	
         	
        
         	
         
    </section>

 	<a href="" class="btn" id="xmlogout">退出登录</a>

</body></html>