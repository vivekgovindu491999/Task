package bookride;

/**
 * This class is to offer a ride We take the input of all the details of the
 * ride and add the details to the trip
 * 
 * @author Dell
 *
 */
public class OfferRide extends Main {

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
		FindRide.trip.add(
				new DetailsOfTrip(userName, carType, noOfPassengers, fromAddress, toAddress, carModel, dateAndTime));
		System.out.println("Your ride is successfully offered from " + fromAddress + "  to " + toAddress);
	}

}
