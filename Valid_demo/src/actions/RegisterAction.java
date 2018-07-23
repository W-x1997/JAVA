package actions;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	
	private Users user;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	public String execute(){
		if(this.user.getUsername() == null || this.user.getUsername().equals(""))
		{
			this.addFieldError("user.username", "User name can not be null!");
		}
		
		else if(this.user.getPassword() == null || this.user.getPassword().equals(""))
		{
			this.addFieldError("user.password", "password not null");			
		}
		else if(!this.user.getPassword().equals(this.user.getPassword1() ))
		{
			this.addFieldError("user.password2", "password not matched");
		}
		else if(this.user.getBirthday() >2017)
		{
			this.addFieldError("user.birth", "must be smaller than 2017");
		}
		if(this.hasFieldErrors())
			return LOGIN;
		System.out.println("Register success!!!");
		return SUCCESS;
	}

}
