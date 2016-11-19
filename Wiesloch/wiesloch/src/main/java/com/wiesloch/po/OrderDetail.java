
package com.wiesloch.po;

import java.util.Date;

/**
 * <p>
 * ClassName:OrderDetail
 * </p>
 * <p>
 * Description:用户订单明细
 * </p>
 * <p>
 * E-mail:jintao_iknow@163.com
 * </p>
 * Date: 2016年4月29日 下午4:21:16 <br/>
 * 
 * @author tao95
 * @version 1.0
 * @since JDK 1.7
 *
 */
public class OrderDetail {

	private Integer orderDetail_id;
	private Integer orderDetail_goodsId;
	private Integer orderDetail_userId;
	private Integer orderDetail_amount;
	private Double orderDetail_price;
	private char orderDetail_isPay;
	private char orderDetail_isCart;
	private char orderDetail_isDelete;
	private char orderDetail_isComplete;
	private Integer orderDetail_orderId;
	private Date orderDetail_date;
	
	
	/**
	 * @return the orderDetail_date
	 */
	public Date getOrderDetail_date() {
		return orderDetail_date;
	}

	/**
	 * @param orderDetail_date the orderDetail_date to set
	 */
	public void setOrderDetail_date(Date orderDetail_date) {
		this.orderDetail_date = orderDetail_date;
	}

	public Integer getOrderDetail_id() {
		return orderDetail_id;
	}

	public void setOrderDetail_id(Integer orderDetail_id) {
		this.orderDetail_id = orderDetail_id;
	}

	public Integer getOrderDetail_goodsId() {
		return orderDetail_goodsId;
	}

	public void setOrderDetail_goodsId(Integer orderDetail_goodsId) {
		this.orderDetail_goodsId = orderDetail_goodsId;
	}

	public Integer getOrderDetail_userId() {
		return orderDetail_userId;
	}

	public void setOrderDetail_userId(Integer orderDetail_userId) {
		this.orderDetail_userId = orderDetail_userId;
	}

	public Integer getOrderDetail_amount() {
		return orderDetail_amount;
	}

	public void setOrderDetail_amount(Integer orderDetail_amount) {
		this.orderDetail_amount = orderDetail_amount;
	}

	public Double getOrderDetail_price() {
		return orderDetail_price;
	}

	public void setOrderDetail_price(Double orderDetail_price) {
		this.orderDetail_price = orderDetail_price;
	}

	public char getOrderDetail_isPay() {
		return orderDetail_isPay;
	}

	public void setOrderDetail_isPay(char orderDetail_isPay) {
		this.orderDetail_isPay = orderDetail_isPay;
	}

	public char getOrderDetail_isCart() {
		return orderDetail_isCart;
	}

	public void setOrderDetail_isCart(char orderDetail_isCart) {
		this.orderDetail_isCart = orderDetail_isCart;
	}

	public char getOrderDetail_isDelete() {
		return orderDetail_isDelete;
	}

	public void setOrderDetail_isDelete(char orderDetail_isDelete) {
		this.orderDetail_isDelete = orderDetail_isDelete;
	}
	public Integer getOrderDetail_orderId() {
		return orderDetail_orderId;
	}
	public void setOrderDetail_orderId(Integer orderDetail_orderId) {
		this.orderDetail_orderId = orderDetail_orderId;
	}
	
	/**
	 * @return the orderDetail_isComplete
	 */
	public char getOrderDetail_isComplete() {
		return orderDetail_isComplete;
	}

	/**
	 * @param orderDetail_isComplete the orderDetail_isComplete to set
	 */
	public void setOrderDetail_isComplete(char orderDetail_isComplete) {
		this.orderDetail_isComplete = orderDetail_isComplete;
	}

	@Override
	public String toString() {
		return "OrderDetail [orderDetail_id=" + orderDetail_id + ", orderDetail_goodsId=" + orderDetail_goodsId
				+ ", orderDetail_userId=" + orderDetail_userId + ", orderDetail_amount=" + orderDetail_amount
				+ ", orderDetail_price=" + orderDetail_price + ", orderDetail_isPay=" + orderDetail_isPay
				+ ", orderDetail_isCart=" + orderDetail_isCart + ", orderDetail_isDelete=" + orderDetail_isDelete
				+ ", orderDetail_isComplete=" + orderDetail_isComplete + ", orderDetail_orderId=" + orderDetail_orderId
				+ ", orderDetail_date=" + orderDetail_date + "]";
	}

	


}
