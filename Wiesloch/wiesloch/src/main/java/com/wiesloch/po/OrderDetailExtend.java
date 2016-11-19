
package com.wiesloch.po;

/**
 * <p>
 * ClassName:OrderDetailExtend
 * </p>
 * <p>
 * Description:
 * </p>
 * <p>
 * E-mail:jintao_iknow@163.com
 * </p>
 * Date: 2016年4月30日 上午10:18:21 <br/>
 * 
 * @author tao95
 * @version 1.0
 * @since JDK 1.7
 *
 */
public class OrderDetailExtend extends OrderDetail {

	private Integer order_id;
	private String goods_name;
	private String goods_pictureUrl;
	private String picture;
	private long orderID;

	/**
	 * @return the order_id
	 */
	public Integer getOrder_id() {
		return order_id;
	}

	/**
	 * @param order_id
	 *            the order_id to set
	 */
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}

	/**
	 * @return the goods_name
	 */
	public String getGoods_name() {
		return goods_name;
	}

	/**
	 * @param goods_name
	 *            the goods_name to set
	 */
	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	/**
	 * @return the goods_pictureUrl
	 */
	public String getGoods_pictureUrl() {
		return goods_pictureUrl;
	}

	/**
	 * @param goods_pictureUrl
	 *            the goods_pictureUrl to set
	 */
	public void setGoods_pictureUrl(String goods_pictureUrl) {
		this.goods_pictureUrl = goods_pictureUrl;
	}

	/**
	 * @return the orderID
	 */
	public long getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID
	 *            the orderID to set
	 */
	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @param picture
	 *            the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "OrderDetailExtend [order_id=" + order_id + ", goods_name=" + goods_name + ", goods_pictureUrl="
				+ goods_pictureUrl + ", orderID=" + orderID + "]";
	}

}
