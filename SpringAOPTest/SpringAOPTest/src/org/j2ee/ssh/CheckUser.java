package org.j2ee.ssh;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CheckUser {

	@Pointcut("execution(* org.j2ee.ssh.*.find*(..))")
	public void checkUser(){
		System.out.println("**************The System is Searching Information For You****************");
	}
	
	@Pointcut("execution(* org.j2ee.ssh.*.add*(..))")
	public void checkAdd(){
		System.out.println("**************<< Add User >> Checking.....***************");
	}
	
	@Before("checkUser()")
	public void beforeCheck(){
		System.out.println(">>>>>>>> ׼���Ѳ��û�..........");
	}
	
	@After("checkUser()")
	public void afterCheck(){
		System.out.println(">>>>>>>>���Ѳ��û����..........");
	}

	@Before("checkAdd()")
	public void beforeAdd(){
		System.out.println(">>>>>>>>�������û�--���ing..........");
	}
	
	@After("checkAdd()")
	public void afterAdd(){
		System.out.println(">>>>>>>>�������û�--�����ϣ�δ�����쳣!..........");
	}
	
	 //��������֪ͨ  
    @Around("checkUser()")  
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {  
        System.out.println("���뷽��---����֪ͨ");  
        Object o = pjp.proceed();  
        System.out.println("�˳�����---����֪ͨ");  
        return o;  
    }  
}
