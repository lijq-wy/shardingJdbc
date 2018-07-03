package com.think;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.dao.OrderMapper;
import com.think.entity.TOrder;
import com.think.main.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class) // 指定spring-boot的启动类
public class AppTest {

	@Autowired
	private OrderMapper orderMapper;

	// @Test
	public void test() {
		TOrder order = new TOrder();
		order.setUserId(1888555);
		order.setOrderId(1775666);
		orderMapper.insert(order);
	}

	@Test
	public void test2() {
		TOrder order = orderMapper.findById(773);
		System.out.println(order.getOrderId() + "" + order.getUserId());
	}

}
