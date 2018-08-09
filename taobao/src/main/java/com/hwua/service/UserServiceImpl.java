package com.hwua.service;

import com.hwua.dao.UserDao;

public class UserServiceImpl {
	private UserDao userDao;
	private String Name;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void save(){
		userDao.save();
	}

	public UserServiceImpl() {
		super();
	}

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
