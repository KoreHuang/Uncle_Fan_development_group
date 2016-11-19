
package com.wiesloch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiesloch.mapper.OrderMapper;
import com.wiesloch.po.Order;


/**
 * <p>ClassName:OrderDetailService</p>
 * <p>Description:</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年4月29日 下午8:20:00 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
@Service("orderService")
public class OrderService {
	@Autowired
	private OrderMapper orderMapper; 
	
	public Integer insertOrder(Order order) throws Exception{
		return orderMapper.insertOrder(order);
	}
	
}
