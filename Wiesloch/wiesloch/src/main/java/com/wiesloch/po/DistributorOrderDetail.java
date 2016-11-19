package com.wiesloch.po;

/**
 * ClassName:DistributorOrderDetail<br/>
 * Description:<br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午4:20:55 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
public class DistributorOrderDetail {
	private Integer distributorOrderDetail_id;
	private Integer distributorOrderDetail_goodsId;
	private Integer distributorOrderDetail_amount;
	private Integer distributorOrderDetail_distributorOrderId;
	private Double distributorOrderDetail_price;
	private char distributorOrderDetail_isCart;
	private char distributorOrderDetail_isDelete;

	public Integer getDistributorOrderDetail_id() {
		return distributorOrderDetail_id;
	}

	public void setDistributorOrderDetail_id(Integer distributorOrderDetail_id) {
		this.distributorOrderDetail_id = distributorOrderDetail_id;
	}

	public Integer getDistributorOrderDetail_goodsId() {
		return distributorOrderDetail_goodsId;
	}

	public void setDistributorOrderDetail_goodsId(Integer distributorOrderDetail_goodsId) {
		this.distributorOrderDetail_goodsId = distributorOrderDetail_goodsId;
	}

	public Integer getDistributorOrderDetail_amount() {
		return distributorOrderDetail_amount;
	}

	public void setDistributorOrderDetail_amount(Integer distributorOrderDetail_amount) {
		this.distributorOrderDetail_amount = distributorOrderDetail_amount;
	}

	public Integer getDistributorOrderDetail_distributorOrderId() {
		return distributorOrderDetail_distributorOrderId;
	}

	public void setDistributorOrderDetail_distributorOrderId(Integer distributorOrderDetail_distributorOrderId) {
		this.distributorOrderDetail_distributorOrderId = distributorOrderDetail_distributorOrderId;
	}

	public Double getDistributorOrderDetail_price() {
		return distributorOrderDetail_price;
	}

	public void setDistributorOrderDetail_price(Double distributorOrderDetail_price) {
		this.distributorOrderDetail_price = distributorOrderDetail_price;
	}

	public char getDistributorOrderDetail_isCart() {
		return distributorOrderDetail_isCart;
	}

	public void setDistributorOrderDetail_isCart(char distributorOrderDetail_isCart) {
		this.distributorOrderDetail_isCart = distributorOrderDetail_isCart;
	}

	public char getDistributorOrderDetail_isDelete() {
		return distributorOrderDetail_isDelete;
	}

	public void setDistributorOrderDetail_isDelete(char distributorOrderDetail_isDelete) {
		this.distributorOrderDetail_isDelete = distributorOrderDetail_isDelete;
	}

	@Override
	public String toString() {
		return "DistributorOrderDetail [distributorOrderDetail_id=" + distributorOrderDetail_id
				+ ", distributorOrderDetail_goodsId=" + distributorOrderDetail_goodsId
				+ ", distributorOrderDetail_amount=" + distributorOrderDetail_amount
				+ ", distributorOrderDetail_distributorOrderId=" + distributorOrderDetail_distributorOrderId
				+ ", distributorOrderDetail_price=" + distributorOrderDetail_price + ", distributorOrderDetail_isCart="
				+ distributorOrderDetail_isCart + ", distributorOrderDetail_isDelete=" + distributorOrderDetail_isDelete
				+ "]";
	}

}
