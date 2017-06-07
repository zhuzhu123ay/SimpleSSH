package com.huihuizheng.daoImpl;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.huihuizheng.dao.UserDao;
import com.huihuizheng.domain.User;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	@Override
	public User findByUsernameAndPassword(String username,String password) {
		String hql= "from User u where u.username=? and u.password=?";
		Query query = getSession().createQuery(hql);
//		Query query = getSession().createQuery(hql).setString(0, password);
		query.setString(0, username);
		query.setString(1, password);
		
		User user = (User) query.uniqueResult();
		//System.out.println(user.getUsername().getClass().getName()+"UserDaoImpl-------->");
		return user;
	}
	
}
