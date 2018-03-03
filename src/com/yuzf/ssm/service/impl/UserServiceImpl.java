package com.yuzf.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.yuzf.ssm.dao.UserMapper;
import com.yuzf.ssm.pojo.User;
import com.yuzf.ssm.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Integer checkUser(User user) {
		return userMapper.checkUser(user);
	}

}
