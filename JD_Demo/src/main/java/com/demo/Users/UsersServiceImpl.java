package com.demo.Users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.Users.UsersMapper;
import com.demo.pojo.Users;

@Service
//事务管理
@Transactional
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersMapper mapper;

	@Override
	public void addUsers(Users users) {
		// TODO Auto-generated method stub
		this.mapper.insertUsers(users);
	}

	@Override
	public void deleteUsers(Users users) {
		// TODO Auto-generated method stub
		this.mapper.deleteUsers(users);
	}

	@Override
	public List<Users> selectUsers() {
		return this.mapper.selectUsers();
	}

	@Override
	public void update(Users users) {
		// TODO Auto-generated method stub
		this.mapper.updateUsers(users);
	}
}
