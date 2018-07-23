package Actions;



import org.hibernate.Query;
import org.hibernate.Session;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;


import entity.Student;




public class actions extends ActionSupport {
//login
	String loginuser;
	String password;
	
	
//add stu	
	String username;
	String age;
	String major;
	String id;
	private List<Student> students;
	
   public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
public String getLoginuser() {
		return loginuser;
	}
	public void setLoginuser(String loginuser) {
		this.loginuser = loginuser;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
	
   
	public String execute(){
	   
	   
	   return SUCCESS;
   }
   
	public String login(){
	  if(loginuser.equals("njut")&&password.equals("njut"))
	   return SUCCESS;
	  else
		  return ERROR;
   }
	
	public String add(){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		

		Student stu = new Student();
		stu.setUsername(this.getUsername());
		long age_temp=Integer.parseInt(this.getAge());
		long id_temp=Integer.parseInt(this.getId());
		stu.setAge(age_temp);
		stu.setMajor(this.getMajor());
		stu.setId(id_temp);
		
		session.save(stu);
		session.getTransaction().commit();
		
	
 
		

		HibernateSessionFactory.closeSession();
		return SUCCESS;
	}
	
	public String query(){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();

		
		String sql = "";
		if (!id.equals("") && !username.equals("")) {
			sql = "select * from student where id=" + id
					+ " and username='" + username + "'";
		}
		
		if (!id.equals("") && username.equals("")) {
			sql = "select * from student where id=" + id + "";
		}
		if (id.equals("") && username.equals("")) {
			sql = "select * from student";
		}
		Query query = session.createSQLQuery(sql).addEntity(Student.class);
		students = query.list();
		for (Student i : students) {
			System.out.println(i.getUsername());
		}

		HibernateSessionFactory.closeSession();
		return SUCCESS;
	}
	
	public String delete(){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
        
		Student student=new Student();
		student.setId((long)Integer.parseInt(id));
		session.delete(student);
	
		String sql = "";
		sql = "select * from Student";
		Query query = session.createSQLQuery(sql).addEntity(Student.class);
		students = query.list();
		for (Student i : students) {
			System.out.println(i.getUsername());
		}

		session.getTransaction().commit();

		HibernateSessionFactory.closeSession();
		return SUCCESS;
		
	}
	
	
	
	public String check(){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		
		String sql = "";
		
		sql = "select * from Student where id=" + id + "";
		Query query = session.createSQLQuery(sql).addEntity(Student.class);
		students = query.list();
		for (Student i :students) {
			setUsername(i.getUsername());
			setAge(String.valueOf(i.getAge()));
			setMajor(i.getMajor());
		}

		session.getTransaction().commit();

		HibernateSessionFactory.closeSession();
		return SUCCESS;
	}
	
	
	public String update(){
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();

		Student stu = (Student) session.get(Student.class,
				Integer.parseInt(id));
		stu.setUsername(username);
		stu.setAge((long)Integer.parseInt(age));
		stu.setMajor(major);
	
		
		String sql = "";
		sql = "select * from Student";
		
		Query query = session.createSQLQuery(sql).addEntity(Student.class);
		students = query.list();
		
 
		session.getTransaction().commit();

		HibernateSessionFactory.closeSession();
		
		return SUCCESS;
	}
	
	
}
