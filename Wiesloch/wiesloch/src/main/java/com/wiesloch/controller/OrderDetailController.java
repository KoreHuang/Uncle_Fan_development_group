
package com.wiesloch.controller;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.wiesloch.po.Order;
import com.wiesloch.po.OrderDetail;
import com.wiesloch.po.OrderDetailExtend;
import com.wiesloch.po.OrderDetailVO;
import com.wiesloch.po.OrderExtend;
import com.wiesloch.po.SendUserInfoVO;
import com.wiesloch.po.User;
import com.wiesloch.service.OrderDetailService;



/**
 * <p>ClassName:OrderDetailController</p>
 * <p> Description:用户订单明细和购物车</p>
 * <p>E-mail:jintao_iknow@163.com </p>
 * Date: 2016年4月29日 下午8:30:00 <br/>
 * 
 * @author tao95
 * @version 1.0
 * @since JDK 1.7
 *
 */
@Controller
@RequestMapping("/orderDetail")
public class OrderDetailController {

	@Autowired
	private OrderDetailService orderDetailService;

	/**
	 * @description 从购物车中查找某个用户购物车中的数据
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/ShopperingCarView", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView selectShopperingCar(HttpServletRequest request) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		Integer userId = 1;
		if(user != null){
			userId = user.getUser_id();
		}
		List<OrderDetailExtend> shoppingCarList = orderDetailService.selectShoppingCar(userId);
		for (OrderDetailExtend orderDetailExtend : shoppingCarList) {
			String [] pictures = orderDetailExtend.getGoods_pictureUrl().split(";");
			orderDetailExtend.setPicture(pictures[0]);
		}
		modelAndView.addObject("shoppingCarList", shoppingCarList);
		modelAndView.setViewName("shoppingCar/shopping");
		return modelAndView;
	}
	
	
	/**
	 * @description 加入购物车中一条商品信息
	 * @param request
	 * @param orderDetail
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/insertShopperingCar", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView insertShopperingCar(HttpServletRequest request, OrderDetailExtend orderDetailExtend) throws Exception {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		orderDetailExtend.setOrderDetail_userId(user.getUser_id());
		orderDetailExtend.setOrderDetail_isPay('0');
		orderDetailExtend.setOrderDetail_isCart('1');
		orderDetailExtend.setOrderDetail_isDelete('0');
		orderDetailExtend.setOrderDetail_date(new Date());
		orderDetailService.insertShopperingCar(orderDetailExtend);
		String url = "redirect:/orderDetail/ShopperingCarView.action";
		ModelAndView modelAndView = new ModelAndView(url);
		return modelAndView;
	}
	/**
	 * @description 去购买时先插入订单明细中一条商品信息，再转到添加用户收货时的信息
	 * @param request
	 * @param orderDetailExtend
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/insertOrderDetail", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView insertOrderDetail(HttpServletRequest request,OrderDetailExtend orderDetailExtend) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		orderDetailExtend.setOrderDetail_userId(user.getUser_id());
		orderDetailExtend.setOrderDetail_isPay('0');
		orderDetailExtend.setOrderDetail_isCart('0');
		orderDetailExtend.setOrderDetail_isDelete('0');
		orderDetailExtend.setOrderDetail_date(new Date());
		orderDetailService.insertShopperingCar(orderDetailExtend);
		List<OrderDetailExtend> orderDetailList = new ArrayList<OrderDetailExtend>();
		orderDetailList.add(orderDetailExtend);
		OrderDetailVO orderDetailVO = new OrderDetailVO();
		orderDetailVO.setOrderDetailList(orderDetailList);
		System.out.println(orderDetailVO+"-------------->");
		modelAndView.addObject("orderDetailVO", orderDetailVO);
		modelAndView.setViewName("order/orderUserInfo");
		return modelAndView;
	}
	/**
	 * @description 从购物车中删除某个数据
	 * @param request
	 * @param orderId
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/deleteShoppingCarItemById", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView deleteShoppingCarItemById(HttpServletRequest request,Integer orderId)throws Exception{
		ModelAndView modelAndView;
		System.out.println(orderId);
		orderDetailService.deleteShoppingCarItemById(orderId);
		modelAndView = selectShopperingCar(request);
		return modelAndView;
	}
	/**
	 * @description 去送货地址页面
	 * @param request
	 * @param orderDetailVO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/toPayForAddressView", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView toPayForAddressView(HttpServletRequest request,OrderDetailVO orderDetailVO ) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		List<OrderDetailExtend> orderDetailList = orderDetailVO.getOrderDetailList();
		System.out.println(orderDetailVO.getOrderDetailList());
		modelAndView.addObject("orderDetailVO", orderDetailVO);
		modelAndView.setViewName("order/orderUserInfo");
		return modelAndView;
		
	}
	
	/**
	 * @description 去结算付款之后并将订单插入订单表
	 * @param request
	 * @param orderDetailVO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/toPayOrder", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView toPayOrder(HttpServletRequest request,OrderDetailVO orderDetailVO,SendUserInfoVO sendUserInfo ) throws Exception{
		List<OrderDetailExtend> orderDetailList = orderDetailVO.getOrderDetailList();
		double total_money = 0;
		for (OrderDetailExtend orderDetailExtend : orderDetailList) {
			total_money += orderDetailExtend.getOrderDetail_price()*orderDetailExtend.getOrderDetail_amount();
		}
		orderDetailVO.setTotal_money(total_money);
		String sendAddress = sendUserInfo.getProvince()+sendUserInfo.getCity()+sendUserInfo.getPart()+sendUserInfo.getMinuteAddress();
		orderDetailVO.setSend_Address(sendAddress);
		orderDetailVO.setUserName(sendUserInfo.getUserName());
		orderDetailVO.setTelephone(sendUserInfo.getTelephone());
		String url = "forward:/order/insertOrder.action";
		ModelAndView modelAndView = new ModelAndView(url);
		request.setAttribute("orderDetailVO", orderDetailVO);
		return modelAndView;
	}
	
	/**
	 * @description 当订单支付后，修改订单明细的状态
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/updateOrderDetail", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView updateOrderDetail(HttpServletRequest request) throws Exception{
		
		ModelAndView modelAndView = new ModelAndView();
		OrderDetailVO orderDetailVO = (OrderDetailVO) request.getAttribute("orderDetailVO");
		Order order = (Order) request.getAttribute("order");
		List<OrderDetailExtend> orderDetailList = orderDetailVO.getOrderDetailList();
		for (OrderDetailExtend orderDetailExtend : orderDetailList) {
			orderDetailExtend.setOrder_id(order.getOrder_id());
		}
		orderDetailService.updateOrderDeatilState(orderDetailList);
		Date date = order.getOrder_createTime();
		String orderID = order.getOrder_id()+date.getTime()+"";
		String Address = order.getOrder_address();
		
		OrderExtend orderExtend = new OrderExtend();
		System.out.println(orderExtend.getOrder_isSend()+"-------------------->");
		if(orderExtend.getOrder_isSend() == '1'){
			
			orderExtend.setOrder_state("已发货");
		}else{
			orderExtend.setOrder_state("等待发货");
		}
		orderExtend.setOrder_address(order.getOrder_address());
		orderExtend.setOrder_sendTelephone(order.getOrder_sendTelephone());
		orderExtend.setOrder_sendUserName(order.getOrder_sendUserName());
		orderExtend.setOrderID(orderID);
		modelAndView.addObject("orderExtend", orderExtend);
		modelAndView.setViewName("/order/orderInfo");
		return modelAndView;
	}
	/**
	 * @description 查询全部的订单
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("allOrder")
	public ModelAndView allOrderDetail(HttpServletRequest request)throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		List<OrderDetailExtend> resultList = orderDetailService.selectAllOrder(user.getUser_id());
		for (OrderDetailExtend orderDetailExtend : resultList) {
			orderDetailExtend.setOrderID(orderDetailExtend.getOrderDetail_id()+orderDetailExtend.getOrderDetail_date().getTime());
			
			System.out.println(orderDetailExtend.getOrderDetail_isPay());
		}
		
		modelAndView.addObject("pageName","全部订单");
		modelAndView.addObject("resultList", resultList);
		modelAndView.setViewName("/order/order");
		return modelAndView;
	}
	/**
	 * @description 查询待支付订单
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("waitPayOrderDetail")
	public ModelAndView waitPayOrderDetail(HttpServletRequest request) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		List<OrderDetailExtend> resultList = orderDetailService.selectWaitPayOrder(user.getUser_id());
		for (OrderDetailExtend orderDetailExtend : resultList) {
			orderDetailExtend.setOrderID(orderDetailExtend.getOrderDetail_id()+orderDetailExtend.getOrderDetail_date().getTime());
			System.out.println(orderDetailExtend);
		}
		modelAndView.addObject("pageName","待支付的订单");
		modelAndView.addObject("resultList", resultList);
		modelAndView.setViewName("/order/order");
		return modelAndView;
		
	}
	
	
	/**
	 * @description 查询待收货订单
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("waitAcceptOrderDetail")
	public ModelAndView waitAcceptOrderDetail(HttpServletRequest request) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		List<OrderDetailExtend> resultList = orderDetailService.selectWaitAcceptOrder(user.getUser_id());
		for (OrderDetailExtend orderDetailExtend : resultList) {
			orderDetailExtend.setOrderID(orderDetailExtend.getOrderDetail_id()+orderDetailExtend.getOrderDetail_date().getTime());
			System.out.println(orderDetailExtend);
		}
		modelAndView.addObject("pageName","待收货的订单");
		modelAndView.addObject("resultList", resultList);
		modelAndView.setViewName("/order/order");
		return modelAndView;
		
	}
	
	/**
	 * @description 查询已完成订单
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("completeOrderDetail")
	public ModelAndView completeOrderDetail(HttpServletRequest request) throws Exception{
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		List<OrderDetailExtend> resultList = orderDetailService.selectCompleteOrder(user.getUser_id());
		for (OrderDetailExtend orderDetailExtend : resultList) {
			orderDetailExtend.setOrderID(orderDetailExtend.getOrderDetail_id()+orderDetailExtend.getOrderDetail_date().getTime());
			System.out.println(orderDetailExtend);
		}
		modelAndView.addObject("pageName","已完成的订单");
		modelAndView.addObject("resultList", resultList);
		modelAndView.setViewName("/order/order");
		return modelAndView;
		
	}
	/**
	 * @description 查询每个用户的各种状态的订单数量
	 * @param request
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping(value = "/selectOrderState", method = { RequestMethod.POST,
			RequestMethod.GET }, produces = "text/html;charset=UTF-8")
	public void selectOrderState(HttpServletRequest request,HttpServletResponse response) throws Exception{
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		Integer waitPayCount = orderDetailService.selectWaitPayCount(user.getUser_id());
		Integer waitAcceptCount = orderDetailService.selectWaitAcceptCount(user.getUser_id());
		Integer CompleteCount = orderDetailService.selectCompleteCount(user.getUser_id());
		List<Integer> resultList = new ArrayList<Integer>();
		resultList.add(waitPayCount);
		resultList.add(waitAcceptCount);
		resultList.add(CompleteCount);
		String json = JSON.toJSONString(resultList);
		PrintWriter pw = response.getWriter();
		pw.write(json);
		
	}
}
