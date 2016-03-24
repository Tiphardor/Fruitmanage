package org.fruitmanage.dao.impl;

import org.common.dao.impl.BaseDaoHibernate4;
import org.fruitmanage.dao.UserDao;
import org.fruitmanage.entity.Person;
import org.fruitmanage.entity.PersonPK;
import org.fruitmanage.entity.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class UserDaoImpl extends BaseDaoHibernate4<User> implements UserDao{

	@Override
	public User findUserByNameAndPwdS(String userName, String pwd,Integer style) {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userName",userName));
		criteria.add(Restrictions.eq("password", pwd));
		criteria.add(Restrictions.eq("style", style));
		User user = (User)criteria.uniqueResult();
		return user;
	}

	@Override
	public void savePerson() {
		// TODO Auto-generated method stub
		PersonPK pk = new PersonPK();
		pk.setFirstName("111");
		pk.setSecondName("222");
		Person p = new Person();
		p.setAge("-");
		p.setPk(pk);
		sessionFactory.getCurrentSession().save(p);
	}

}
