package com.demo.Denglu;

import java.util.List;

import com.demo.pojo.ShangHu;
import com.demo.pojo.Users;
/**
 * 与DLmapper.xml文件接口绑定
 *
 */
public interface DLmapper {
//	用户登录
	List<Users> selectOne(Users users);
//	用户注册
	void insertOneUsers(Users users);
//  商家登录
	List<ShangHu> selectShanghu(ShangHu shanghu);
//	商家注册
	void insertShanghu(ShangHu shanghu);
}
