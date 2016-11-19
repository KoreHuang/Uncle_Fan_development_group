
package com.wiesloch.po;
/**
 * <p>ClassName:SendUserInfo</p>
 * <p>Description:订单用户发送信息的中间VO</p>
 * <p> E-mail:jintao_iknow@163.com </p>
 * Date:     2016年5月1日 下午11:16:41 <br/>
 * @author   tao95
 * @version  1.0
 * @since    JDK 1.7
 *
 */
public class SendUserInfoVO {
	private String userName;
	private String telephone;
	private String province;
	private String city;
	private String part;
	private String minuteAddress;
	private String addInfo;
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
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the part
	 */
	public String getPart() {
		return part;
	}
	/**
	 * @param part the part to set
	 */
	public void setPart(String part) {
		this.part = part;
	}
	/**
	 * @return the minuteAddress
	 */
	public String getMinuteAddress() {
		return minuteAddress;
	}
	/**
	 * @param minuteAddress the minuteAddress to set
	 */
	public void setMinuteAddress(String minuteAddress) {
		this.minuteAddress = minuteAddress;
	}
	/**
	 * @return the addInfo
	 */
	public String getAddInfo() {
		return addInfo;
	}
	/**
	 * @param addInfo the addInfo to set
	 */
	public void setAddInfo(String addInfo) {
		this.addInfo = addInfo;
	}
	@Override
	public String toString() {
		return "SendUserInfo [userName=" + userName + ", telephone=" + telephone + ", province=" + province + ", city="
				+ city + ", part=" + part + ", minuteAddress=" + minuteAddress + ", addInfo=" + addInfo + "]";
	}
	
	
	
}
