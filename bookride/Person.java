package bookride;

/**
 * Person class is the user having userName and password as credentials
 * 
 * @author vivek
 *
 */
public class Person {
	private String userName;
	private String name;
	private String password;

	/**
	 * Person constructor
	 * 
	 * @param userName userName of the user
	 * @param name     name of the user
	 * @param password password of the user
	 */

	public Person(String userName, String name, String password) {
		this.userName = userName;
		this.name = name;
		this.password = password;
	}

	/**
	 * This is used to return the userName
	 * 
	 * @return userName of the user
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * This is used to return the name of the user
	 * 
	 * @return name name of the user
	 */
	public String getName() {
		return name;
	}

	/**
	 * This is used to return the password
	 * 
	 * @return password password of the user
	 */

	public String getPassword() {
		return password;
	}
}