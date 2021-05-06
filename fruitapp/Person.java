package fruitapp;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Person class is the user having userName and password as credentials and user
 * also contains a cart to add the fruits
 * 
 * @author vivek
 *
 */
public class Person {
	private String userName;
	private String name;
	private String password;
	private Map<Integer, Integer> cart;

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

	/**
	 * To create a cart for the user
	 * 
	 * @return cart
	 */
	public Map<Integer, Integer> getCart() {
		if (cart == null)
			cart = new LinkedHashMap<Integer, Integer>();
		return cart;
	}
}