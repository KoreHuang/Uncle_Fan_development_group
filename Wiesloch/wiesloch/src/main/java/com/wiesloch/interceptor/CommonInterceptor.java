package com.wiesloch.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 
 * Title: CommonInterceptor
 * @Description:公有拦截器，添加公有数据，放在post方法中
 * @author Raccoon
 * @date 2016-5-1 上午9:58:46
 */
public class CommonInterceptor implements HandlerInterceptor {
	
	/**
	 * 进入Handler之后，返回ModelAndView之前：添加公用的Model数据（比如菜单导航），也可以统一指定视图
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}
	
		public void afterCompletion(HttpServletRequest arg0,
				HttpServletResponse arg1, Object arg2, Exception arg3)
				throws Exception {
		// TODO A 	uto-generated method stub
		
	}
}
