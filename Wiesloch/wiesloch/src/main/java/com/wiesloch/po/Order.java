
package com.wiesloch.po;

import java.util.Date;

/**
 * <p>ClassName:Order</p>
 * <p>Description:用户订单</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年4月29日 下午4:17:24 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
public class Order {
	
	private String order_sendUserName;
	private String order_sendTelephone;
	private Integer order_id;
	private String order_address;
	private Date order_createTime;
	private double order_totalPrice;
	private char order_isSend;
	private char order_isDelete;
	private Integer order_userId;
	/**
	 * @return the order_id
	 */
	public Integer getOrder_id() {
		return order_id;
	}
	/**
	 * @param order_id the order_id to set
	 */
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	/**
	 * @return the order_address
	 */
	public String getOrder_address() {
		return order_address;
	}
	/**
	 * @param order_address the order_address to set
	 */
	public void setOrder_address(String order_address) {
		this.order_address = order_address;
	}
	
	/**
	 * @return the order_createTime
	 */
	public Date getOrder_createTime() {
		return order_createTime;
	}
	/**
	 * @param order_createTime the order_createTime to set
	 */
	public void setOrder_createTime(Date order_createTime) {
		this.order_createTime = order_createTime;
	}
	/**
	 * @return the order_totalPrice
	 */
	public double getOrder_totalPrice() {
		return order_totalPrice;
	}
	/**
	 * @param order_totalPrice the order_totalPrice to set
	 */
	public void setOrder_totalPrice(double order_totalPrice) {
		this.order_totalPrice = order_totalPrice;
	}
	/**
	 * @return the order_isSend
	 */
	public char getOrder_isSend() {
		return order_isSend;
	}
	/**
	 * @param order_isSend the order_isSend to set
	 */
	public void setOrder_isSend(char order_isSend) {
		this.order_isSend = order_isSend;
	}
	/**
	 * @return the order_isDelete
	 */
	public char getOrder_isDelete() {
		return order_isDelete;
	}
	/**
	 * @param order_isDelete the order_isDelete to set
	 */
	public void setOrder_isDelete(char order_isDelete) {
		this.order_isDelete = order_isDelete;
	}
	
	
	/**
	 * @return the order_userId
	 */
	public Integer getOrder_userId() {
		return order_userId;
	}
	/**
	 * @param order_userId the order_userId to set
	 */
	public void setOrder_userId(Integer order_userId) {
		this.order_userId = order_userId;
	}
	/**
	 * @return the order_sendUserName
	 */
	public String getOrder_sendUserName() {
		return order_sendUserName;
	}
	/**
	 * @param order_sendUserName the order_sendUserName to set
	 */
	public void setOrder_sendUserName(String order_sendUserName) {
		this.order_sendUserName = order_sendUserName;
	}
	/**
	 * @return the order_sendTelephone
	 */
	public String getOrder_sendTelephone() {
		return order_sendTelephone;
	}
	/**
	 * @param order_sendTelephone the order_sendTelephone to set
	 */
	public void setOrder_sendTelephone(String order_sendTelephone) {
		this.order_sendTelephone = order_sendTelephone;
	}
	@Override
	public String toString() {
		return "Order [order_sendUserName=" + order_sendUserName + ", order_sendTelephone=" + order_sendTelephone
				+ ", order_id=" + order_id + ", order_address=" + order_address + ", order_createTime="
				+ order_createTime + ", order_totalPrice=" + order_totalPrice + ", order_isSend=" + order_isSend
				+ ", order_isDelete=" + order_isDelete + ", order_userId=" + order_userId + "]";
	}
	
	
	
	
}
