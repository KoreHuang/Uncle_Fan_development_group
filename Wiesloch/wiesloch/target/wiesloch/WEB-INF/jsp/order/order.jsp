<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<title>订单</title>
<link href="css/head.css" rel="stylesheet" type="text/css">
<link href="css/reset.css" rel="stylesheet" type="text/css">
<link href="css/order.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
<style id="style-1-cropbar-clipper">
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
.menu{width: 29%;position: fixed;margin-top:50px;}
.goods{width: 70%;float: right;overflow: hidden;margin-top:50px;}
.menu ul{text-decoration: none;}
.menu ul li{padding: 0.2rem 0 0 0;}
.first span{float: right;}
.series img{width: 48%;margin-left: 2%;margin-top:0.2rem;float: left;}
.first{text-indent: 2%;line-height: 25px;font-size: 100%;}
.first span{text-indent: 0;}
.series{margin-top: 0.3rem;width: 100%;clear:both;}
</style>
</head>
<body>

   

<div class="publicHead" id="head">
      <div class="head clearfix">
      <a class="back" href="<%=request.getContextPath()%>/user/Login.action" onclick=""></a>
      <h2 class="headTitle">${pageName}</h2>
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
	$(function() {
		/*头部导航菜单begin*/
		$('.navBar').toggle(
				function() {
					$('.nav').addClass('on');
					$('section').css('margin-top', '85px');
					if ($('#filter_search') != null
							&& $('#filter_search') != 'undefined') {
						$('#filter_search .filterMask').css('top', '135px');
						$('#filter_search .filterFrame').css('top', '135px');
					}
				},
				function() {
					$('.nav').removeClass('on');
					$('section').css('margin-top', '40px');
					if ($('#filter_search') != null
							&& $('#filter_search') != 'undefined') {
						$('#filter_search .filterMask').css('top', '90px');
						$('#filter_search .filterFrame').css('top', '90px');
					}
				});
		/*头部导航菜单end*/
	});
</script>



  <div class="box">
    
    <c:forEach items="${resultList}" var="item" varStatus="status">  
    <div class="list">

      <div class="state">
         <div class="sLeft">
          <p>
            <span class="sta1">订单号：</span>
            <span class="sta2">${item.orderID}</span>
          </p>
           <p>
            <span class="sta1">下单时间：</span>
            <span class="sta2">
            	<fmt:formatDate value="${item.orderDetail_date }" pattern="yyyy-MM-dd HH:mm:ss"/>
            </span>
          </p>
           <p>
            <span class="sta1">订单状态：</span>
            <span class="sta2">${item.orderDetail_isPay }</span>
            <c:if test="${item.orderDetail_isPay == '0' }">
   					 <span class="sta2">未付款</span>
			</c:if>
			<c:if test="${item.orderDetail_isPay == '1' }">
   					 <span class="sta2">已付款,待收货</span>
			</c:if>
			<c:if test="${item.orderDetail_isPay == '2' }">
   					 <span class="sta2">已收货</span>
			</c:if>
          </p>
         
          </div>
          <div class="sRight">
            <p><a href=""><b>详情></b></a></p>
          </div>
           <hr>
      </div>

      <div class="good">
          <div class="gLeft">
            <img src="<%=path%>/../webimages/${item.goods_pictureUrl}" alt="">
          </div>
        <div class="gMain">
            <p>【新品特卖】</p>
            <p>${goods_name}</p>
        </div>
        <div class="gRight">

            <p class="color1">￥${item.orderDetail_price}</p>
            <p>x${item.orderDetail_amount}</p>
        </div>
        
      </div>
       <div class="count">
            <span>订单金额</span>
            <span class="color2">￥${item.orderDetail_price * item.orderDetail_amount}</span>
        </div>
      
    </div>
	</c:forEach>

   <!--   <div class="list">

      <div class="state">
         <div class="sLeft">
          <p>
            <span class="sta1">订单号：</span>
            <span class="sta2">1244234254434</span>
          </p>
           <p>
            <span class="sta1">下单时间：</span>
            <span class="sta2">12-12-2</span>
          </p>
           <p>
            <span class="sta1">订单状态：</span>
            <span class="sta2">取消</span>
          </p>
         
          </div>
          <div class="sRight">
            <p><a href=""><b>详情></b></a></p>
          </div>
           <hr>
      </div>

      <div class="good">
          <div class="gLeft">
            <img src="" alt="">
          </div>
        <div class="gMain">
            <p>【新品特卖】</p>
            <p>40°法国大班保罗VSOP白兰地700ml</p>
        </div>
        <div class="gRight">

            <p class="color1">￥100.00</p>
            <p>x1</p>
        </div>
        
      </div>
       <div class="count">
            <span>订单金额</span>
            <span class="color2">￥123.00</span>
        </div>
      
    </div>



 <div class="list">

      <div class="state">
         <div class="sLeft">
          <p>
            <span class="sta1">订单号：</span>
            <span class="sta2">1244234254434</span>
          </p>
           <p>
            <span class="sta1">下单时间：</span>
            <span class="sta2">12-12-2</span>
          </p>
           <p>
            <span class="sta1">订单状态：</span>
            <span class="sta2">取消</span>
          </p>
         
          </div>
          <div class="sRight">
            <p><a href=""><b>详情></b></a></p>
          </div>
           <hr>
      </div>

      <div class="good">
          <div class="gLeft">
            <img src="" alt="">
          </div>
        <div class="gMain">
            <p>【新品特卖】</p>
            <p>40°法国大班保罗VSOP白兰地700ml</p>
        </div>
        <div class="gRight">

            <p class="color1">￥100.00</p>
            <p>x1</p>
        </div>
        
      </div>
       <div class="count">
            <span>订单金额</span>
            <span class="color2">￥123.00</span>
        </div>
      
    </div>
 -->

  </div>

</body>
</html>