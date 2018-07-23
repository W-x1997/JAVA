package org.ee.wx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_demo {


	public static void main(String[] args){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Student stu=(Student)ac.getBean("stu_1");
		
		System.out.println(stu.getName());
		System.out.println(stu.getAge());
		System.out.println(stu.getSex());	
		System.out.println(stu.getBirthday());	
		
	}
	
}
