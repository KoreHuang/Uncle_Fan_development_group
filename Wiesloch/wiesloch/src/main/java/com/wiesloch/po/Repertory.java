
package com.wiesloch.po;
/**
 * <p>ClassName:Repertory</p>
 * <p>Description:库存表</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年4月29日 下午4:05:30 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
public class Repertory {
	private Integer repertory_id;
	private Integer repertoryDistributor_id;
	private Integer repertoryGoods_id;
	private Integer repertoryAmount;
	private Integer repertoryDistributor_pid;
	private Integer distributor_isDelete;
	/**
	 * @return the repertory_id
	 */
	public Integer getRepertory_id() {
		return repertory_id;
	}
	/**
	 * @param repertory_id the repertory_id to set
	 */
	public void setRepertory_id(Integer repertory_id) {
		this.repertory_id = repertory_id;
	}
	/**
	 * @return the repertoryDistributor_id
	 */
	public Integer getRepertoryDistributor_id() {
		return repertoryDistributor_id;
	}
	/**
	 * @param repertoryDistributor_id the repertoryDistributor_id to set
	 */
	public void setRepertoryDistributor_id(Integer repertoryDistributor_id) {
		this.repertoryDistributor_id = repertoryDistributor_id;
	}
	/**
	 * @return the repertoryGoods_id
	 */
	public Integer getRepertoryGoods_id() {
		return repertoryGoods_id;
	}
	/**
	 * @param repertoryGoods_id the repertoryGoods_id to set
	 */
	public void setRepertoryGoods_id(Integer repertoryGoods_id) {
		this.repertoryGoods_id = repertoryGoods_id;
	}
	/**
	 * @return the repertoryAmount
	 */
	public Integer getRepertoryAmount() {
		return repertoryAmount;
	}
	/**
	 * @param repertoryAmount the repertoryAmount to set
	 */
	public void setRepertoryAmount(Integer repertoryAmount) {
		this.repertoryAmount = repertoryAmount;
	}
	/**
	 * @return the repertoryDistributor_pid
	 */
	public Integer getRepertoryDistributor_pid() {
		return repertoryDistributor_pid;
	}
	/**
	 * @param repertoryDistributor_pid the repertoryDistributor_pid to set
	 */
	public void setRepertoryDistributor_pid(Integer repertoryDistributor_pid) {
		this.repertoryDistributor_pid = repertoryDistributor_pid;
	}
	/**
	 * @return the distributor_is_delete
	 */
	public Integer getDistributor_isDelete() {
		return distributor_isDelete;
	}
	/**
	 * @param distributor_is_delete the distributor_is_delete to set
	 */
	public void setDistributor_isDelete(Integer distributor_isDelete) {
		this.distributor_isDelete = distributor_isDelete;
	}
	@Override
	public String toString() {
		return "Repertory [repertory_id=" + repertory_id + ", repertoryDistributor_id=" + repertoryDistributor_id
				+ ", repertoryGoods_id=" + repertoryGoods_id + ", repertoryAmount=" + repertoryAmount
				+ ", repertoryDistributor_pid=" + repertoryDistributor_pid + ", distributor_isDelete="
				+ distributor_isDelete + "]";
	}
	
}
