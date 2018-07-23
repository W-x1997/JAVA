package org.j2ee.test;

import java.util.Date;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddUserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String name;
	private int age;
	private String sex;
	private Date birthday;
	private String address;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String execute() throws Exception{
		ActionContext ac = ActionContext.getContext();
		
		ac.getApplication().put("uname", username);
		ac.getApplication().put("upwd", password);
		ac.getApplication().put("name", name);
		ac.getApplication().put("age", age);
		ac.getApplication().put("sex", sex);
		return SUCCESS;
		
	}
	
//	public void validateExecute()
//	{
//		ActionContext ac = ActionContext.getContext();
//		
//		String age = (String)ac.getApplication().get("age");
//		
//		int intage = Integer.parseInt(age);
//		
//		if (intage >30)
//			this.addFieldError("username", "用户名不能为空"); 
//
//	}
}
