package com.huihuizheng.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huihuizheng.dao.UserDao;
import com.huihuizheng.daoImpl.UserDaoImpl;
import com.huihuizheng.domain.User;
import com.huihuizheng.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	public void save(User user) {
		System.out.println("UserService中的的save方法执行了、、、");
		userDao.save(user);
	}

	@Override
	public User login(String username, String password) throws Exception {
		return userDao.findByUsernameAndPassword(username, password);
	}

	@Override
	public void register() throws Exception{
		/*//根据参数中的username去数据库中查找，如果db_staff不为空，该用户名被占用
		User db_user=UserDaoImpl.getUserByName(user.getUsername());
		if(user==null){
			//直接将用户名信息保存到数据库中
			UserDaoImpl.save(user);
		}else{
			//占用
			throw new Exception("该用户名已经被占用");
		}*/
	}

}
