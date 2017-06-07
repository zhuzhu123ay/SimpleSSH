package com.huihuizheng.dao;

import com.huihuizheng.domain.User;

public interface UserDao {
	User findByUsernameAndPassword(String username,String password);
	public void save(User entity);
}
