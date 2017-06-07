package com.huihuizheng.daoImpl;

import java.util.List;

import com.huihuizheng.base.HibernateDao;
import com.huihuizheng.dao.BaseDao;


public class BaseDaoImpl<T>  extends HibernateDao implements BaseDao<T>{
	
	@Override
	public void save(T entity) {
		System.out.println("BaseDaoImpl中的方法执行了、、、");
		getSession().save(entity);
		System.out.println("BaseDaoImpl中的方法执行了、、、");
	}
	@Override
	public void update(String hql, Object... args) {
		getSession().update(hql,args);
	}
	@Override
	public void delete(T entity) {
		
	}

	@Override
	public T findByPropertyName(String propertyName, Object value) {
		/*String hql= "from User where username=? and password=?";
		Query query = getSession().createQuery(hql).setString(0, lastName);
		Employee employee = (Employee) query.uniqueResult();*/
		return null;
	}

	@Override
	public List<T> findAllInfor() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
