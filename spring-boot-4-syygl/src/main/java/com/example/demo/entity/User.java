package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/*
	 * Entity中不映射成列的字段得加@Transient 注解，不加注解也会映射成列
	 */
	
	@Id
	//主键生成的策略
    @GeneratedValue
    private Long id;    
    @Column(nullable = false, unique = true)    
    private String userName;    
	@Column(nullable = false)    
    private String passWord;    
    @Column(nullable = false, unique = true)    
    private String email;    
    @Column(nullable = true, unique = true)    
    private String nickName;    
    @Column(nullable = false)    
    private String regTime;
    
    @Transient
    private String syygl;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getRegTime() {
		return regTime;
	}

	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}

	public String getSyygl() {
		return syygl;
	}

	public void setSyygl(String syygl) {
		this.syygl = syygl;
	}
    
}
