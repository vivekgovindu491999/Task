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
public class FindRide{
	
	static Scanner sc=new Scanner(System.in);
	public static void findRide(List<DetailsOfTrip> trip) {
		
		System.out.println("Enter From Address: ");
		String fromAddress = sc.next();

		System.out.println("Enter To Address: ");
		String toAddress = sc.next();

		System.out.println("Enter no of passengers: ");
		int noPassengers = sc.nextInt();

		System.out.println("\nSearching rides to " + toAddress + "\n");

		List<DetailsOfTrip> eligibleTrip = new ArrayList<DetailsOfTrip>();
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

}
