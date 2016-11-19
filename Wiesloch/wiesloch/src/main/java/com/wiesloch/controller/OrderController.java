
package com.wiesloch.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wiesloch.po.Order;
import com.wiesloch.po.OrderDetailVO;
import com.wiesloch.po.User;
import com.wiesloch.service.OrderService;

/**
 * <p>ClassName:OrderController</p>
 * <p>Description:用来实现订单的controller</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年5月2日 下午3:20:02 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	/**
	 * @description 插入订单的功能
	 * @param request
	 * @param modelAndView
	 * @param orderDetailVO
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/insertOrder", method = { RequestMethod.POST, RequestMethod.GET })
	public ModelAndView insertOrder(HttpServletRequest request) throws Exception{
		
		
		OrderDetailVO orderDetailVO = (OrderDetailVO)request.getAttribute("orderDetailVO");
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute("user");
		Order order = new Order();
		order.setOrder_userId(user.getUser_id());
		order.setOrder_address(orderDetailVO.getSend_Address());
		order.setOrder_totalPrice(orderDetailVO.getTotal_money());
		order.setOrder_createTime(new Date());
		order.setOrder_sendUserName(orderDetailVO.getUserName());
		order.setOrder_sendTelephone(orderDetailVO.getTelephone());
		orderService.insertOrder(order);
		
		
		String url = "forward:/orderDetail/updateOrderDetail.action";
		ModelAndView modelAndView = new ModelAndView(url);
		request.setAttribute("orderDetailVO", orderDetailVO);
		request.setAttribute("order", order);
		return modelAndView;
		
	}
	
}
