package com.wiesloch.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wiesloch.exception.CustomException;
import com.wiesloch.po.User;
import com.wiesloch.service.UserService;
import com.wiesloch.util.CookiesUtil;
import com.wiesloch.util.MD5Util;

/**
 * 
 * Title: UserController
 * 
 * @Description:用户登录、注册、登出
 * @author Raccoon
 * @date 2016-4-30 下午7:21:41
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/Login", method = { RequestMethod.POST,
			RequestMethod.GET })
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response, User user) throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		HttpSession session = request.getSession();
		
		User sessionUser = (User) session.getAttribute("user");
		if(sessionUser !=null){
			modelAndView.setViewName("/user/user");
			return modelAndView;
		}
		modelAndView.setViewName("/user/login");
		if (user == null)
			return modelAndView;

		user.setUser_password(MD5Util.getMD5String(user.getUser_password()));
		// 查询用户是否存在


		User newUser = userService.selectUser(user.getUser_account());

		if (newUser != null
				&& newUser.getUser_password().equals(user.getUser_password())) {
			// 设置7天免登录


			String user_account = newUser.getUser_account();
			String user_password = newUser.getUser_password();

			Integer expiry = 24 * 60 * 60 * 7;
			response.addCookie(CookiesUtil.addCookies("user_account",
					user_account, expiry));
			response.addCookie(CookiesUtil.addCookies("user_password",
					user_password, expiry));

			session.setAttribute("user", newUser);
			
			modelAndView.setViewName("/user/user");
		}

		return modelAndView;
	}

	@RequestMapping(value = "/Register", method = { RequestMethod.POST,
			RequestMethod.GET })
	public ModelAndView register(HttpServletRequest request, User user)
			throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		// 判断用户是否存在
		User newUser = userService.selectUser(user.getUser_account());
		if (newUser != null) {
			throw new CustomException("用户已存在,请重新注册");
		}

		// 初始化新用户
		user.setUser_password(MD5Util.getMD5String(user.getUser_password()));
		user.setUser_points(0);
		user.setUser_level("普通用户");
		user.setUser_isDelete('0');
		userService.insertUser(user);

		// 设置登录状态
		modelAndView.setViewName("user/login");
		return modelAndView;
	}

	/**
	 * 
	 * @param request
	 * @param user
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/LoginOut", method = { RequestMethod.POST,
			RequestMethod.GET })
	public ModelAndView loginOut(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO 未测试
		ModelAndView modelAndView = new ModelAndView();
		Integer expiry = 0;
		response.addCookie(CookiesUtil.addCookies("user_account", "", expiry));
		response.addCookie(CookiesUtil.addCookies("user_password", "", expiry));
		request.getSession().invalidate();
		modelAndView.setViewName("user/login");
		return modelAndView;
	}

}
