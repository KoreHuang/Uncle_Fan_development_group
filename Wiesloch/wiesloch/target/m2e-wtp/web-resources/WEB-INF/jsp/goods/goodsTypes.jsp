<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="apple-mobile-web-app-status-bar-style" content="black">
<link href="<%=request.getContextPath()%>/css/index.css" rel="stylesheet" type="text/css">
<link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css">
<link href="<%=request.getContextPath()%>/css/search.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.1.min.js"></script>
<title>商品分类</title>
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

.menu {
	width: 29%;
	position: fixed;
	margin-top: 50px;
}

.goods {
	width: 70%;
	float: right;
	overflow: hidden;
	margin-top: 50px;
}

.menu ul {
	text-decoration: none;
}

.menu ul li {
	padding: 0.2rem 0 0 0;
}

.first span {
	float: right;
}

.series img {
	width: 48%;
	margin-left: 2%;
	margin-top: 0.2rem;
	float: left;
}

.first {
	text-indent: 2%;
	line-height: 25px;
	font-size: 100%;
}

.first span {
	text-indent: 0;
}

.series {
	margin-top: 0.3rem;
	width: 100%;
	clear: both;
}
#bottom{
	width: 100%;
	border-top: 1px solid #ccc;
	padding-top: 1px;
	position: fixed;
	bottom: 0px;
	background-color: #FFFFFF;
}

#bottom ul{
	list-style: none;
	width: 90%;
	height: 50px;
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
	background: url(<%=request.getContextPath()%>/img/indexIcon.png) no-repeat 3px -134px;
}
.nav_1{
	background: url(<%=request.getContextPath()%>/img/indexIcon.png) no-repeat 8px -170px;
}
.nav_2{
	background: url(<%=request.getContextPath()%>/img/indexIcon.png) no-repeat -87px -137px;
}
.nav_3{
	background: url(<%=request.getContextPath()%>/img/indexIcon.png) no-repeat -87px -137px;
}
.nav_4{
	background: url(<%=request.getContextPath()%>/img/indexIcon.png) no-repeat -160px -168px;
}
</style>
</head>
<link href="<%=request.getContextPath()%>/css/head.css" rel="stylesheet" type="text/css">
<div class="publicHead" id="head">
	<div class="head clearfix">
		<a class="back" href="<%=request.getContextPath()%>/user/Login.action" onclick=""></a>
		<h2 class="headTitle">选酒</h2>
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
<script type="text/javascript">
	/* window.onload = function() {
		var oBtn = document.getElementById('search_goods');
		var oMan = document.getElementById('main1');
		oBtn.onclick = function() {
			oMan.style.display = "none";
		}
	} */
</script>
<script type="text/javascript">
	$(document).ready(
			function() {
				for (var i = 0; i < 12; i++) {
					$('.menu ul li').eq(i).attr('index', i);
					$('.menu ul li').eq(i).click(
							function() {
								var i = $(this).attr('index');
								$(this).css('background', '#c0c0c0').siblings()
										.css('background', '');
								$('.all').css('background', '');
								$('.series').eq(i).css('display', 'block')
										.siblings('.series').css('display',
												'none');
							});
				}
				$('.all').click(function() {
					$(this).css('background', '#c0c0c0');
					$('.menu ul li').css('background', 'none');
					$('.series').css('display', 'block');
				});
			});
</script>
<script type="text/javascript">
	function toSelectGoodsByType(pid,typeName){
		$("#message").empty();
		$("#message").append("<p class='first'>"+
				typeName+"<span><a>更多</a></span>"+
				"</p>"+"<div class='interduce'></div>");
		$.ajax({
			url : "<%=request.getContextPath()%>/goods/selectGoodsByPid.action?pid=" + pid,
			type : "get",
			dataType : "json",
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			success : function(data) {
				console.log(data);
				var i = 1;
				$.each(data, function(name, value) {
					if(i%2 == 1){
						/* $(".interduce").append(
								"<li><img style='height:130px;' onclick='javascript:toDetail("+value.goods_id+")' src="+value.goods_pictureUrl+" /><p>"+value.goods_name+"</p></li>"); */
					
						$(".interduce").append(
								"<div class='pic_1' style='height:85%'>"+
								"<div class='pic_img pic_00' style='background:url(<%=request.getContextPath()%>/../webimages/"+value.pictureUrl+") no-repeat center center; background-size: cover;'>"+
								"<a href='javaScript:toDetail("+value.goods_id+")'></a>"+
								"</div>"+
								"<p>"+value.goods_name+"</p>"+
								"<h3>￥"+value.goods_price+"</h3>"+
							"</div>"
						);
					}else{
						$(".interduce").append(
								"<div class='pic_2' style='height:85%'>"+
								"<div class='pic_img pic_00' style='background:url(<%=request.getContextPath()%>/../webimages/"+value.pictureUrl+") no-repeat center center; background-size: cover;'>"+
									"<a href='javaScript:toDetail("+value.goods_id+")'></a>"+
									"</div>"+
									"<p>"+value.goods_name+"</p>"+
									"<h3>￥"+value.goods_price+"</h3>"+
								"</div>"
							);
					}
					i++;
					
				})
			},
		});
	}
	
	function toDetail(id){
		window.location.href = "<%=request.getContextPath()%>/goods/selectGoodsById.action?id="+id;
	}
	
	function searchKey(){
		var form = document.forms[0];
		form.submit();
	}
</script>

<section class="search clearfix">
<div class="searchFrame">
	<div class="top" id="top"
		style="position: fixed; z-index: 505; width: 100%;">
		<form action="selectGoodsByName.action" method="post" name="selectGoods">
			<div class="searchCon">
				<input type="hidden" name="objectTypes" id="objectTypes_search">
				<input type="text" name="name" id="search_goods" maxlength="60"
					onfocus="javascript:$('#sSpanGoods').text('');"
					onblur="javascript:if($('#search_goods').val() ==''){$('#sSpanGoods').text('巴登系列');}">
				<span id="sSpanGoods">巴登系列</span> 
					<a class="btn" href="javascript:;" onclick="javascript:searchKey()">搜索</a> 
					<input type="hidden" value="" id="search-form-id" size="35" name="search_goods_id">
			</div>
		</form>
	</div>
	<div class="contentFrame" id="main1">
		<div class="menu" oncopy="event.returnValue=false;"
			ondragstart="window.event.returnValue=false"
			oncontextmenu="window.event.returnValue=false"
			onselectstart="event.returnValue=false">
			<div class="all" style="background: #c0c0c0;">商品类别</div>
			<ul class="">
				<c:forEach items="${goodsTypes}" var="type">
					<li><a href="javascript:(0);" onclick="javascript:toSelectGoodsByType(${type.goods_id},'${type.goods_name}')">${type.goods_name }</a></li>
				</c:forEach>
			</ul>
		</div>
		<div class="goods">
			<div class="series" id="message">
			
					<%-- <p class='first'>
						${item.key.goods_name}
						<span><a>更多</a></span>
					</p> --%>
					<div class="interduce">
					<c:forEach items="${goodsList}" var="good" varStatus="status">
						<c:choose>
							<c:when test="${status.index%2 == 0}">
											<div class="pic_1" style='height:85%'>
												<div  class="pic_img pic_00" style="background:url(<%=path%>/../webimages/${good.pictureUrl}) no-repeat center center; background-size: cover;">
												<a href="javaScript:toDetail(${good.goods_id })"></a></div>
												<p>${good.goods_name}</p>
												<h3> ￥${good.goods_price}</h3>
											</div>
							</c:when>
							<c:otherwise>
											<div class="pic_2" style='height:85%'>
												<div  class="pic_img pic_00" style="background:url(<%=path%>/../webimages/${good.pictureUrl}) no-repeat center center; background-size: cover;">
												<a href="javaScript:toDetail(${good.goods_id })"></a></div>
												<p>${good.goods_name}</p>
												<h3> ￥${good.goods_price}</h3>
											</div>
							</c:otherwise>
						</c:choose>
					</c:forEach>
			</div>
		</div>
	</div>
</div>
<div class="filter" id="filter_search">
	<div class="filterMask"></div>
	<div class="filterFrame">
		<div class="hot clearfix">
			<h2>热门搜索：</h2>
			<ul class="hotList clearfix" id="filter_search_hotKey_ul">
			</ul>
		</div>
		<div class="history">
			<h2>搜索历史：</h2>
			<ul class="historyList" id="filter_search_hisKey_ul">
			</ul>
			<a class="btn clear" href="" onclick="clearHisKeys()">清空搜索历史</a>
		</div>
	</div>
</div>
<footer>
		<div id="bottom">
			<ul>
				<li><a href="<%=request.getContextPath()%>/goods/index.action" class="nav_0"></a><p>首页</p></li>
				<li><a href="selectGoodsType.action" class="nav_1"></a><p>分类</p></li>
				<li><a href="<%=request.getContextPath()%>/orderDetail/ShopperingCarView.action" class="nav_3"></a><p>购物车</p></li>
				<li><a href="<%=request.getContextPath()%>/user/Login.action" class="nav_4"></a><p>我的酒仙</p></li>
			</ul>
		</div><br /><br /><br /><br /><br />
	</footer>
</section>
</body>
</html>