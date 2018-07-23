package entity;

/**
 * AbstractStudent entity provides the base persistence definition of the
 * Student entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStudent implements java.io.Serializable {

	// Fields

	private Long id;
	private String username;
	private Long age;
	private String major;

	// Constructors

	/** default constructor */
	public AbstractStudent() {
	}

	/** minimal constructor */
	public AbstractStudent(Long id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractStudent(Long id, String username, Long age, String major) {
		this.id = id;
		this.username = username;
		this.age = age;
		this.major = major;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getAge() {
		return this.age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

}