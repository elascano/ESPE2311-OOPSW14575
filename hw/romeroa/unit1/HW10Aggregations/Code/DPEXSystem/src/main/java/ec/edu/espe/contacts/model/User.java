package ec.edu.espe.contacts.model;

public class User {
	private int id;
	private String username;
	private String password;
	private boolean isAdministrator;
	private String name;
	private String lastName;

	public User(int id, String username, String password, boolean isAdministrator, String name, String lastName) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.isAdministrator = isAdministrator;
		this.name = name;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=********, isAdministrator="
				+ isAdministrator + ", name=" + name + ", lastName=" + lastName + "]";
	}
}