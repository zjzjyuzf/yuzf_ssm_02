package com.yuzf.ssm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yuzf.ssm.pojo.User;
import com.yuzf.ssm.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService  userService;
	
	@RequestMapping("login.do")
	public ModelAndView login(User user) {
		ModelAndView modelAndView = new ModelAndView();
		Integer num = userService.checkUser(user);
		System.out.println(num);
		modelAndView.addObject("user", user);
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
