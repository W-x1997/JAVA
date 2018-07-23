package org.wx;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User extends AbstractUser implements java.io.Serializable {

	// Constructors

	
	
	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(Integer id) {
		super(id);
	}

	/** full constructor */
	public User(Integer id, String username, Integer age) {
		super(id, username, age);
	}
	
	public User(String username, Integer age) {
		super(username, age);
	}

}
