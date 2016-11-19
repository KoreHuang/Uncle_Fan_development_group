
package com.wiesloch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiesloch.mapper.OrderDetailMapper;
import com.wiesloch.po.OrderDetail;
import com.wiesloch.po.OrderDetailExtend;

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
@Service("orderDetailService")
public class OrderDetailService {
	@Autowired
	private OrderDetailMapper orderDetailMapper; 
	
	/**
	 * @description 插入到购物车中的数据
	 * @param orderDetail
	 * @return
	 * @throws Exception
	 */
	public Integer insertShopperingCar(OrderDetailExtend orderDetailExtend) throws Exception {
		
		return orderDetailMapper.insertShopperingCar(orderDetailExtend);
	}
	

	/**
	 * @description 从购物车中查找某个用户购物车中的数据
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectShoppingCar(Integer userId) throws Exception{
		
		return orderDetailMapper.selectShoppingCar(userId);
	}
	
	/**
	 * @description 从购物车中删除某个商品数据
	 * @param orderId
	 * @throws Exception
	 */
	public void deleteShoppingCarItemById(Integer orderId) throws Exception{
		orderDetailMapper.deleteShoppingCarItemById(orderId);
	}
	
	/**
	 * @description 当订单插入到数据库以后更新订单明细表的状态
	 * @param orderDetailList
	 * @throws Exception
	 */
	public void updateOrderDeatilState(List<OrderDetailExtend> orderDetailList) throws Exception{
		
		orderDetailMapper.updateOrderDeatilState(orderDetailList);
		
	}
	
	/**
	 * @description 从购物车中查找某个用户购物车中的数据
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectAllOrder(Integer userId) throws Exception{
		
		return orderDetailMapper.selectAllOrder(userId);
	}
	
	
	/**
	 * @description 查询某个用户未付款的订单
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectWaitPayOrder(Integer userId) throws Exception{
		return orderDetailMapper.selectWaitPayOrder(userId);
	}
	
	/**
	 * @description 查询某个用户待收货的订单
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectWaitAcceptOrder(Integer userId) throws Exception{
		return orderDetailMapper.selectWaitAcceptOrder(userId);
	}
	
	/**
	 * @description 查询某个用户已完成的订单
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectCompleteOrder(Integer userId) throws Exception{
		return orderDetailMapper.selectCompleteOrder(userId);
	}
	
	/**
	 * @Description 查询等待支付的订单的数量
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Integer selectWaitPayCount(Integer userId) throws Exception{
		return orderDetailMapper.selectWaitPayCount(userId);
	}
	
	
	/**
	 * @Description 查询等待收货的订单的数量
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Integer selectWaitAcceptCount(Integer userId) throws Exception{
		
		return orderDetailMapper.selectWaitAcceptCount(userId);
	}
	
	
	/**
	 * @Description 查询已完成的订单的数量
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Integer selectCompleteCount(Integer userId) throws Exception{
		return orderDetailMapper.selectCompleteCount(userId);
	}
}
