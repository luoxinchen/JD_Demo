package com.demo.Denglu;

import java.util.List;

import com.demo.pojo.ShangHu;
import com.demo.pojo.Users;
/**
 * 此接口作用：
 * 		添加一个实现方法，留与SQL直接数据传输；
 * 		接口绑定的接口文件和xml文件可以看做成一个，
 * 		既，一个是外放的接口，留给别的方法调用，一个是功能；
 * 
 * @author Administrator
 *
 */
public interface DLservice {
//	用户登录
	List<Users> showOne(Users users);
//	用户注册
	void addOne(Users users);
//	商户登录
	List<ShangHu> showShangHu(ShangHu shanghu);
//	商户注册
	void addShanghu(ShangHu shanghu);
}
