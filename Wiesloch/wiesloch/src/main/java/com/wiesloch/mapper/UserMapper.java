
package com.wiesloch.mapper;

import java.util.List;

import com.wiesloch.po.OrderDetail;
import com.wiesloch.po.OrderDetailExtend;
import com.wiesloch.po.User;

/**
 * 
 * Title: UserMapper
 * @Description: 用户个人信息的mapper类
 * @author Raccoon
 * @date 2016-4-30 下午9:16:56
 */
public interface UserMapper {
	/**
	 * 插入用户
	 * @param user 新增的用户的信息
	 * @return 注册用户的id
	 * @throws Exception
	 */
	public Integer insertUser(User user) throws Exception;
	 /**
	  * 查询用户是否存在 
	  * @param  user_account 根据用户账户查询
	  * @return 用户详细信息
	  * @throws Exception
	  */
	public User selectUser(String user_account) throws Exception;
}
