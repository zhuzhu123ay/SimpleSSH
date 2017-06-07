package com.huihuizheng.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.huihuizheng.base.baseAction;
import com.huihuizheng.domain.User;
import com.huihuizheng.service.UserService;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends baseAction implements ModelDriven<User> {
	@Autowired
	private UserService userService;
	private User user;
	@Override
	public User getModel() {
		if(user==null){
			user=new User();
		}
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String loadinfo(){
		
		return "loadinfo";
	}
	public String login() throws Exception{
		User userlogin=userService.login(user.getUsername(), user.getPassword());
		if (userlogin != null) {
			request.getSession().setAttribute("user", userlogin);
			System.out.println("-----------------user----------"
					+ user.toString());
			return "success";
		} else {
			request.getSession().setAttribute("loginError", "用户名或密码不正确！");// 向前台传值
			return "loadinfo";
		}
	}
}
