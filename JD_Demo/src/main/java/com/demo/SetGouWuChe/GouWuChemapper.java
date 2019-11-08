package com.demo.SetGouWuChe;

import java.util.List;

import com.demo.pojo.GouWuChe;
import com.demo.pojo.HuoWu;

public interface GouWuChemapper {
//	购物车插入信息
	void setgouwuche(String hidden3,int number,int id,String name,int number1,float price);
//	从货物表中找出该货物的所有信息
	HuoWu selectHuoWu(String hidden2);
//	查找购物车表中的所有信息
	List<GouWuChe> selectgouwuche();
//	购买完毕，购物车删除相应的物品
	void deleteOne(String string);
}
