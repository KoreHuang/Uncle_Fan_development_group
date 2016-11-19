package com.wiesloch.util;

import javax.servlet.http.Cookie;

public class CookiesUtil {
	public static Cookie addCookies(String name, String value, int expiry) {
		Cookie cookie = new Cookie(name, value);
		cookie.setMaxAge(expiry);
		return cookie;
	}
}
