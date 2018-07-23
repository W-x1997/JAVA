package org.struts.wx.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
  private static final String REGISTER = "resgister";
private String username;
  private String password;
 
  
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



public String execute(){
	  if(this.getUsername().equals("weixin")&&this.getPassword().length()>5){
		  
		  return SUCCESS;
	  }
	  else
		   return LOGIN;
	  
}
  

}
