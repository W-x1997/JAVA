package org.ssh.cs15;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext actx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//���������ĵ��ж����id���Bean
		HelloWorld hw = (HelloWorld)actx.getBean("HelloWorld");
		//���Bean�����ĵ����趨������
		System.out.println(hw.getMsg());
		
	}

}
