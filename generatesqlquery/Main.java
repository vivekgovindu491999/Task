package generatesqlquery;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Takes the input of Tables and calls the printQuery method to display the
 * output
 * 
 * @author vivek
 *
 */
class Main {
	static Scanner sc;
	static ParentTable parentTable = new ParentTable();
	static Table[] childTable;

	public static void main(String[] args) {

		try {
			sc = new Scanner(System.in);

			inputParentTable();
			childTable = parentTable.getChildren();

			for (int number = 0; number < parentTable.getChildrenCount(); number++) {
				// Reading child table columns
				inputChildTable(number);
			}
			SqlView.printQuery(parentTable);
		} finally {
			sc.close();
		}

	}

	/*
	 * reading child table
	 */
	static void inputChildTable(int number) {

		childTable[number] = new Table();
		System.out.print("Enter Table Name: ");
		childTable[number].setName(sc.nextLine());
		System.out.println("Enter the table columns:");
		List<String> columnsList = new ArrayList<>();
		while (true) {
			String columnName = sc.nextLine();
			/*
			 * condition to exit
			 */
			if (columnName.equals(""))
				break;

			if (parentTable.hasColumnName(columnName)) {
				columnsList.add(columnName);
			} else {
				throw new RuntimeException("The column \"" + columnName
						+ "\" is not allowed as it is not defined in parent table \"" + parentTable.getName() + "\"");
			}

		}
		childTable[number].setColumns(columnsList);

	}

	/*
	 * reading parent table
	 */
	static void inputParentTable() {
		System.out.print("Enter parent table name:");
		parentTable.setName(sc.nextLine());

		System.out.println("Enter the table columns:");
		List<String> columnList = new ArrayList<>();
		while (true) {
			String columnName = sc.nextLine();
			/*
			 * condition to exit from inputs
			 */
			if (columnName.equals(""))
				break;
			columnList.add(columnName);
		}
		parentTable.setColumns(columnList);

		System.out.println("Enter No. of tables: ");
		int noOfChildren;
		while (true) {
			noOfChildren = Integer.parseInt(sc.nextLine());
			if (noOfChildren <= 3) {
				parentTable.setChildrenCount(noOfChildren);
				break;
			} else {
				System.out.println("Maximum of 3 children only");

			}
		}

	}
}