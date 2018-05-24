package com.example.demo.rabbit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.rabbit.many.OneSender;
import com.example.demo.rabbit.many.OneSender2;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OneToMany {
	
	@Autowired
	private OneSender neoSender;
	
	@Autowired
	private OneSender2 neoSender2;

	@Test
	public void oneToMany() throws Exception {
		for (int i = 0; i < 100; i++) {
			neoSender.send(i);
			neoSender2.send(i);
		}
	}
}
