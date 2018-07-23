package org.wx;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.opensymphony.xwork2.ActionSupport;

public class queryaction extends ActionSupport {

	String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String execute()
	{ 
		int Id=Integer.parseInt(id);
		int flag=0;
		Session session = HibernateSessionFactory.getSession();
	    Transaction tx=session.beginTransaction();
		User user=session.get(User.class,Id);
		tx.commit();
		session.close();
	 if(user==null)
		return ERROR;
	 else
		 return SUCCESS;
	}
}
