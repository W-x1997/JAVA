package entity;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */
public class Student extends AbstractStudent implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Long id) {
		super(id);
	}

	/** full constructor */
	public Student(Long id, String username, Long age, String major) {
		super(id, username, age, major);
	}

}
