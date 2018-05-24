package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUserName(String userName);

	User findByUserNameOrEmail(String username, String email);
	
	//Page<User> findALL(Pageable pageable);
	
	
	@Modifying
	@Query("update User u set u.userName = ?1 where u.id = ?2")
	int modifyByIdAndUserId(String  userName, Long id);

	@Transactional
	@Modifying
	@Query("delete from User where id = ?1")
	void deleteByUserId(Long id);

	@Transactional(timeout = 10)
	@Query("select u from User u where u.email = ?1")    
	User findByEmail(String emailAddress);
}
