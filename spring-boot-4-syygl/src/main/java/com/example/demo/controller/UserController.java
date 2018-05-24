package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.enums.UserSexEnum;
import com.example.demo.mybatisEntity.UserEntity;
import com.example.demo.service.UserEntityService;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private UserEntityService userEntityService;

	@RequestMapping("/getUser")
	public User getUser() {

		return userService.findUser("bb123456");
	}

	@RequestMapping("/getEntityUser")
	public List<UserEntity> getEntityUser() {

		UserEntity ue = new UserEntity();
		ue.setUserName("haha");
		ue.setUserSex(UserSexEnum.MAN);
		ue.setNickName("haode");
		userEntityService.insert(ue);

		return userEntityService.findUser();
	}

	@RequestMapping("/getEntityUserXml")
	public List<UserEntity> getEntityUserXml() {

		UserEntity ue = new UserEntity();
		ue.setUserName("haha");
		ue.setUserSex(UserSexEnum.MAN);
		ue.setNickName("haode");
		userEntityService.insertXml(ue);

		return userEntityService.findXmlUser();
	}
}
