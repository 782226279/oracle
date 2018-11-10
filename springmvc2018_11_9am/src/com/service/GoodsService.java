package com.service;

import java.util.List;

import com.bean.Goods;

//service接口
public interface GoodsService {
	// 根据主键查询一个Goods对象
	Goods selectByPrimaryKey(Integer id);

	// 查询所有的goods对象
	List<Goods> selectAllGoods();
}
