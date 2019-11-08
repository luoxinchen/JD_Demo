package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.Users.UsersServiceImpl;
import com.demo.pojo.Users;

/**
 * 此类是用户个人模块操作类：
 * 	个人信息的增删查改都是此控制器负责；
 * 
 *
 */

@Controller
public class UsersController {
	@Autowired
	private UsersServiceImpl serviceimpl;
	
	@RequestMapping("/addUsers")
	public String addUsers(Users users){
		serviceimpl.addUsers(users);
		return "ok";
	}
	
	@RequestMapping("/selectUsers")
	public String selectUsers(Users users){
		List<Users> list = serviceimpl.selectUsers();
		for (Users users1 : list) {
			System.out.println(users1);
		}
		return "ok";
	}
	@RequestMapping("/deleteUsers")
	public String deleteUsers(Users users){
		serviceimpl.deleteUsers(users);
		return "ok";
	}
	@RequestMapping("/updateUsers")
	public String updateUsers(Users users){
		serviceimpl.update(users);
		return "ok";
	}
}

