
package com.wiesloch.mapper;

import java.util.List;

import com.wiesloch.po.OrderDetail;
import com.wiesloch.po.OrderDetailExtend;

/**
 * <p>ClassName:OrderDetail</p>
 * <p>Description:用户订单明细的的mapper类</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年4月29日 下午7:55:28 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
public interface OrderDetailMapper {

	
	/**
	 * @description 插入到购物车中的数据
	 * @param orderDetail
	 * @return
	 * @throws Exception
	 */
	public Integer insertShopperingCar(OrderDetailExtend orderDetailExtend) throws Exception;
	
	/**
	 * @description 从购物车中查找某个用户购物车中的数据
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectShoppingCar(Integer userId) throws Exception;
	
	
	/**
	 * @description 从购物车中删除某个商品数据
	 * @param orderId
	 * @throws Exception
	 */
	public void deleteShoppingCarItemById(Integer orderId) throws Exception;
	
	/**
	 * @description 当订单插入到数据库以后更新订单明细表的状态
	 * @param orderDetailList
	 * @throws Exception
	 */
	public void updateOrderDeatilState(List<OrderDetailExtend> orderDetailList) throws Exception;
	
	/**
	 * @description 从购物车中查找某个用户购物车中的数据
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectAllOrder(Integer userId) throws Exception;
	
	/**
	 * @description 查询某个用户未付款的订单
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectWaitPayOrder(Integer userId) throws Exception;
	
	/**
	 * @description 查询某个用户待收货的订单
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectWaitAcceptOrder(Integer userId) throws Exception;
	
	/**
	 * @description 查询某个用户已完成的订单
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public List<OrderDetailExtend> selectCompleteOrder(Integer userId) throws Exception;
	
	/**
	 * @Description 查询等待支付的订单的数量
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Integer selectWaitPayCount(Integer userId) throws Exception;
	
	
	/**
	 * @Description 查询等待收货的订单的数量
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Integer selectWaitAcceptCount(Integer userId) throws Exception;
	
	
	/**
	 * @Description 查询已完成的订单的数量
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public Integer selectCompleteCount(Integer userId) throws Exception;
}
