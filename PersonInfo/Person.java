/**
 * 
 */
package PersonInfo;

import java.util.ArrayList;

import AddressInfo.Address;
import Main.Main;
import PersonInfo.Gender;

/**
 * @author AKSHAY
 *
 */
public class Person {
	private String personName;
	/**
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}
	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	/**
	 * @return the personAge
	 */
	public int getPersonAge() {
		return personAge;
	}
	/**
	 * @param personAge the personAge to set
	 */
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	/**
	 * @return the personMobileNo
	 */
	public long getPersonMobileNo() {
		return personMobileNo;
	}
	/**
	 * @param personMobileNo the personMobileNo to set
	 */
	public void setPersonMobileNo(long personMobileNo) {
		this.personMobileNo = personMobileNo;
	}
	/**
	 * @return the personGender
	 */
	public Gender getPersonGender() {
		return personGender;
	}
	/**
	 * @param personGender the personGender to set
	 */
	public void setPersonGender(Gender personGender) {
		this.personGender = personGender;
	}
	/**
	 * @return the personEmail
	 */
	public String getPersonEmail() {
		return personEmail;
	}
	/**
	 * @param personEmail the personEmail to set
	 */
	public void setPersonEmail(String personEmail) {
		this.personEmail = personEmail;
	}
	/**
	 * @return the personAddress
	 */
	public AddressInfo.Address getPersonAddress() {
		return personAddress;
	}
	/**
	 * @param personAddress the personAddress to set
	 */
	public void setPersonAddress(AddressInfo.Address personAddress) {
		this.personAddress = personAddress;
		
		
	}
	private int personAge;
	private long personMobileNo;
	private Gender personGender;
	private String personEmail;
	private AddressInfo.Address personAddress;
	 Account account = new Account();

	
		//constructor
	
	public Person(String personName,int personAge,long personMobileNo,Gender personGender,String personEmail,Address personAddress,Account account){
		this.personName = personName;
		this.personAge = personAge;
		this.personMobileNo = personMobileNo;
		this.personGender = personGender;
		this.personEmail = personEmail;
		this.personAddress = personAddress;
		this.account = account;
			
	}
	public Person() {
		
	}
	
	public void displayPerson(Usertype user,String username) {
		Main connect = new Main();
		//String username = null;
		switch(user) {
		case CUSTOMER :
			try {
				String qry = "select * from customer where cust_username='"+username+"'";
				connect.rs = connect.stm.executeQuery(qry);
				while(connect.rs.next()) {
					System.out.println(connect.rs.getInt("cust_id")+"\n "+connect.rs.getString("cust_name")+"\n"+connect.rs.getLong("cust_mobileno")+"\n"+ connect.rs.getInt("cust_age")+"\n"+connect.rs.getString("cust_email")+"\n"+connect.rs.getString("cust_gender")+"\n"+connect.rs.getString("cust_address"));
					
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			break;
			
		case ADMIN :
			try {
				String qry = "select * from admin where ad_username="+username;
				connect.rs = connect.stm.executeQuery(qry);
				while(connect.rs.next()) {
					System.out.println(connect.rs.getInt("ad_id")+"\n "+connect.rs.getString("ad_name")+"\n"+connect.rs.getLong("ad_mobileno")+"\n"+ connect.rs.getInt("ad_age")+"\n"+connect.rs.getString("ad_email")+"\n"+connect.rs.getString("ad_gender")+"\n"+connect.rs.getString("ad_address"));
					
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			break;
			
		case EMPLOYEE :
			try {
				String qry = "select * from employee where emp_username="+username;
				connect.rs = connect.stm.executeQuery(qry);
				while(connect.rs.next()) {
					System.out.println(connect.rs.getInt("emp_id")+"\n "+connect.rs.getString("emp_name")+"\n"+connect.rs.getLong("emp_mobileno")+"\n"+ connect.rs.getInt("emp_age")+"\n"+connect.rs.getString("emp_email")+"\n"+connect.rs.getString("emp_gender")+"\n"+connect.rs.getString("emp_address"));
					
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}

			
			break;
		}
		
		
		
		
	}
	
	

}
