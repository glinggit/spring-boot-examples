package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.UserMapper;
import com.example.demo.mapper.UserXmlMapper;
import com.example.demo.mybatisEntity.UserEntity;

@Service
public class UserEntityService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserXmlMapper userXmlMapper;

	public List<UserEntity> findUser() {

		return userMapper.getAll();
	}

	public void insert(UserEntity ue) {
		userMapper.insert(ue);

	}

	public List<UserEntity> findXmlUser() {

		return userXmlMapper.getAll();
	}

	public void insertXml(UserEntity ue) {
		userXmlMapper.insert(ue);

	}

}
