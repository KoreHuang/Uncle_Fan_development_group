<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Expires" content="0"> 
<meta http-equiv="Cache-Control" content="no-cache"> 
<meta http-equiv="Pragma" content="no-cache">
<title></title>

<script src="js/jquery-1.7.1.min.js" type="text/javascript"></script>
<script src="js/head.js" type="text/javascript"></script>
<link href="css/newcss2.css" type="text/css" rel="stylesheet">
<link href="css/newcss1.css" type="text/css" rel="stylesheet">
<link href="css/order2.css" type="text/css" rel="stylesheet">
<link href="css/head.css" type="text/css" rel="stylesheet">
<script>
    var backpage = function(){
        if(history.length==0){
           /*  window.location.href='http://m.jiuxian.com/mjava_statics'; */
        }else{
            history.back();
        }
    };
</script>

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

    *{ margin: 0px;
       padding: 0px;
       font-size: 14px;
       line-height: 25px;
       }
     hr{ margin: 5px 0;}
    .title{ font-size: 16px;line-height: 40px;}
    .main{ width: 90%;
           height: auto;
          margin: 20px auto;
          
        }
    .comm{ width: 100%;
            height: auto;
            padding: 20px;
            margin: 10px 0 ;
            border: 1px solid #ccc;}
     #sel{ width: 100%;
           height: 35px;
           margin-top: 20px;}
  
    .cLeft{ width: 70%;
           float: left;}
    .cEight{ width: 30%;
             text-align: right;
             float: right;}
     .return{ width: 30%;
              height: 40px;
              background: green;
              border: 0;
             }
    .ret{ width: 100%;
          padding-left: 35%;
          margin: 0 auto;}
 </style>
</head>
<body>

<div class="mainBody" style="top:55px;">
    <div class="publicHead" id="head">
			<div class="head clearfix">
				<a class="back" href="goods/index.action" ></a>
				<h2 class="headTitle">选酒</h2>
				<a class="navBar" href=""></a>
			</div>
			<ul class="nav" style="top:0px;">
				<li class="home"><i></i><span>首页</span><a href="goods/index.action"></a></li>
					<li class="topsearch"><i></i><span>搜索</span><a href=""></a></li>
					<li class="cart"><i></i><span>购物车</span><a href="orderDetail/ShopperingCarView.action"></a></li>
					<li class="commuser"><i></i><span>我的</span><a href="user/Login.action"></a></li>
			</ul>
	</div>

    <div class="main">
    <form action="<%=request.getContextPath() %>/orderDetail/allOrder.action">
     
     <p class="munber">
        <span class="title">订单号：</span>
        <b>${orderExtend.orderID}</b>
     </p>

     <p class="state">
        <span class="title">订单状态：</span>
        <span>${orderExtend.order_state}</span>
     </p>

     <div class="info comm">
         <p class="title">订单跟踪</p><hr color="#ccc">
         <p>
            <p><%=(new java.util.Date()).toLocaleString()%></p>
            <p>您的订单已提交，${orderExtend.order_state}</p>
         </p>
     </div>

     <div class="rpeo comm">
         <p class="title">收货人信息</p><hr color="#ccc">
         <p>
         	<p>${orderExtend.order_sendUserName}</p>
            <span>${orderExtend.order_sendTelephone}</span>
            <p>${orderExtend.order_address}</p>
         </p>
        
     </div>

     <div class="pWay comm">
         <p class="title">支付方式</p><hr color="#ccc">
         <p>在线支付</p>
     </div>
     <div class="ret">
         <button class="return">确认</button>
     </div>
    </form>
   </div>
</body>
</html>>