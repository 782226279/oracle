package com.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bean.Goods;
import com.dao.GoodsMapper;

//service接口实现类
@Service
public class GoodsServiceImp implements GoodsService {

	@Resource(name = "goodsMapper")
	GoodsMapper goodsMapper;// // 依赖dao层接口,mybatis的接口

	@Override
	public Goods selectByPrimaryKey(Integer id) {
		return goodsMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Goods> selectAllGoods() {
		return goodsMapper.selectAllGoods();
	}

}
