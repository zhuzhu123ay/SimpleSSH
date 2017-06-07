package com.huihuizheng.base;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class baseAction extends ActionSupport implements ServletRequestAware,
ServletResponseAware,ServletContextAware{
	protected HttpServletRequest request;
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	public HttpServletResponse getResponse() {
		return response;
	}
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}
	public ServletContext getApplication() {
		return application;
	}
	public void setApplication(ServletContext application) {
		this.application = application;
	}
	protected HttpServletResponse response;
	protected ServletContext application;
	@Override
	public void setServletContext(ServletContext application) {
		this.application = application;
	}
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}

}
