package com.wiesloch.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiesloch.mapper.UserMapper;
import com.wiesloch.po.User;
/**
 * 
 * Title: UserService
 * @Description:用户的业务类
 * @author Raccoon
 * @date 2016-4-30 下午10:04:44
 */
@Service("userService")
public class UserService {
	@Autowired
	private UserMapper userMapper; 
	
	/**
	 * 插入用户（无地址）
	 * @param user 新增的用户的信息
	 * @return 注册用户的id
	 * @throws Exception
	 */
	public Integer insertUser(User user) throws Exception {
		return userMapper.insertUser(user);
	}
	
	
	 /** 
	  * 查询用户是否存在
	  * @param  user_account 根据用户账户查询
	  * @return 用户详细信息
	  * @throws Exception
	  */
	public User selectUser(String user_account) throws Exception{
		return userMapper.selectUser(user_account);
	}
}

