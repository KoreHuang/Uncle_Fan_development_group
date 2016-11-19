<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!doctype html>
<html lang="en">
<head>
<base href="<%=basePath%>">
	<meta charset="UTF-8" />
	<title>Document</title>
	<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/css/index.css" />
	<meta charset="UTF-8" />
		<meta name='viewport' content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' />
		<meta name="author" content="www.cktime.net"/>
		<meta content="yes" name="apple-mobile-web-app-capable"/>
		<meta name="apple-mobile-web-app-status-bar-style" content="black"/>
		<meta content="telephone=no,email=no" name="format-detection"/>
		<meta content="yes" name="apple-touch-fullscreen"/>
		<meta content="yes" name="apple-mobile-web-app-capable"/>
		<meta name="App-Config" content="fullscreen=yes,useHistoryState=yes,transition=yes"/>
		<meta name="msapplication-tap-highlight" content="no"/>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.11.3.js"></script>
		<script type="text/javascript" src="<%=request.getContextPath()%>/js/index.js"></script>
</head>
<body>
	<head>
		
		<div id="nav">
			<div class="nav_div">
				<a href="#"></a>
				<div class="nav_input">
					<div class="input_bg"></div>
					<input type="text" value="" />
				</div>
				<input type="button" id="search" value="搜索" />
			</div>
		</div>
	</head>

	<style type="text/css">
	.li_0,.li_7{
		background: url(<%=request.getContextPath()%>/img/lunbo_0.jpg) no-repeat center center;
	}
	.li_1{
		background: url(<%=request.getContextPath()%>/img/lunbo_1.jpg) no-repeat center center;
	}
	.li_2{
		background: url(<%=request.getContextPath()%>/img/lunbo_2.jpg) no-repeat center center;
	}
	.li_3{
		background: url(<%=request.getContextPath()%>/img/lunbo_3.jpg) no-repeat center center;
	}
	.li_4{
		background: url(<%=request.getContextPath()%>/img/lunbo_4.jpg) no-repeat center center;
	}
	.li_5{
		background: url(<%=request.getContextPath()%>/img/lunbo_3.jpg) no-repeat center center;
	}
	.li_6{
		background: url(<%=request.getContextPath()%>/img/lunbo_2.jpg) no-repeat center center;
	}
	#bottom{
	width: 100%;
	height: 70px;
	border-top: 1px solid #ccc;
	padding-top: 10px;
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
	<section>
		<div id="lunbo">
			<ul class="lunbo_ul active">
				<li class="li_0" ><a href="javaScript:void(0)"></a></li>
				<li class="li_1" ><a href="javaScript:void(0)"></a></li>
				<li class="li_2" ><a href="javaScript:void(0)"></a></li>
				<li class="li_3" ><a href="javaScript:void(0)"></a></li>
				<li class="li_4" ><a href="javaScript:void(0)"></a></li>
				<li class="li_5" ><a href="javaScript:void(0)"></a></li>
				<li class="li_6" ><a href="javaScript:void(0)"></a></li>
				<li class="li_7" ><a href="javaScript:void(0)"></a></li>

			
			</ul>
			<div class="btn">
				<ul>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
					<li></li>
				</ul>
			</div>
		</div>

	</section>

	<section>
		<div class="categoryList fl">
		
			<ul class="clearfix">
			<c:forEach items="${goodsTypes}" var="item" varStatus="status"> 
				<li>
					<a href="#">
						<i class="cateIcon" style="background:url(<%=request.getContextPath()%>/img/123.png) no-repeat; background-size:34px 34px;">
						</i>
						<span>${item.goods_name }</span>
					</a>
				</li>
				</c:forEach>
			</ul>
		</div>
	

	<div class="phoneExc fl">
			<div class="title">
				<h3>新品推荐</h3>
		
				<a href="#">
				<span>更多</span><i class="pubIcon"></i></a>
			</div>
			<div class="phoneExcList">
			<ul class="list clearfix" id="mp" style="width: 800px;float:left;">
				<!--最少6个  -->
				<c:forEach items="${resultNewList}" var="item" varStatus="status"> 
					<li style="width: 120px;">
						<a href="<%=request.getContextPath()%>/goods/selectGoodsById.action?id=${item.goods_id }"></a>
							<div class="pic picHeight">
								<img src="<%=path%>/../webimages/${item.pictureUrl}" style="height: 120px;">
							</div>
							<div class="name">
								${item.goods_name} 
							</div>
							<div class="price">
								<strong class="nowPrice_17323" goodid="17323">￥ ${item.goods_price}</strong>
							</div>
					</li>
				</c:forEach> 
			</ul>
		</div>
		



</div>
		<div id="temai" style="background:url(<%=request.getContextPath()%>/img/20c381ff84d746dc9e096a7231b42e54.jpg) no-repeat center center;background-size: cover;"></div>
		<div class="interduce">
			<c:forEach items="${resultHotList}" var="item" varStatus="status"> 

				<c:choose>
				<c:when test="${status.index%2 == 0}">
					<div class="pic_1">
						<div  class="pic_img pic_00" style="background:url(<%=path%>/../webimages/${item.pictureUrl}) no-repeat center center; background-size: cover;">
						<a href="<%=request.getContextPath()%>/goods/selectGoodsById.action?id=${item.goods_id }"></a>
						</div>
						<p>  ${item.goods_name}</p>
						<h3>  ￥${item.goods_price }</h3>
					</div>
				</c:when>
				<c:otherwise>
					
					<div class="pic_2">
						<div  class="pic_img pic_01" style="background:url(<%=path%>/../webimages/${item.pictureUrl}) no-repeat center center;background-size: cover;">
						<a href="<%=request.getContextPath()%>/goods/selectGoodsById.action?id=${item.goods_id }"></a></div>
						<p>  ${item.goods_name}</p>
						<h3>  ￥${item.goods_price }</h3>
					</div>
				</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
		
		<div id="temai" style="background:url(<%=request.getContextPath()%>/img/20c381ff84d746dc9e096a7231b42e54.jpg) no-repeat center center;background-size: cover;"></div>
		<div class="interduce">
			<c:forEach items="${resultRecommendList}" var="item" varStatus="status"> 

				<c:choose>
				<c:when test="${status.index%2 == 0}">
					<div class="pic_1">
						<div  class="pic_img pic_00" style="background:url(<%=path%>/../webimages/${item.pictureUrl}) no-repeat center center; background-size: cover;">
						<a href="<%=request.getContextPath()%>/goods/selectGoodsById.action?id=${item.goods_id }"></a>
						</div>
						<p>  ${item.goods_name}</p>
						<h3>  ￥${item.goods_price }</h3>
					</div>
				</c:when>
				<c:otherwise>
					
					<div class="pic_2">
						<div  class="pic_img pic_01" style="background:url(<%=path%>/../webimages/${item.pictureUrl}) no-repeat center center;background-size: cover;">
						<a href="<%=request.getContextPath()%>/goods/selectGoodsById.action?id=${item.goods_id }"></a>
						</div>
						<p>  ${item.goods_name}</p>
						<h3>  ￥${item.goods_price }</h3>
					</div>
				</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
		
		<div id="temai" style="background:url(<%=request.getContextPath()%>/img/20c381ff84d746dc9e096a7231b42e54.jpg) no-repeat center center;background-size: cover;"></div>
		<div class="interduce">
			<c:forEach items="${resultNewList}" var="item" varStatus="status"> 
				<c:choose>
				<c:when test="${status.index%2 == 0}">
					<div class="pic_1">
						<div  class="pic_img pic_00" style="background:url(<%=path%>/../webimages/${item.pictureUrl}) no-repeat center center; background-size: cover;"><a href="javaScript:void(0)"></a>
						</div>
						<p>  ${item.goods_name}</p>
						<h3>  ￥${item.goods_price }</h3>
					</div>
				</c:when>
				<c:otherwise>
					<div class="pic_2">
						<div  class="pic_img pic_01" style="background:url(<%=path%>/../webimages/${item.pictureUrl}) no-repeat center center;background-size: cover;"><a href="javaScript:void(0)"></a></div>
						<p>  ${item.goods_name}</p>
						<h3>  ￥${item.goods_price }</h3>
					</div>
				</c:otherwise>
				</c:choose>
			</c:forEach>
		</div>
		
		</div>

	</section>
	<div style="height:300px;"></div>
	<footer>
		<div id="bottom">
			<ul>
				<li><a href="<%=request.getContextPath()%>/goods/index.action" class="nav_0"></a><p>首页</p></li>
				<li><a href="<%=request.getContextPath()%>/goods/selectGoodsType.action" class="nav_1"></a><p>分类</p></li>
				<li><a href="<%=request.getContextPath()%>/orderDetail/ShopperingCarView.action" class="nav_3"></a><p>购物车</p></li>
				<li><a href="<%=request.getContextPath()%>/user/Login.action" class="nav_4"></a><p>我的酒仙</p></li>
			</ul>
		</div><br /><br /><br /><br /><br />
	</footer>
	
</body>
</html>