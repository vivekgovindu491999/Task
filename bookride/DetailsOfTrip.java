package bookride;

/**
 * This class gets and sets all the details of the trip
 * 
 * @author Dell
 *
 */
public class DetailsOfTrip {

	private String userName;
	private String carModel;
	private String carType;
	private int noOfPassengers;
	private String fromAddress;
	private String toAddress;
	private String dateAndTime;

	/**
	 * This is the constructor to set the variables
	 * 
	 * @param userName       userName of the user
	 * @param carType        type of the car
	 * @param noOfPassengers total passengers
	 * @param fromAddress    starting location
	 * @param toAddress      ending location
	 * @param carName        name of car
	 * @param dateAndTime    date and time of journey
	 */
	public DetailsOfTrip(String userName, String carType, int noOfPassengers, String fromAddress, String toAddress,
			String carName, String dateAndTime) {
		super();
		this.userName = userName;
		this.carModel = carName;
		this.carType = carType;
		this.noOfPassengers = noOfPassengers;
		this.fromAddress = fromAddress;
		this.toAddress = toAddress;
		this.dateAndTime = dateAndTime;
	}

	/**
	 * To get the userName
	 * 
	 * @return userName of the user
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * To get the carName
	 * 
	 * @return name of the car
	 */

	public String getCarName() {
		return carModel;
	}

	/**
	 * To get type of car
	 * 
	 * @return type of car
	 */
	public String getCarType() {
		return carType;
	}

	/**
	 * To get total passengers
	 * 
	 * @return number of passengers
	 */
	public int getNoOfPassengers() {
		return noOfPassengers;
	}

	/**
	 * To get from address
	 * 
	 * @return fromAddress
	 */

	public String getFromAddress() {
		return fromAddress;
	}

	/**
	 * To get to Address
	 * 
	 * @return toAddress
	 */
	public String getToAddress() {
		return toAddress;
	}

	/**
	 * To get date and time
	 * 
	 * @return dateAndTime
	 */

	public String getRideDateAndTime() {
		return dateAndTime;
	}

}