package com.demo.SetGouWuChe;

import java.util.List;

import com.demo.pojo.GouWuChe;
import com.demo.pojo.HuoWu;

public interface GouWuCheService {
//	调用购物车插入信息方法
	void addgouwuche(String hidden3,int number,int id,String name,int number1,float price);
//	调用从货物表中找出该货物的所有信息的方法
	HuoWu selectOneHuoWu(String hidden2);
//	从购物车数据表中找出所有加入购物车的东西
	List<GouWuChe> showAllGouWuChe();
//	购买完毕，购物车删除相应的物品
	void deleteOneGouwuche(String string);
	
}
