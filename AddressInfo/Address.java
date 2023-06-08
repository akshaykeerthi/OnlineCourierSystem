/**
 * 
 */
package AddressInfo;

import java.util.ArrayList;

import PersonInfo.Person;

/**
 * @author AKSHAY
 *
 */
public class Address {
	String address;
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Person> addressstore = new ArrayList<Person>();
	
	public Address(String address){
		this.address = address;
	}
	
	public Address() {
		
	}
	
	public void displayAddress() {
		
		System.out.println("Address : "+address);
	
	}

}
