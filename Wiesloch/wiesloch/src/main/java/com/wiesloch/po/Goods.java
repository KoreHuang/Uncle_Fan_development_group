package com.wiesloch.po;

/**
 * ClassName:Goods<br/>
 * Description:商品表类<br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午4:26:58 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
public class Goods {
	private Integer goods_id;
	private String goods_name;
	private String goods_shortDescription;
	private String goods_longDescription;
	private String goods_pictureUrl;
	private Integer goods_pid;
	private Double goods_price;
	private String goods_status;
	private char goods_isDelete;
	private String goods_level;
	private String goods_norms;
	private Integer goods_points;
	private String goods_active;
	private String pictureUrl;
	
	
	/**
	 * @return the pictureUrl
	 */
	public String getPictureUrl() {
		return pictureUrl;
	}

	/**
	 * @param pictureUrl the pictureUrl to set
	 */
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getGoods_active() {
		return goods_active;
	}

	public void setGoods_active(String goods_active) {
		this.goods_active = goods_active;
	}

	public Integer getGoods_points() {
		return goods_points;
	}

	public void setGoods_points(Integer goods_points) {
		this.goods_points = goods_points;
	}

	public Integer getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public String getGoods_shortDescription() {
		return goods_shortDescription;
	}

	public void setGoods_shortDescription(String goods_shortDescription) {
		this.goods_shortDescription = goods_shortDescription;
	}

	public String getGoods_longDescription() {
		return goods_longDescription;
	}

	public void setGoods_longDescription(String goods_longDescription) {
		this.goods_longDescription = goods_longDescription;
	}

	public String getGoods_pictureUrl() {
		return goods_pictureUrl;
	}

	public void setGoods_pictureUrl(String goods_pictureUrl) {
		this.goods_pictureUrl = goods_pictureUrl;
	}

	public Integer getGoods_pid() {
		return goods_pid;
	}

	public void setGoods_pid(Integer goods_pid) {
		this.goods_pid = goods_pid;
	}

	public Double getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(Double goods_price) {
		this.goods_price = goods_price;
	}

	public String getGoods_status() {
		return goods_status;
	}

	public void setGoods_status(String goods_status) {
		this.goods_status = goods_status;
	}

	public char getGoods_isDelete() {
		return goods_isDelete;
	}

	public void setGoods_isDelete(char goods_isDelete) {
		this.goods_isDelete = goods_isDelete;
	}

	public String getGoods_level() {
		return goods_level;
	}

	public void setGoods_level(String goods_level) {
		this.goods_level = goods_level;
	}

	public String getGoods_norms() {
		return goods_norms;
	}

	public void setGoods_norms(String goods_norms) {
		this.goods_norms = goods_norms;
	}

	@Override
	public String toString() {
		return "Goods [goods_id=" + goods_id + ", goods_name=" + goods_name + ", goods_shortDescription="
				+ goods_shortDescription + ", goods_longDescription=" + goods_longDescription + ", goods_pictureUrl="
				+ goods_pictureUrl + ", goods_pid=" + goods_pid + ", goods_price=" + goods_price + ", goods_status="
				+ goods_status + ", goods_isDelete=" + goods_isDelete + ", goods_level=" + goods_level
				+ ", goods_norms=" + goods_norms + ", goods_points=" + goods_points + ", goods_active=" + goods_active
				+ ", pictureUrl=" + pictureUrl + "]";
	}

	

}
