package com.huihuizheng.service;

import com.huihuizheng.domain.User;

public interface UserService {
	User login(String username, String password)throws Exception;
	void register()throws Exception;
	public void save(User entity);
}
