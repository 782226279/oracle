package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Goods;
import com.service.GoodsService;

public class TestA {
	public static void main(String[] args) {

		// º”‘ÿspring»›∆˜
		ApplicationContext acx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		GoodsService gs = (GoodsService) acx.getBean("goodsServiceImp");// ªÒ»°service≤„
		// Goods goods = gs.selectByPrimaryKey(1);
		// System.out.println(goods.getGoodsname());
		
		List<Goods> list = gs.selectAllGoods();
		for (Goods goods : list) {
			System.out.println(goods.getGoodsname());
		}

	}
}
