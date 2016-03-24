package org.fruitmanage.service.impl;

import java.io.Serializable;

import org.fruitmanage.dao.UserDao;
import org.fruitmanage.entity.User;
import org.fruitmanage.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Serializable register(User user) {
		// TODO Auto-generated method stub
		System.out.println("dao zhe le");
		Serializable serializable = userDao.save(user);
		return serializable;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserByUserNameAndPasswordStyle(String userName, String password,Integer style) {
		// TODO Auto-generated method stub
		User user = userDao.findUserByNameAndPwdS(userName, password,style);
		return user;
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		User user = userDao.get(User.class, id);
		return user;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public void savePerson() {
		// TODO Auto-generated method stub
		userDao.savePerson();
	}

}
