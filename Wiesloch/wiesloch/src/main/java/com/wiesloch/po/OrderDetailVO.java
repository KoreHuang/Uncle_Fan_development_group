
package com.wiesloch.po;

import java.util.List;

/**
 * <p>ClassName:OrderDetailVO</p>
 * <p>Description:</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年4月30日 下午1:06:56 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
public class OrderDetailVO {
	
	private String userName;
	private String telephone;
	private String send_Address;
	private double total_money;
	private OrderDetailExtend orderDetailExtend;
	private List<OrderDetailExtend> orderDetailList;
	
	
	/**
	 * @return the send_Address
	 */
	public String getSend_Address() {
		return send_Address;
	}
	/**
	 * @param send_Address the send_Address to set
	 */
	public void setSend_Address(String send_Address) {
		this.send_Address = send_Address;
	}
	/**
	 * @return the orderDetailExtend
	 */
	public OrderDetailExtend getOrderDetailExtend() {
		return orderDetailExtend;
	}
	/**
	 * @param orderDetailExtend the orderDetailExtend to set
	 */
	public void setOrderDetailExtend(OrderDetailExtend orderDetailExtend) {
		this.orderDetailExtend = orderDetailExtend;
	}
	/**
	 * @return the orderDetailList
	 */
	public List<OrderDetailExtend> getOrderDetailList() {
		return orderDetailList;
	}
	/**
	 * @param orderDetailList the orderDetailList to set
	 */
	public void setOrderDetailList(List<OrderDetailExtend> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}
	
	/**
	 * @return the total_money
	 */
	public double getTotal_money() {
		return total_money;
	}
	/**
	 * @param total_money the total_money to set
	 */
	public void setTotal_money(double total_money) {
		this.total_money = total_money;
	}
	
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	@Override
	public String toString() {
		return "OrderDetailVO [userName=" + userName + ", telephone=" + telephone + ", send_Address=" + send_Address
				+ ", total_money=" + total_money + ", orderDetailExtend=" + orderDetailExtend + ", orderDetailList="
				+ orderDetailList + "]";
	}
	
	
	
	
}
