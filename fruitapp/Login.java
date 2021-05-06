package fruitapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This class is to take the login credentials from user If they are valid then
 * show the details Else throw Exception
 * 
 * @author vivek
 *
 */

public class Login {
	static Scanner sc = new Scanner(System.in);
	/**
	 * persons is a map where it contains the key as the userName and value as the
	 * user object
	 */
	private static Map<String, Person> persons;
	private static String userName;
	private static String password;

	public static Person userLogin() {
		persons = new HashMap<String, Person>();
		/**
		 * Adding few users by default
		 */
		persons.put("username1", new Person("username1", "vivek", "password1"));
		persons.put("username2", new Person("username2", "ramu", "password2"));
		persons.put("username3", new Person("username3", "kittu", "password3"));

		System.out.println("Enter the Login Details");
		System.out.print("Enter your user name: ");
		userName = sc.nextLine();
		/**
		 * check userName is valid
		 */
		if (!persons.containsKey(userName))
			throw new RuntimeException("Enter valid User name ");

		Person userDetail = persons.get(userName);

		System.out.print("Enter your Password: ");
		password = sc.nextLine();
		/**
		 * check password is valid
		 */
		if (!userDetail.getPassword().equals(password))
			throw new RuntimeException("password is not correct");

		System.out.println("Success\n");
		return persons.get(userName);
	}
}