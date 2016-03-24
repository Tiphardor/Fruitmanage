package org.common.service.impl;

import org.fruitmanage.dao.UserDao;

public class BaseServiceImpl {
	protected UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
