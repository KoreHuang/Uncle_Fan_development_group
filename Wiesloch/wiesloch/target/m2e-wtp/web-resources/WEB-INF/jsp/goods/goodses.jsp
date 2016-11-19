<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<link href="<%=request.getContextPath()%>/css/reset.css"
	rel="stylesheet" type="text/css">
<link href="<%=request.getContextPath()%>/css/user.css" rel="stylesheet"
	type="text/css">
<link href="<%=request.getContextPath()%>/css/head.css" rel="stylesheet"
	type="text/css">

<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.1.min.js"></script>
<style id="style-1-cropbar-clipper">/* Copyright 2014 Evernote Corporation. All rights reserved. */
.en-markup-crop-options {
	top: 18px !important;
	left: 50% !important;
	margin-left: -100px !important;
	width: 200px !important;
	border: 2px rgba(255, 255, 255, .38) solid !important;
	border-radius: 4px !important;
}

.en-markup-crop-options div div:first-of-type {
	margin-left: 0px !important;
}

* {
	margin: 0px;
	padding: 0px;
	color: #666;
}

.box {
	width: 100%;
	height: auto;
	margin-top: 40px;
}

hr {
	margin-bottom: 20px;
	color: #ccc;
}

.box input {
	width: 65%;
	height: 30px;
	margin: 5% 5%;
	border-radius: 5px;
	padding-left: 20px;
	border: 1px solid #666;
	float: left;
}

.box button {
	width: 15%;
	height: 30px;
	background: green;
	color: #fff;
	float: left;
	margin-top: 5%;
	border-radius: 5px;
	border: 0;
}

.result {
	color: green;
	width: 100%;
	font-size: 20px;
	margin: auto;
	line-height: 60px;
	text-align: center;
	clear: both;
}

.aPic {
	width: 46%;
	float: left;
	margin: 2%;
}

.aPic img {
	width: 100%;
	height: 160px;
}

.aPic p {
	width: 100%;
	background: #FFC;
	line-height: 30px;
	text-align: center;
}
#bottom{
	width: 100%;
	height: 50px;
	border-top: 1px solid #ccc;
	padding-top: 10px;
	position: fixed;
	bottom: 0px;
	background-color: #FFFFFF;
}

#bottom ul{
	list-style: none;
	width: 90%;
	height: 30px;
	margin: 0 auto;
	min-width: 350px!important;
}
#bottom ul li{
	float: left;
	width: 40px;
	height: 40px;
	margin-left: 13%;
}
#bottom ul li:last-child{
	width: 48px;
}

#bottom ul li:first-child{
	margin-left:5%;
}
#bottom ul li>a{
	display: block;
	width: 90%;
	height: 80%;
	background-size: 700%;
}

#bottom ul li p{
	font-size: 8px;
	color: #AAAAAA;
	text-align: center;
	margin-top: 3px;
}
.nav_0{
	background: url(../img/indexIcon.png) no-repeat 3px -134px;
}
.nav_1{
	background: url(../img/indexIcon.png) no-repeat 8px -170px;
}
.nav_2{
	background: url(../img/indexIcon.png) no-repeat -87px -137px;
}
.nav_3{
	background: url(../img/indexIcon.png) no-repeat -87px -137px;
}
.nav_4{
	background: url(../img/indexIcon.png) no-repeat -160px -168px;
}
</style>
<title>搜索结果</title>

<script type="text/javascript">
	function toDetail(id) {
		window.location.href = "selectGoodsById.action?id=" + id;
	}
	$(function() {
		/*头部导航菜单begin*/
		$('.navBar')
				.toggle(
						function() {
							$('.nav').addClass('on');
							$('section').css('margin-top', '85px');
							if ($('#filter_search') != null
									&& $('#filter_search') != 'undefined') {
								$('#filter_search .filterMask').css('top',
										'135px');
								$('#filter_search .filterFrame').css('top',
										'135px');
							}
						},
						function() {
							$('.nav').removeClass('on');
							$('section').css('margin-top', '40px');
							if ($('#filter_search') != null
									&& $('#filter_search') != 'undefined') {
								$('#filter_search .filterMask').css('top',
										'90px');
								$('#filter_search .filterFrame').css('top',
										'90px');
							}
						});
		/*头部导航菜单end*/
	});
	
	function searchKey(){
		window.location.href = "selectGoodsByName.action?name="+$("#search").val();
	}

	function toDetail(id){
		window.location.href = "selectGoodsById.action?id="+id;
	}
</script>
</head>
<body>
<body>
	<div class="publicHead" id="head">
		<div class="head clearfix">
			<a class="back" href="<%=request.getContextPath()%>/user/Login.action"></a>
			<h2 class="headTitle">商品搜索</h2>
			<a class="navBar" href=""></a>
		</div>
		<ul class="nav">
			<li class="home"><i></i><span>首页</span><a href="<%=request.getContextPath()%>/goods/index.action"></a></li>
			<li class="topsearch"><i></i><span>搜索</span><a href=""></a></li>
			<li class="cart"><i></i><span>购物车</span><a href="<%=request.getContextPath()%>/orderDetail/ShopperingCarView.action"></a></li>
			<li class="commuser"><i></i><span>我的</span><a href="<%=request.getContextPath()%>/user/Login.action"></a></li>
		</ul>
	</div>
	
	<div class="box" style="margin-top: 40px;">
		<div class="input">
			<input type="text" placeholder="请输入您想查询的商品" id="search">
			<button onclick="searchKey()">查询</button>
		</div>
		<p class="result">${msg}</p>
		<hr>
		<div class="show">
			<c:if test="${not empty goodses}">
				<c:forEach items="${goodses }" var="goods">
					<div class='aPic'>
						<a href='javascript:toDetail(${goods.goods_id })'> <img src='${goods.goods_pictureUrl}' alt=''>
							<p style="width:98%; text-overflow:ellipsis;  white-space:nowrap;   overflow:hidden;">${goods.goods_name}</p>
						</a>
					</div>
				</c:forEach>
			</c:if>
			<c:if test="${not empty groom}">
				<c:forEach items="${groom }" var="goods">
					<div class='aPic'>
						<a href='javascript:toDetail(${goods.goods_id })'> <img src='${goods.goods_pictureUrl}' alt=''>
							<p style="width:98%; text-overflow:ellipsis;  white-space:nowrap;   overflow:hidden;">${goods.goods_name}</p>
						</a>
					</div>
				</c:forEach>
			</c:if>
		</div>
		<form></form>
	</div>
	<footer>
		<div id="bottom">
			<ul>
				<li><a href="<%=request.getContextPath()%>/goods/index.action" class="nav_0"></a><p>首页</p></li>
				<li><a href="selectGoodsType.action" class="nav_1"></a><p>分类</p></li>
				<li><a href="<%=request.getContextPath()%>/orderDetail/ShopperingCarView.action" class="nav_3"></a><p>购物车</p></li>
				<li><a href="<%=request.getContextPath()%>/user/Login.action" class="nav_4"></a><p>我的酒仙</p></li>
			</ul>
		</div>
	</footer>
</body>

</html>