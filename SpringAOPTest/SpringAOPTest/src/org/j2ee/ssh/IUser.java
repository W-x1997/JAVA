package org.j2ee.ssh;

public interface IUser {

	public String findUser(String username);
	public void addUser(String username);
	public void findAll();
}
