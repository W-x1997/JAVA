package org.wx;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;


public class testaction extends ActionSupport {
	String username;
	String age;
	 public static int i;
	
    
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String execute(){
		int num=Integer.parseInt(this.getAge());
		User user=new User(i,this.getUsername(),num);
		//User u2=new User(0,"weix1",20);
		//User u3=new User(2,"weixin2",20);
		this.i++;
		Session session = HibernateSessionFactory.getSession();
	    Transaction tx=session.beginTransaction();
		//session.beginTransaction();
		// System.out.println(id);

		
		session.save(user);
		//session.save(u2);
		//session.save(u3);
		tx.commit();

		session.close();
	
		System.out.println(this.getAge()+" "+this.getUsername()+" "+i);
		return SUCCESS;
	}
	
	
}
