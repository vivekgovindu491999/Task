package bookride;

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

	public static void userLogin() {

		System.out.println("Enter the Login Details");
		System.out.print("Enter your user name: ");
		String userName = sc.nextLine();
		/**
		 * check userName is valid
		 */
		if (!Main.persons.containsKey(userName))
			throw new RuntimeException("Enter valid User name ");

		Person userDetail = Main.persons.get(userName);

		System.out.print("Enter your Password: ");
		String password = sc.nextLine();
		/**
		 * check password is valid
		 */
		if (!userDetail.getPassword().equals(password))
			throw new RuntimeException("password is not correct");

		System.out.println("Success\n");
	}
}