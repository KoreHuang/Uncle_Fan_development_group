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
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">


<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.7.1.min.js"></script>


<link href="<%=request.getContextPath()%>/css/reset1.css" rel="stylesheet" type="text/css">

    <link href="<%=request.getContextPath()%>/css/reset.css" rel="stylesheet" type="text/css">
    <link href="<%=request.getContextPath()%>/css/login.css" rel="stylesheet" type="text/css">
    <link href="<%=request.getContextPath()%>/css/alert.css" rel="stylesheet" type="text/css">
<title>用户登录</title><style id="style-1-cropbar-clipper">/* Copyright 2014 Evernote Corporation. All rights reserved. */
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
    
<link href="<%=request.getContextPath()%>/css/head.css" rel="stylesheet" type="text/css">

<div class="publicHead" id="head">
	    <div class="head clearfix">
			<a class="back" href="" ></a>
			<h2 class="headTitle">用户登录</h2>
            <a class="navBar" href="javascript:;"></a>
        </div>
        <ul class="nav">
            <li class="home"><i></i><span>首页</span><a href=""></a></li>
            <li class="topsearch"><i></i><span>搜索</span><a href=""></a></li>
            <li class="cart"><i></i><span>购物车</span><a href=""></a></li>
            <li class="commuser"><i></i><span>我的</span><a href=""></a></li>
        </ul>
	</div>
<script>
 $(function(){
        /*头部导航菜单begin*/
        $('.navBar').toggle(
            function(){
                $('.nav').addClass('on');
                $('section').css('margin-top','85px');
                if($('#filter_search') !=null && $('#filter_search') !='undefined'){
                	$('#filter_search .filterMask').css('top','135px');
        			$('#filter_search .filterFrame').css('top','135px');
                }
            },
            function(){
                $('.nav').removeClass('on');
                $('section').css('margin-top','40px');
                if($('#filter_search') !=null && $('#filter_search') !='undefined'){
                	$('#filter_search .filterMask').css('top','90px');
        			$('#filter_search .filterFrame').css('top','90px');
                }
            }
        );
        /*头部导航菜单end*/

        $(".tab1").click(function(){

        	$(".content1").show();
        	$(".tab1 p").css("color","#6F6");
        	$(".tab2 p").css("color","#666");
        	$(".content2").hide();

        });
        $(".tab2").click(function(){

        	$(".content1").hide();
        	$(".content2").show();
        	$(".tab2 p").css("color","#6F6");
        	$(".tab1 p").css("color","#666");
        	$(".tab1 span").hide();

        });
    });
 

 
  </script>
    
    <section class="login">
        <input type="hidden" id="basePath" value="">
        <ul class="tab">
			<li class="tab1 on">
                <p>账号登录</p>
                <span></span>
            </li>
			<li class="tab2">
                <p>注册</p>
                <span></span>
            </li>
        </ul>
        <div class="content">
            <div class="content1">
<!--             用户账号登陆模块开始 -->
				<form action="user/Login.action" method="post" onsubmit="">
	                <div class="user">
	                    <i></i>
	                    <input type="text" name="user_account" id="user_name" placeholder="用户名/邮箱/手机号">
						<p class="tip empty" id="err_msg"><i></i>请输入用户名/邮箱/手机号</p>
	                </div>
	                <div class="pwd">
	                    <i></i>
	                    <input type="password" name="user_password" id="pass" placeholder="密码">
	                    <p class="tip"><i></i>请输入密码</p>
	                </div>
	                <input type="submit" class="btn"  id="subbtn1" value="立即登录"/>
	                </form>
	<!--            用户账号 登陆模块结束 -->
	                <div class="serve clearfix">
	                    <a class="getpwd" href="">找回密码</a>
	                </div>
	 <!--           联合登陆 开始-->               
	                <div class="partnerLogin">
	                    <div class="title">
	                        <div class="line"></div>
	                        <div class="partner">合作伙伴登录</div>
	                    </div>
	                    <ul class="choose clearfix">

	                        <li><a href="" class="qq"></a></li>
	                        <li><a href="" class="alipay"></a></li>
	                    </ul>
	                </div>
 <!--           联合登陆结束 --> 
 				</form> 
            </div>
  <!--           注册模块 -->  
            <div class="content2">
            	<form action="user/Register.action" method="post">
	                <div class="tel">
	                    <i></i>
	                    <input name="user_account" type="text" id="iphone" placeholder="请输入手机号码">
	                        <p class="tip empty"><i></i>请输入手机号</p>
	                        <p class="tip error"><i></i>请输入正确的手机号</p>
	                </div>
	                <div class="identify">
	                    <input name="user_name" type="text" id="security_code" placeholder="用户名">
	                </div>
	                 <div class="pwd">
	                    <i></i>
	                    <input name="user_password" type="password"  id="pass" placeholder="密码">
	                    <p class="tip"><i></i>请输入密码</p>
	                </div>
	                <div class="pwd">
	                    <i></i>
	                    <input type="password" name="" id="" placeholder="确认密码">
	                    <p class="tip"><i></i>确认密码</p>
	                </div>
	                <input type="submit" class="btn" id="subbtn2" value="立即注册"/>
         		</form>       
            </div>
<!--           手机动态登陆 -->  
        </div>
    </section>


<input type="hidden" id="codeCount" value="">
<input type="hidden" id="mobileCodeCount" value="">






</body></html>
