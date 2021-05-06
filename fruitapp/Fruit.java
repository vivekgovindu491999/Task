package fruitapp;

/**
 * This class contains the details about the fruit
 * 
 * @author vivek
 *
 */
public class Fruit {

	final private int idNo;
	final private String name;
	private double price;
	private String bestBefore;
	private String quality;

	/**
	 * The constructor to initialize the fruit fields
	 * 
	 * @param idNo  To identify the fruit
	 * @param name  name of the fruit
	 * @param price price of the fruit
	 */
	public Fruit(int idNo, String name, double price, String bestBefore, String quality) {
		this.idNo = idNo;
		this.name = name;
		this.price = price;
		this.bestBefore = bestBefore;
		this.quality = quality;
	}

	/**
	 * To get the name of the fruit
	 * 
	 * @return name of fruit
	 */
	public String getName() {
		return name;
	}

	/**
	 * To get the price of the fruit
	 * 
	 * @return price of fruit
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * To get the id of the fruit
	 * 
	 * @return id of fruit
	 */
	public int getId() {
		return idNo;
	}

	/**
	 * To get the best before in days
	 * 
	 * @return bestBefore
	 */
	public String getBestBefore() {
		return bestBefore;
	}

	public String getQuality() {
		return quality;
	}
}