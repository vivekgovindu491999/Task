package generatesqlquery;

import java.util.List;

/**
 * This class is to print the output query
 * 
 * @author vivek
 *
 */
class SqlView {

	public static void printQuery(ParentTable parentTable) {
		StringBuffer outputString=new StringBuffer();
		//parent table
		outputString.append("CREATE OR REPLACE VIEW " + parentTable.getName().toUpperCase() + "\n("+"\n");
		for (String column : parentTable.getColumns()) {
			outputString.append("\t" + column + ","+"\n");
		}
		outputString.append(")\nAs"+"\n");
		
		// child table
		for (int number = 0; number < parentTable.getChildrenCount(); number++) {
			outputString.append("SELECT"+"\n");
			List<String> columnsList = parentTable.getChildren()[number].getColumns();
			for (String columnName : parentTable.getColumns()) {
				if (columnsList.contains(columnName)) {
					outputString.append("\t" + columnName + ","+"\n");
				} else {
					outputString.append("\tnull as " + columnName + ","+"\n");
				}
			}
			outputString.append("FROM " + parentTable.getChildren()[number].getName().toUpperCase()+"\n");
			if (number != (parentTable.getChildrenCount() - 1)) {
				outputString.append("UNION ALL"+"\n");
			}
		}
		System.out.println(outputString);
	}
}
