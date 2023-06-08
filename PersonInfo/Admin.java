/**
 * 
 */
package PersonInfo;

import java.util.ArrayList;

/**
 * @author AKSHAY
 *
 */
public class Admin {
	/**
	 * @return the adminID
	 */
	public String getAdminID() {
		return adminID;
	}
	/**
	 * @param adminID the adminID to set
	 */
	public void setAdminID(String adminID) {
		this.adminID = adminID;
	}
	/**
	 * @return the adminGrade
	 */
	private String adminID;
	
	ArrayList<String> adminstore = new ArrayList<String>();
				//constructor
	
	Admin(String adminID){
		this.adminID = adminID;
	}
	public Admin() {
		
	}
	
}
