package com.wiesloch.po;

/**
 * 
 * ClassName:Distributor <br/>
 * Description:分销商类基本字段信息 <br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午4:07:37 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
public class Distributor {
	private Integer distributor_id;
	private String distributor_name;
	private String distributor_account;
	private String distributor_password;
	private String distributor_tel;
	private Integer distributor_pid;
	private char distributor_type;
	private char distributor_status;
	private char distributor_isDelete;

	public Integer getDistributor_id() {
		return distributor_id;
	}

	public void setDistributor_id(Integer distributor_id) {
		this.distributor_id = distributor_id;
	}

	public String getDistributor_name() {
		return distributor_name;
	}

	public void setDistributor_name(String distributor_name) {
		this.distributor_name = distributor_name;
	}

	public String getDistributor_account() {
		return distributor_account;
	}

	public void setDistributor_account(String distributor_account) {
		this.distributor_account = distributor_account;
	}

	public String getDistributor_password() {
		return distributor_password;
	}

	public void setDistributor_password(String distributor_password) {
		this.distributor_password = distributor_password;
	}

	public String getDistributor_tel() {
		return distributor_tel;
	}

	public void setDistributor_tel(String distributor_tel) {
		this.distributor_tel = distributor_tel;
	}

	public Integer getDistributor_pid() {
		return distributor_pid;
	}

	public void setDistributor_pid(Integer distributor_pid) {
		this.distributor_pid = distributor_pid;
	}

	public char getDistributor_type() {
		return distributor_type;
	}

	public void setDistributor_type(char distributor_type) {
		this.distributor_type = distributor_type;
	}

	public char getDistributor_status() {
		return distributor_status;
	}

	public void setDistributor_status(char distributor_status) {
		this.distributor_status = distributor_status;
	}

	public char getDistributor_isDelete() {
		return distributor_isDelete;
	}

	public void setDistributor_isDelete(char distributor_isDelete) {
		this.distributor_isDelete = distributor_isDelete;
	}

	@Override
	public String toString() {
		return "Distributor [distributor_id=" + distributor_id + ", distributor_name=" + distributor_name
				+ ", distributor_account=" + distributor_account + ", distributor_password=" + distributor_password
				+ ", distributor_tel=" + distributor_tel + ", distributor_pid=" + distributor_pid
				+ ", distributor_type=" + distributor_type + ", distributor_status=" + distributor_status
				+ ", distributor_isDelete=" + distributor_isDelete + "]";
	}

}

