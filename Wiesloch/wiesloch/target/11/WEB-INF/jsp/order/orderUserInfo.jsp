<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

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
<script type="text/javascript" src="js/head.js"></script>
<link href="css/newcss2.css" type="text/css" rel="stylesheet">
<link href="css/newcss1.css" type="text/css" rel="stylesheet">
<link href="css/head.css" rel="stylesheet" type="text/css">
<script>
 $(function(){
    

        $(".sel1").click(function(){
     
            $(".personInfo").css("display","block");
        });
         $(".sel2").click(function(){

            $(".addressInfo").css("display","block");
        });
    });
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
     input{ margin: 10px;}
    .comm{ width: 100%;
            height: auto;
            padding: 20px;
            margin: 10px 0 ;
            border: 1px solid #ccc;}
    #addInfo,#address{ width: 100%;}
	 button{ width: 20%;
             height: 40px;
             color: #fff;
             background: green;
             text-align: center;
             border: 0;
             margin-left: 5%;
             }
    .btn{ width: 100%;
           padding-left: 20%;}
    .right{ float: right;}

     .addressInfo{ display: none;}
   .personInfo{ display: none;} 

 </style>
</head>
<body>

<div class="mainBody" style="top:40px;">
    <div class="publicHead" id="head">
			<div class="head clearfix">
				<a class="back" href="goods/index.action" ></a>
				<h2 class="headTitle">收货用户信息</h2>
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
    <form action="<%=request.getContextPath()%>/orderDetail/toPayOrder.action" method="post">
    	<c:forEach items="${orderDetailVO.orderDetailList}" var="item" varStatus="status">  
  				<tr>  
  				 <td><input type="hidden" name="orderDetailList[${status.index}].orderDetail_id" value="${item.orderDetail_id}"/></td>
    			 <td><input type="hidden" name="orderDetailList[${status.index}].orderDetail_price" value="${item.orderDetail_price}"/></td>  
     			 <td><input type="hidden" name="orderDetailList[${status.index}].orderDetail_amount" value="${item.orderDetail_amount}"/></td>
 			    </tr>  
		</c:forEach>
			<input type="hidden" name="total_money" value="${orderDetailVO.total_money}" >  
		     <div class="comm">
		        <span class="title">个人信息</span><hr color="#ccc">
		         <p class="sel1">请选择 <span class="right">></span></p>
		        <div class="personInfo" style="display:none">
		             <label for="name">收货人姓名
		                <input type="text" name="userName">
		             </label>
		             <br>
		              <label for="tel">联&nbsp;系&nbsp;方&nbsp;式
		                <input type="text" name="telephone" >
		             </label>
		         </div>
		     </div>
		     <div class="comm">
		        <span class="title">我的收货地址</span><hr color="#ccc">
		         <p class="sel2">请选择 <span class="right">></span></p>
		        <div class="addressInfo" > 
		         <label for="province">省&nbsp;份
		            <input type="text" name="province">
		         </label><br>
		          <label for="city">&nbsp;&nbsp;市&nbsp;&nbsp;&nbsp;
		            <input type="text" name="city">
		         </label><br>
		          <label for="part">区/县
		            <input type="text" name="part">
		         </label><br>
		         <textarea name="minuteAddress" id="minuteAddress" placeholder="详细地址"></textarea>
		      </div>
		     </div>


		     <div class="comm">
		         <span class="title">给卖家留言</span><hr color="#ccc">
		         <textarea name="addInfo" id="addInfo" ></textarea>
		     </div>
		     <div class="btn">
			        <a href=""><button>确认订单</button></a>
			        <a href=""><button>返回</button></a>
   			 </div>
    	</form>

    
   </div>
</body>
</html>