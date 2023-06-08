/**
 * 
 */
package PersonInfo;

import java.util.ArrayList;

/**
 * @author AKSHAY
 *
 */
public class Employee {
	private String employeeID;

	/**
	 * @return the employeeID
	 */
	public String getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	
	ArrayList<String> employeestore = new ArrayList<String>();
			//constructor
	
	Employee(String employeeID){
		this.employeeID = employeeID;
	}
	public Employee() {
		
	}

}
