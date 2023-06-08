/**
 * 
 */
package PersonInfo;

import PersonInfo.AccountStatus;
import PersonInfo.Usertype;

import java.util.ArrayList;
import java.util.Scanner;

import Main.Main;

/**
 * @author AKSHAY
 *
 */
public class Account {
	private String username;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return username;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the accountStatus
	 */
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}
	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}
	/**
	 * @return the usertype
	 */
	public Usertype getUsertype() {
		return usertype;
	}
	/**
	 * @param usertype the usertype to set
	 */
	public void setUsertype(Usertype usertype) {
		this.usertype = usertype;
	}
	private String password;
	private AccountStatus accountStatus;
	private Usertype usertype;
	ArrayList<String> accountstore = new ArrayList<String>();
	
															//Constructor
	Account(String userName,String password){
		this.username = username;
		this.password = password;
		
	}
	public Account(){
		
	}
	public boolean verification(String username,String password,Usertype user) {
		Main connect = new Main();
		String qry;
		boolean verify =false;
		switch(user) {
		case CUSTOMER :
			try {
				
				qry ="select cust_username,cust_password from customer where cust_username='"+username+"' and cust_password='"+password+"'";
				connect.rs = connect.stm.executeQuery(qry);
				while(connect.rs.next()) {
					verify = true;
				}
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
			break;
			
		case ADMIN :
			try {
				
				qry ="select ad_username,ad_password from admin where ad_username ="+username;
				connect.rs = connect.stm.executeQuery(qry);
				while(connect.rs.next()) {
					verify = true;
				}
				break;
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		case EMPLOYEE :
			try {
				
				qry ="select emp_username,emp_password from employee where emp_username ="+username;
				connect.rs = connect.stm.executeQuery(qry);
				while(connect.rs.next()) {
					verify =true;
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			break;
		
		}
		return verify;
	}

	public void changePassword() {
		Scanner console = new Scanner(System.in);
		System.out.println("enter the user name");
		String name = console.next();
		System.out.println("enter the password");
		String passcode = console.next();
		setUserName(name);
		setPassword(passcode);
		

		}

}
