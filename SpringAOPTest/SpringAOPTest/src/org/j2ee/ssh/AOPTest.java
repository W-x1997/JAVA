package org.j2ee.ssh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext actx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IUser user = (IUser) actx.getBean("user");
		user.findAll();
		

		user.addUser("Tom");
		user.findUser("Tom");
		
	}

}
