package com.wiesloch.po;

/**
 * ClassName:DistributorOrder<br/>
 * Description: 分销商订单表信息<br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午4:12:40 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
public class DistributorOrder {
	private Integer distributorOrder_id;
	private Integer distributorOrder_outDistributorId;
	private Integer distributorOrder_inDistributorId;
	private String distributorOrder_createTime;
	private Double distributorOrder_totalPrice;
	private char distributorOrder_isPay;
	private char distributorOrder_isDelete;

	public Integer getDistributorOrder_id() {
		return distributorOrder_id;
	}

	public void setDistributorOrder_id(Integer distributorOrder_id) {
		this.distributorOrder_id = distributorOrder_id;
	}

	public Integer getDistributorOrder_outDistributorId() {
		return distributorOrder_outDistributorId;
	}

	public void setDistributorOrder_outDistributorId(Integer distributorOrder_outDistributorId) {
		this.distributorOrder_outDistributorId = distributorOrder_outDistributorId;
	}

	public Integer getDistributorOrder_inDistributorId() {
		return distributorOrder_inDistributorId;
	}

	public void setDistributorOrder_inDistributorId(Integer distributorOrder_inDistributorId) {
		this.distributorOrder_inDistributorId = distributorOrder_inDistributorId;
	}

	public String getDistributorOrder_createTime() {
		return distributorOrder_createTime;
	}

	public void setDistributorOrder_createTime(String distributorOrder_createTime) {
		this.distributorOrder_createTime = distributorOrder_createTime;
	}

	public Double getDistributorOrder_totalPrice() {
		return distributorOrder_totalPrice;
	}

	public void setDistributorOrder_totalPrice(Double distributorOrder_totalPrice) {
		this.distributorOrder_totalPrice = distributorOrder_totalPrice;
	}

	public char getDistributorOrder_isPay() {
		return distributorOrder_isPay;
	}

	public void setDistributorOrder_isPay(char distributorOrder_isPay) {
		this.distributorOrder_isPay = distributorOrder_isPay;
	}

	public char getDistributorOrder_isDelete() {
		return distributorOrder_isDelete;
	}

	public void setDistributorOrder_isDelete(char distributorOrder_isDelete) {
		this.distributorOrder_isDelete = distributorOrder_isDelete;
	}

	@Override
	public String toString() {
		return "DistributorOrder [distributorOrder_id=" + distributorOrder_id + ", distributorOrder_outDistributorId="
				+ distributorOrder_outDistributorId + ", distributorOrder_inDistributorId="
				+ distributorOrder_inDistributorId + ", distributorOrder_createTime=" + distributorOrder_createTime
				+ ", distributorOrder_totalPrice=" + distributorOrder_totalPrice + ", distributorOrder_isPay="
				+ distributorOrder_isPay + ", distributorOrder_isDelete=" + distributorOrder_isDelete + "]";
	}

}
