package com.example.demo.rabbit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.User;
import com.example.demo.rabbit.object.ObjectSender;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObjectTest {

	@Autowired
	private ObjectSender objectSender;

	@Test
	public void hello() throws Exception {
		User user = new User();
		user.setEmail("ddedede");
		user.setNickName("hahaa");
		objectSender.send(user);
	}


}