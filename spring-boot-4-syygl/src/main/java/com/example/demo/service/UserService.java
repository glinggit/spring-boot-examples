package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public User findUser(String userName) {
//		int page=1,size=10;
//	    Sort sort = new Sort(Direction.DESC, "id");
//	    Pageable pageable = new PageRequest(page, size, sort);
//		userRepository.findALL(pageable);
		
		
		
		return userRepository.findByUserName(userName);
	}
	
}
