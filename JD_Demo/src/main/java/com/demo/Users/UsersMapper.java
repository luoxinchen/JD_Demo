package com.demo.Users;

import java.util.List;

import com.demo.pojo.Users;

public interface UsersMapper {
//	增
	void insertUsers(Users users);
//  删
	void deleteUsers(Users users);
//	查
	List<Users> selectUsers();
//	改
	void updateUsers(Users users);
}
