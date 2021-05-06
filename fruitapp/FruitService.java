package fruitapp;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

/**
 * This class is to provide all the services of the fruit shop
 * 
 * @author vivek
 *
 */
public class FruitService {
	/**
	 * fruitsList is a map where key contains the id number of the fruit and the
	 * value as the fruit object containing details of the fruit
	 */
	private static Map<Integer, Fruit> fruitsList = new HashMap<Integer, Fruit>();
	private static Person currentPerson;
	static Scanner sc = new Scanner(System.in);

	/**
	 * To initialize the fruits that are present in the fruit shop with all details
	 * of fruit
	 */
	public static void initFruits() {
		fruitsList.put(1, new Fruit(1, "Banana", 45.0, "08/05/2021", "LOW"));
		fruitsList.put(2, new Fruit(2, "Apple", 100.0, "07/05/2021", "LOW"));
		fruitsList.put(3, new Fruit(3, "Apple", 120.0, "09/05/2021", "BEST"));
		fruitsList.put(4, new Fruit(4, "Orange", 80.0, "10/05/2021", "BEST"));
		fruitsList.put(5, new Fruit(5, "Papaya", 50.0, "07/05/2021", "BEST"));
		fruitsList.put(6, new Fruit(6, "Avocado", 70.0, "11/05/2021", "LOW"));
		fruitsList.put(7, new Fruit(7, "Grapes", 120.0, "14/05/2021", "BEST"));
	}

	public static void setcurrentPerson(Person current) {
		currentPerson = current;
	}

	/**
	 * To display all the fruits present in fruit shop
	 */
	public static void showFruits() {
		for (Fruit fruit : fruitsList.values()) {
			System.out.println("IdNo:" + fruit.getId() + " , Name of Fruit: " + fruit.getName() + "  " + ",  Price: "
					+ fruit.getPrice() + "  ,   Best Before: " + fruit.getBestBefore() + " ,   Quality: "
					+ fruit.getQuality());
			System.out.println();

		}
		buyFruits();

	}

	/**
	 * To ask the user to select the fruits and the quantity and add them to his
	 * cart
	 */
	public static void buyFruits() {
		Map<Integer, Integer> personCart = currentPerson.getCart();
		char choice;
		do {
			System.out.print("Enter the IdNo of fruit you want to select: ");
			int idNo = sc.nextInt();

			if (!fruitsList.containsKey(idNo))
				throw new RuntimeException("Enter a valid fruit Id");

			System.out.print("Enter the quantity: ");
			int quantity = sc.nextInt();

			if (personCart.containsKey(idNo))
				personCart.put(idNo, personCart.get(idNo) + quantity);
			else
				personCart.put(idNo, quantity);

			System.out.println(quantity + " " + fruitsList.get(idNo).getName() + " have been added  to your cart");

			System.out.print("\nDo you want to add more fruits to your cart y/n: ");
			choice = sc.next().charAt(0);
		} while (choice == 'y' || choice == 'Y');

	}

	/**
	 * The view cart displays all the items that the user have selected to purchase
	 */
	public static void viewCart() {
		Map<Integer, Integer> personCart = currentPerson.getCart();
		if (personCart.size() == 0) {
			System.out.println("Your cart is empty");
		} else {
			for (Integer idNo : personCart.keySet()) {
				Fruit fruit = fruitsList.get(idNo);
				double price = fruit.getPrice() * personCart.get(idNo);
				System.out.println("IdNo: " + idNo + "\nName of Fruit: " + fruit.getName() + "\nQuantity: "
						+ personCart.get(idNo) + "\nPrice: " + price + "\nBestBefore: " + fruit.getBestBefore()
						+ " \nQuality: " + fruit.getQuality() + "\n");
			}
		}
	}

	/**
	 * In checkOutCart method the total price of our cart is displayed along with
	 * all the items we have purchased
	 */
	public static void checkOutCart() {
		Map<Integer, Integer> personCart = currentPerson.getCart();

		if (personCart.size() == 0) {
			System.out.println("Your cart is empty...");
		} else {
			double totalAmount = 0.0;
			for (Integer idNo : personCart.keySet()) {
				boolean isEligible = false;
				double price;
				Fruit fruit = fruitsList.get(idNo);
				/**
				 * checking whether the user have added more than 5 items of similar fruits if
				 * added give an item free of cost
				 */
				if (personCart.get(idNo) >= 5) {
					personCart.put(idNo, personCart.get(idNo) + 1);
					price = fruit.getPrice() * (personCart.get(idNo) - 1);
					isEligible = true;
				} else {
					price = fruit.getPrice() * personCart.get(idNo);
				}
				totalAmount += price;
				/**
				 * printing the details of the cart and the total amount
				 */
				System.out.println("IdNo: " + idNo + "\nName of Fruit: " + fruit.getName() + "\nQuantity: "
						+ personCart.get(idNo) + "\nPrice: " + price + "\nBestBefore(Days): " + fruit.getBestBefore()
						+ "\nQuality: " + fruit.getQuality() + "\n");
				if (isEligible == true) {
					System.out.println("Yay! You have used the offer, you got an extra fruit into your cart" + "\n");

				}

			}
			/**
			 * If the total billing amount is greater than 1000 give a discount of 5 percent
			 */
			if (totalAmount > 1000.0) {

				totalAmount = totalAmount - ((totalAmount * 5) / 100);
				System.out.println("Total Amount is = " + totalAmount);
			} else
				System.out.println("Total Amount  = " + totalAmount);

		}

	}

}
