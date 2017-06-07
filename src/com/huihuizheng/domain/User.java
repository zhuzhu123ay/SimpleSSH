package com.huihuizheng.domain;

public class User {
	private Integer id;
	private String password;
	private String username;
	private String realname;
	private String sex;
	private String phone;
	private String birthdayYear;
	private String birthdayMonth;
	private String birthdayDay;
	private String email;
	public User(){}
	public User(Integer id, String password, String username, String realname,
			String sex, String phone, String birthdayYear,
			String birthdayMonth, String birthdayDay, String email) {
		super();
		this.id = id;
		this.password = password;
		this.username = username;
		this.realname = realname;
		this.sex = sex;
		this.phone = phone;
		this.birthdayYear = birthdayYear;
		this.birthdayMonth = birthdayMonth;
		this.birthdayDay = birthdayDay;
		this.email = email;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBirthdayYear() {
		return birthdayYear;
	}
	public void setBirthdayYear(String birthdayYear) {
		this.birthdayYear = birthdayYear;
	}
	public String getBirthdayMonth() {
		return birthdayMonth;
	}
	public void setBirthdayMonth(String birthdayMonth) {
		this.birthdayMonth = birthdayMonth;
	}
	public String getBirthdayDay() {
		return birthdayDay;
	}
	public void setBirthdayDay(String birthdayDay) {
		this.birthdayDay = birthdayDay;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", username="
				+ username + ", realname=" + realname + ", sex=" + sex
				+ ", phone=" + phone + ", birthdayYear=" + birthdayYear
				+ ", birthdayMonth=" + birthdayMonth + ", birthdayDay="
				+ birthdayDay + ", email=" + email + "]";
	}
	
}
