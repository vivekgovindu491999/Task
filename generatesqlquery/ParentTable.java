package generatesqlquery;

/**
 * This class to create child table object and assign the size
 * 
 * @author vivek
 *
 */
class ParentTable extends Table {
	private int noOfChildren;
	private Table[] children;

	/**
	 * The children count
	 * 
	 * @return The number of children
	 */
	public int getChildrenCount() {
		return noOfChildren;
	}

	/**
	 * Sets the no of children and assigns the array size
	 * 
	 * @param no_children To create the array of specified size
	 */
	public void setChildrenCount(int noOfChildren) {
		this.noOfChildren = noOfChildren;
		children = new Table[noOfChildren];
	}

	/**
	 * To return the array of type table
	 * 
	 * @return children array of tables
	 */
	public Table[] getChildren() {
		return children;
	}

}