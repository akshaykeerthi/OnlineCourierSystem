/**
 * 
 */
package PersonInfo;

import java.util.ArrayList;

/**
 * @author AKSHAY
 *
 */
public class Customer {
	private String customerID;
	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the customerFavorites
	 */
	ArrayList<String> customerstore = new ArrayList<String>();
				//constructor
	Customer(String customerID){
		this.customerID = customerID;
	}
	public Customer() {
		
	}

}

