package com.demo.Users;

import java.util.List;

import com.demo.pojo.Users;

public interface UsersService {
	void addUsers(Users users);
	void deleteUsers(Users users);
	List<Users> selectUsers();
	void update(Users users);
}
