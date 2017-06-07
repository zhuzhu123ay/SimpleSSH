package com.huihuizheng.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.huihuizheng.base.baseAction;
import com.huihuizheng.domain.User;
import com.huihuizheng.service.UserService;
import com.huihuizheng.serviceImpl.UserServiceImpl;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class RegisterAction extends baseAction implements ModelDriven<User>{
	@Autowired
	private UserService userService;
	private User user;
	
	public String loadinfo(){
		System.out.println("God with me..");
		return "loadinfo";
	}
	public String addRegisterinfo(){
		System.out.println("注册成功start。。。="+user);
		userService.save(user);
		System.out.println("注册成功end。。。");
		return "addRegisterinfo";
		//return NONE;
	}

	
	/*public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
		this.userService = userServiceImpl;
	}
	public void setUser(User user) {
		this.user = user;
	}*/
	@Override
	public User getModel() {
		if(user==null)
		{
			 user=new User();
		}
		return user;
	}
}
