
package com.wiesloch.po;
/**
 * <p>ClassName:User</p>
 * <p>Description:用户表</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年4月29日 下午3:56:06 <br/>
 * @author   tao95
 * @version  1.1
 * @since    JDK 1.7
 *
 */
public class User {
	private Integer user_id;
	private String user_name;
	private String user_account;
	private String user_password;
	private Integer user_points;
	private String user_level;
	private String user_address;
	private char user_isDelete;
	/**
	 * @return the user_id
	 */
	public Integer getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	
	/**
	 * @return the user_account
	 */
	public String getUser_account() {
		return user_account;
	}
	/**
	 * @param user_account the user_account to set
	 */
	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}
	/**
	 * @return the user_password
	 */
	public String getUser_password() {
		return user_password;
	}
	/**
	 * @param user_password the user_password to set
	 */
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	/**
	 * @return the user_points
	 */
	public Integer getUser_points() {
		return user_points;
	}
	/**
	 * @param user_points the user_points to set
	 */
	public void setUser_points(Integer user_points) {
		this.user_points = user_points;
	}
	/**
	 * @return the user_level
	 */
	public String getUser_level() {
		return user_level;
	}
	/**
	 * @param user_level the user_level to set
	 */
	public void setUser_level(String user_level) {
		this.user_level = user_level;
	}
	/**
	 * @return the user_address
	 */
	public String getUser_address() {
		return user_address;
	}
	/**
	 * @param user_address the user_address to set
	 */
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	/**
	 * @return the user_isDelete
	 */
	public char getUser_isDelete() {
		return user_isDelete;
	}
	/**
	 * @param user_isDelete the user_isDelete to set
	 */
	public void setUser_isDelete(char user_isDelete) {
		this.user_isDelete = user_isDelete;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_account=" + user_account
				+ ", user_password=" + user_password + ", user_points=" + user_points + ", user_level=" + user_level
				+ ", user_address=" + user_address + ", user_isDelete=" + user_isDelete + "]";
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	
}
