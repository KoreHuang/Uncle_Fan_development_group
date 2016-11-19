package com.wiesloch.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.wiesloch.po.User;
import com.wiesloch.service.UserService;

/**
 * 
 * Title: HasLoginInterceptor
 * 
 * @Description:登录校验，在pre方法中
 * @author Raccoon
 * @date 2016-5-1 上午10:07:36
 */
public class HasLoginInterceptor implements HandlerInterceptor {
	@Autowired
	private UserService userService;

	/**
	 * 进入Handler之前执行：用于身份认证
	 */
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse resp, Object arg2) throws Exception {
		Object user = request.getSession().getAttribute("user");
		if (user != null) {
			return true;
		}
		// 免登录
		if (request.getCookies() != null) {
			String user_account = "";
			String user_password = "";
			for (Cookie cookie : request.getCookies()) {
				if ("user_password".equals(cookie.getName())) {
					user_password = cookie.getValue();
				} else if ("user_account".equals(cookie.getName())) {
					user_account = cookie.getValue();
				}
			}
			if(user_account==null || user_account.equals("")){
				request.getRequestDispatcher("/WEB-INF/jsp/user/login.jsp").forward(
						request, resp);
				return false;
			}
			User newUser = userService.selectUser(user_account);
			if (newUser.getUser_password().equals(user_password)) {
				request.getSession().setAttribute("user", newUser);
				return true;
			}
		}
		//
		request.getRequestDispatcher("/WEB-INF/jsp/user/login.jsp").forward(
				request, resp);
		return false;
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
	}

	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	}
}
