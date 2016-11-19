
package com.wiesloch.util;

import java.security.MessageDigest;

/**
 * 
 * ClassName:MD5Util<br/>
 * Description:MD5加密工具类 采用32位大写表示<br/>
 * E-mail:weijianyututu@163.com <br/>
 * Date: 2016年4月29日 下午4:53:07 <br/>
 * 
 * @author SevenKey
 * @version 1.0
 * @since JDK 1.7
 *
 */
public class MD5Util {
	/**
	 * 获取加密后的md5
	 * 
	 * @param message
	 *            要加密的信息
	 * @return 返回加密之后的信息
	 */
	public static String getMD5String(String message) {
		String md5str = "";
		try {
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			byte[] input = message.getBytes();
			byte[] buff = md5.digest(input);
			md5str = bytesToHex(buff);
		} catch (Exception e) {

		}
		return md5str;
	}

	/**
	 * 二进制转十六进制
	 * 
	 * @param bytes
	 *            要转换的二进制数组
	 * @return 转换后的十六进制
	 */
	private static String bytesToHex(byte[] bytes) {
		StringBuffer md5str = new StringBuffer();
		int digital;
		for (int i = 0; i < bytes.length; i++) {
			digital = bytes[i];
			if (digital < 0) {
				digital += 256;
			}
			if (digital < 16) {
				md5str.append("0");
			}
			md5str.append(Integer.toHexString(digital));
		}
		return md5str.toString().toUpperCase();
	}
}
