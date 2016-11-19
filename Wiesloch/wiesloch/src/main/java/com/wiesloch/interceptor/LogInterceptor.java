package com.wiesloch.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * Title: LogInterceptor
 * 
 * @Description:日志管理拦截器,日志放在after中
 * @author Raccoon
 * @date 2016-5-1 上午10:05:34
 */
public class LogInterceptor implements HandlerInterceptor {
	/**
	 * 执行结束Handler之后：统一的异常处理，统一的日志处理
	 */
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception { 
		//TODO 日志处理
		System.out.println("LogInterceptor.afterCompletion()");
		
	}

	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2) throws Exception {
		return true;
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
	}

}
