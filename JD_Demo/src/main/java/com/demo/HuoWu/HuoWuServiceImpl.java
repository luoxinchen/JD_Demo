package com.demo.HuoWu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.pojo.HuoWu;

@Service
@Transactional
public class HuoWuServiceImpl implements HuoWuService{
	
	@Autowired
	private sousuoMapper sousuoMapper;
	@Override
	public List<HuoWu> showAll(HuoWu huowu) {
		return this.sousuoMapper.selectAll(huowu);
	}
}
