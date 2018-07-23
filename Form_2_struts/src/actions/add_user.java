package actions;

import java.sql.Date;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class add_user extends ActionSupport {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String name;
private String sex;
private String university;
private int age;
private String address;
private Date birthday;
private String city;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSex() {
	return sex;
}

public void setSex(String sex) {
	this.sex = sex;
}

public String getUniversity() {
	return university;
}

public void setUniversity(String university) {
	this.university = university;
}


public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}


public Date getBirthday() {
	return birthday;
}


public void setBirthday(Date birthday) {
	this.birthday = birthday;
}


public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String execute(){
	ActionContext ac=ActionContext.getContext();
	ac.getApplication().put("name",name);
	ac.getApplication().put("sex",sex);
	ac.getApplication().put("university",university);
	ac.getApplication().put("age",age);
	ac.getApplication().put("address",address);
	ac.getApplication().put("birthday",birthday);
	ac.getApplication().put("city",city);
	
	return SUCCESS;
}

	
}
