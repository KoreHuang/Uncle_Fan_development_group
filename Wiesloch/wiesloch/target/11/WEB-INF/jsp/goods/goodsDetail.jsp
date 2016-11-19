
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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.7.1.min.js"></script>
<link href="<%=request.getContextPath()%>/css/reset1.css"
	rel="stylesheet" type="text/css">
<link href="<%=request.getContextPath()%>/css/head.css" rel="stylesheet"
	type="text/css">
<link href="<%=request.getContextPath()%>/css/goods.css"
	rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品详情</title>
<style id="style-1-cropbar-clipper">
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
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.7.1.min.js"></script>
<title>商品详情</title>

<script type="text/javascript">

	function toShoppingCar(goods_id,goods_price){
		var goods_amount = $("#amount").val();
		window.location.href = "<%=request.getContextPath()%>/orderDetail/insertShopperingCar.action?orderDetail_goodsId="+goods_id+"&orderDetail_amount="+goods_amount+"&orderDetail_price="+goods_price;
	}
	function toBuyGoods(goods_id,goods_price){
		var goods_amount = $("#amount").val();
		window.location.href = "<%=request.getContextPath()%>/orderDetail/insertOrderDetail.action?orderDetail_goodsId="+goods_id+"&orderDetail_amount="+goods_amount+"&orderDetail_price="+goods_price;
	}
	function minus() {
		var value = $("#amount").val();
		if (Number(value) <= 0) {
			$("#amount").val(0);
		} else {
			$("#amount").val(Number(value) - 1);
		}
	}

	function add() {
		var value = $("#amount").val();
		$("#amount").val(Number(value) + 1);
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
			$(".content2").hide();
			$(".content1").show();
			$(".tab1").click(function() {
				$(".content1").show();
				$(".tab1 p").css("color", "green");
				$(".tab2 p").css("color", "#ccc");
				$(".content2").hide();

			});
			$(".tab2").click(function() {
				$(".content1").hide();
				$(".content2").show();
				$(".tab2 p").css("color", "green");
				$(".tab1 p").css("color", "#ccc");
				$(".tab1 span").hide();
			});
		});
	</script>
</head>
<body>
	<div class="publicHead" id="head">
		<div class="head clearfix">
			<a class="back" href="<%=request.getContextPath()%>/user/Login.action"></a>
			<h2 class="headTitle">商品详情</h2>
			<a class="navBar" href="javascript:;"></a>
		</div>
		<ul class="nav">
			<li class="home"><i></i><span>首页</span><a href=""></a></li>
			<li class="topsearch"><i></i><span>搜索</span><a href=""></a></li>
			<li class="cart"><i></i><span>购物车</span><a href=""></a></li>
			<li class="commuser"><i></i><span>我的</span><a href=""></a></li>
		</ul>
	</div>
	
	<div class="box">
		<div class="top">
			<div class="pic">
				<img src="${ goods.goods_pictureUrl}" alt=""> 
				<img src="${ goods.goods_pictureUrl}" alt=""> 
				<img src="${ goods.goods_pictureUrl}" alt=""> 
				<img src="${ goods.goods_pictureUrl}" alt=""> 
				<img src="${ goods.goods_pictureUrl}" alt="">
			</div>
			<div class="aBtn">
				<button></button>
				<button></button>
				<button></button>
				<button></button>
				<button></button>
			</div>
			<div class="top_2">
				<div class="pro1 produce">
					<span>【商品全名】</span></br> <span>${goods.goods_name }</span>
				</div>
				<div class="pro1 money">
					￥<span>${goods.goods_price }</span>
				</div>
				<div class="pro1 grade">
					<p>
						积分:<b>${goods.goods_points }</b>
					</p>
				</div>
				<div class="pro1 count">
					<span></span>
					<button onclick="javascript:minus()">-</button>
					<input type="text" value="1" id="amount">
					<button onclick="javascript:add()">+</button>
				</div>
				<div class="sale">
					<p class="sLeft">${goods.goods_active }</p>
				</div>
			</div>
		</div>
		<div class="main">
			<h2>商品详情</h2>
			<p>${goods.goods_shortDescription }</p>
			<p class="info">温馨提示</p>
			<p>根据新修订的《商标法》及国家工商总局最新文件要求，2014年5月1日之后不得将“驰名商标”字样用于商品宣传，酒仙网依法对商品图片中含“驰名商标”字样做马赛克处理；同时，涉及厂家正在按照新规定逐步更换包装，在此期间，我们将对新旧包装货品随机发货，请以实际收到的货物为准。给您带来的不便，敬请谅解。</p>
			<p class="info">商品特点</p>
			<p>请以收到的实物为准，给您带来的不便敬请谅解！ ​ 产品详情正在更新，请期待..</p>
			<p class="info">产品展示</p>
		</div>
		<div class="pictures">
			<img src="${ goods.goods_pictureUrl}" alt="">
		</div>
		<div class="pictures">
			<img src="${ goods.goods_pictureUrl}" alt="">
		</div>
		<div class="pictures">
			<img src="${ goods.goods_pictureUrl}" alt="">
		</div>
		<div class="pictures">
			<img src="${ goods.goods_pictureUrl}" alt="">
		</div>
	</div>
	<div class="footer">
		<div class="shop">
			<a href="javascript:toShoppingCar(${goods.goods_id},${goods.goods_price })"><button>加入购物车</button></a>
		</div>
		<div class="buy">
			<a href="javascript:toBuyGoods(${goods.goods_id},${goods.goods_price })"><button>立即购买</button></a>
		</div>
	</div>
</body>
</html>