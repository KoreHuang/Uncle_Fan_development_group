
package com.wiesloch.po;
/**
 * <p>ClassName:OrderExtend</p>
 * <p>Description:</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年5月2日 下午8:18:54 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
public class OrderExtend extends Order{
	private String orderID;
	private String order_state;
	/**
	 * @return the orderID
	 */
	public String getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	
	/**
	 * @return the order_state
	 */
	public String getOrder_state() {
		return order_state;
	}

	/**
	 * @param order_state the order_state to set
	 */
	public void setOrder_state(String order_state) {
		this.order_state = order_state;
	}

	@Override
	public String toString() {
		return "OrderExtend [orderID=" + orderID + ", order_state=" + order_state + "]";
	}

	
}
