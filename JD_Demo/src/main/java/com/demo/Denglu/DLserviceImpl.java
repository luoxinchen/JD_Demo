package com.demo.Denglu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.pojo.ShangHu;
import com.demo.pojo.Users;
/**
 * 此类作用：
 * 		实现DLservice接口；
 * 		调用接口内方法和DLmapper接口中的方法，两者结合；
 * 		留着controller文件调此类；
 * @author Administrator
 *
 */
@Service
@Transactional
public class DLserviceImpl implements DLservice{
	
	@Autowired
	private DLmapper Dlmapper;
//	用户登录	
	@Override
	public List<Users> showOne(Users users) {
		return this.Dlmapper.selectOne(users);
	}
// 用户注册
	@Override
	public void addOne(Users users) {
		this.Dlmapper.insertOneUsers(users);
	}
//	商户登录
	@Override
	public List<ShangHu> showShangHu(ShangHu shanghu) {
		return this.Dlmapper.selectShanghu(shanghu);
	}
//	商户注册
	@Override
	public void addShanghu(ShangHu shanghu) {
		// TODO Auto-generated method stub
		this.Dlmapper.insertShanghu(shanghu);
	}

}
