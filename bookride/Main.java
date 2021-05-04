package bookride;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * This class calls the Login class to validate the inputs and then give the
 * options to the user to proceed further
 * 
 * @author vivek
 *
 */
public class Main {

	static Scanner sc;
	static Map<String, Person> persons;

	public static void main(String[] args) {
		persons = new HashMap<String, Person>();
		persons.put("username1", new Person("username1", "vivek", "password1"));
		persons.put("username2", new Person("username2", "ramu", "password2"));
		persons.put("username3", new Person("username3", "kittu", "password3"));

		System.out.println("Welcome to the Booking of the Ride Application");

		try {
			sc = new Scanner(System.in);
			Login.userLogin();

			do {
				System.out.println("Select an option");
				System.out.println("1) Find a ride");
				System.out.println("2) Offer a ride");
				System.out.println("3) About Us");
				System.out.println("4) Exit");
				System.out.print("Enter your choice: ");
				int choice = Integer.parseInt(sc.next());
				switch (choice) {
				case 1:
					FindRide.findRide();
					break;
				case 2:
					OfferRide.offerRide();
					break;
				case 3:
					aboutUs();
					break;
				case 4:
					System.out.println("\nThank you");
					System.exit(0);
				default:
					System.out.println("Enter a valid choice:");
				}

			} while (true);

		} finally {
			sc.close();
		}

	}

	private static void aboutUs() {
		System.out.println("Our application makes our travel easier and smoother");
	}

}
