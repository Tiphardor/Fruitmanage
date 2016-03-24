package org.fruitmanage.dao;

import org.common.dao.BaseDao;
import org.fruitmanage.entity.User;

public interface UserDao extends BaseDao<User>{
	public User findUserByNameAndPwdS(String userName,String pwd,Integer style);
	public void savePerson();
}
