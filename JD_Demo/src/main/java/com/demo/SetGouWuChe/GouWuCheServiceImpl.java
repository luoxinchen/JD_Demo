package com.demo.SetGouWuChe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.pojo.GouWuChe;
import com.demo.pojo.HuoWu;

@Service
@Transactional
public class GouWuCheServiceImpl implements GouWuCheService{
	
	@Autowired
	private GouWuChemapper gouwuchemapper;

//	把商品添加到购物车
	
	@Override
	public void addgouwuche(String hidden3,int number,int id,String name,int number1,float price) {
		this.gouwuchemapper.setgouwuche(hidden3,number,id,name,number1,price);
	}

//	根据当前商品信息，得到它的所有信息，然后放进商品详情页内;
	
	@Override
	public HuoWu selectOneHuoWu(String hidden2) {
		// TODO Auto-generated method stub
		return gouwuchemapper.selectHuoWu(hidden2);
	}

//	查找购物车表中的所有信息
	
	@Override
	public List<GouWuChe> showAllGouWuChe() {
		// TODO Auto-generated method stub
		return this.gouwuchemapper.selectgouwuche();
	}

	
//	购买完毕，购物车删除相应的物品
	@Override
	public void deleteOneGouwuche(String string) {
		// TODO Auto-generated method stub
		this.gouwuchemapper.deleteOne(string);
	}
}
