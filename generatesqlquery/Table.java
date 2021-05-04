package generatesqlquery;

import java.util.Collections;
import java.util.List;

/**
 * The class is used to represent the table name and columns
 * 
 * @author vivek
 *
 */
public class Table {
	private String tableName;
	private List<String> columns;

	/**
	 * Sets the table name
	 * 
	 * @param name To set name of table
	 */
	public void setName(String name) {
		this.tableName = name;
	}

	/**
	 * Sets the table object columns
	 * 
	 * @param col A list containing the columns
	 */
	public void setColumns(List<String> column) {
		Collections.sort(column);
		this.columns = column;
	}

	/**
	 * gets the table name
	 * 
	 * @return name of the table
	 */
	public String getName() {
		return tableName;
	}

	/**
	 * gets the columns
	 * 
	 * @return A list containing the columns
	 */
	public List<String> getColumns() {
		return columns;
	}

	/**
	 * This method checks whether the column is present in parent columns or not
	 * 
	 * @param column The column name to be checked
	 * @return true when exists else false
	 */
	boolean hasColumnName(String column) {
		if (columns.contains(column))
			return true;
		else
			return false;
	}
}
