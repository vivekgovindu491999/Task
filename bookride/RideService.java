package bookride;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class take input of from and to addresses and checks whether the trip
 * details are available if available books a ride else print some message
 * 
 * @author vivek
 *
 */
public class RideService {
	/**
	 * eligibleTrip contains all trip details which are matching of users from and
	 * to addresses
	 */
	private static List<DetailsOfTrip> eligibleTrip = new ArrayList<DetailsOfTrip>();
	/**
	 * trip list contains all the objects having their detaills of trip
	 */
	private static List<DetailsOfTrip> trip;
	static Scanner sc = new Scanner(System.in);

	/**
	 * This method take input of from and to addresses and checks whether the trip
	 * details are available if available books a ride else print some message
	 * 
	 * @param trip
	 */
	public static void findRide() {
		trip = new ArrayList<DetailsOfTrip>();
		trip.add(new DetailsOfTrip("username1", "pool", 3, "delhi", "vizag", "baleno", "31/05/2022 11:30:10"));
		trip.add(new DetailsOfTrip("username2", "maxi", 4, "bangalore", "Warangal", "honda", "19/06/2022 11:10:00"));
		System.out.println("Enter From Address: ");
		String fromAddress = sc.next();

		System.out.println("Enter To Address: ");
		String toAddress = sc.next();

		System.out.println("Enter no of passengers: ");
		int noPassengers = sc.nextInt();

		System.out.println("\nSearching rides to " + toAddress + "\n");

		for (DetailsOfTrip detail : trip) {
			if (detail.getFromAddress().equals(fromAddress) && detail.getToAddress().equals(toAddress)
					&& detail.getNoOfPassengers() > 0 && detail.getNoOfPassengers() >= noPassengers) {
				eligibleTrip.add(detail);
			}
		}
		if (eligibleTrip.isEmpty()) {
			System.out.println("Sorry could not find any ride");
		} else {
			int c = 1;
			for (DetailsOfTrip ride : eligibleTrip) {

				System.out.print("Number:" + c + "\nRider name:" + ride.getUserName() + "\nName of car:"
						+ ride.getCarName() + "\ncar model:" + ride.getCarType() + "\nRide date:"
						+ ride.getRideDateAndTime() + "\n");
				c++;
			}
			System.out.println("\nEnter the number for which you want to book: ");
			int num = Integer.parseInt(sc.next());

			DetailsOfTrip ride = eligibleTrip.get(num - 1);
			trip.remove(num - 1);
			System.out.println("Your ride from " + ride.getFromAddress() + " to " + ride.getToAddress()
					+ " is booked on " + ride.getRideDateAndTime());

		}

	}

	/**
	 * This method offers a ride by taking all the details of the ride and adding
	 * them to trip details
	 * 
	 * @param trip
	 */
	public static void offerRide() {

		System.out.println("Enter the username:");
		String userName = sc.next();
		System.out.println("Enter the car model:");
		String carModel = sc.next();
		System.out.println("Enter the car type:");
		String carType = sc.next();
		System.out.println("Enter the no of passengers:");
		int noOfPassengers = sc.nextInt();
		System.out.println("Enter the from address:");
		String fromAddress = sc.next();
		System.out.println("Enter the to address:");
		String toAddress = sc.next();
		sc.nextLine();
		System.out.println("Enter the date and time:");
		String dateAndTime = sc.nextLine();
		trip.add(new DetailsOfTrip(userName, carType, noOfPassengers, fromAddress, toAddress, carModel, dateAndTime));
		System.out.println("Your ride is successfully offered from " + fromAddress + "  to " + toAddress + "\n");
		System.out.println("The offered rides are:" + "\n");

	}

}