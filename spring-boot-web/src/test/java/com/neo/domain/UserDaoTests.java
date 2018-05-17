package com.neo.domain;

import java.text.DateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.neo.Application;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTests {

	@Autowired
	private UserDao userDao;

	@Test
	public void test() throws Exception {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);        
		String formattedDate = dateFormat.format(date);
		
		userDao.save(new User("aa11", "aa@1126.com", "a1a", "aa1123456",formattedDate));
		userDao.save(new User("bb21", "bb@1216.com", "b1b", "bb1231456",formattedDate));
		userDao.save(new User("cc31", "cc@1126.com", "c1c", "cc1231456",formattedDate));

		Assert.assertEquals(9, userDao.findAll().size());
		Assert.assertEquals("bb", userDao.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
		userDao.delete(userDao.findByUserName("aa1"));
	}

}