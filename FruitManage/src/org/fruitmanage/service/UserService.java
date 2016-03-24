package org.fruitmanage.service;

import java.io.Serializable;

import org.fruitmanage.entity.User;

public interface UserService {
	public Serializable register(User user);
	public User login(User user);
	public User findUserByUserNameAndPasswordStyle(String userName,String password,Integer style);
	public User findUserById(Integer id);
	public void updateUser(User user);
	public void savePerson();
}
