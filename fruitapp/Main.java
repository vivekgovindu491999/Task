package fruitapp;

/**
 * This class calls login function and initialize fruits and prints the menu to select
 */
import java.util.Scanner;

public class Main {
	static Scanner sc;

	/**
	 * 
	 * This method shows the menu and also displays any offers are available
	 */

	public static void getMenu() {
		System.out.println("-----------Menu--------------");
		System.out.println("1. Show Fruits");
		System.out.println("2. View Cart");
		System.out.println("3. Check Out");
		System.out.println("4. Exit");
		System.out.println("Offer::: Buy any fruit of 5 items and more and get an extra item free");
		System.out.print("Offer::: Make a total bill of more than 1000 get 5% discount\n");
		System.out.println("----------------------------");
		System.out.println("Please enter your choice : \n");
	}

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println("Welcome to the Fruit shop Application");
		Person currentPerson = Login.userLogin();
		FruitService.setcurrentPerson(currentPerson);
		FruitService.initFruits();
		do {
			getMenu();
			int inputChoice = sc.nextInt();
			System.out.println();
			switch (inputChoice) {
			case 1:
				FruitService.showFruits();
				break;
			case 2:
				FruitService.viewCart();
				break;
			case 3:
				FruitService.checkOutCart();
				break;
			case 4:
				System.out.println("\nThank you for using our Fruit Shop application\n");
				System.exit(0);
			default:
				System.out.println("Please enter a valid choice\n");
			}

		} while (true);

	}

}
