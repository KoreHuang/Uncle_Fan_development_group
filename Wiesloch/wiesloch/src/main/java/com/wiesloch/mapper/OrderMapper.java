
package com.wiesloch.mapper;

import java.util.List;

import com.wiesloch.po.Order;
import com.wiesloch.po.OrderDetail;
import com.wiesloch.po.OrderDetailExtend;

/**
 * <p>ClassName:OrderDetail</p>
 * <p>Description:用户订单的的mapper类</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年4月29日 下午7:55:28 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
public interface OrderMapper {

	public Integer insertOrder(Order order) throws Exception;

}
