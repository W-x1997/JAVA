package org.struts.wx.actions;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.ActionInvocation;
public class  Interceptor_demo implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
     
		ActionContext ac=arg0.getInvocationContext();
		System.out.println("==============前置拦截器===============");
		Map session = ac.getParameters();
		
		String []username=(String[])session.get("username");
		String []password=(String[])session.get("password");
		
		 if(username[0].equals("weixin")&&password[0].length()>5){
			 System.out.println("User name:" + username[0]);
		     System.out.println("User passwd:" + password[0]);
		     System.out.println("登录成功！！！");
		     arg0.invoke();
			  return Action.SUCCESS;
		  }
		  else
		  {
			  session.put("errorMsg", "登录失败！用户名错误，且密码需要5位以上！");
		
			  return Action.LOGIN;
		  }	
		
			
	}

}
