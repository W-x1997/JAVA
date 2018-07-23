package org.wx;

/**
 * AbstractUser entity provides the base persistence definition of the User
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUser extends com.opensymphony.xwork2.ActionSupport implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private Integer age;

	// Constructors

	/** default constructor */
	public AbstractUser() {
	}

	/** minimal constructor */
	public AbstractUser(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractUser(Integer id, String username, Integer age) {
		this.id = id;
		this.username = username;
		this.age = age;
	}
	public AbstractUser( String username, Integer age) {
		this.username = username;
		this.age = age;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}