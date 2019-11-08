package com.demo.ShangPinXiangQing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.pojo.HuoWu;


@Service
@Transactional
public class XiangQingServiceImpl implements XiangQingService{

	@Autowired
	private XiangQingmapper xiangqingmapper;
	
	@Override
	public HuoWu showHuoWu(String hidden) {
		return this.xiangqingmapper.fanhuiHuoWu(hidden);
	}
}
