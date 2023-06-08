package Main;

import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Scanner;

import javax.management.Query;

import AddressInfo.Address;
import PersonInfo.Account;
import PersonInfo.AccountStatus;
import PersonInfo.Gender;
import PersonInfo.Person;
import PersonInfo.Usertype;

public class Main {
	static Person obj = new Person();
	static Address object = new Address();
	static Account acc = new Account();
	static Main login = new Main();
	
	public Statement stm = null ;
	public ResultSet rs = null;
	
	public Main(){
		
		try{
			/** creating a driver class */
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			/** creating a connection */
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","akshay","oracle123");

			/** creating a statement*/
			stm = con.createStatement();

			}	catch(Exception e)	{
		
			System.out.println(e);
		}
		
	}
	
	public void loginDetails(Usertype user ) {
		
		Scanner console = new Scanner(System.in);		
		String name = null;
		try {
			System.out.println("Enter the user name");
			name = console.next();
			obj.setPersonName(name);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		long mobileno =0;
		try {
			System.out.println("enter the Mobile number");
			mobileno = console.nextLong();
			obj.setPersonMobileNo(mobileno);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		int age=0;
		try {
			System.out.println("enter the age");
			age = console.nextInt();
			obj.setPersonAge(age);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		String email=null;
		try {
			System.out.println("enter the emailID");
			email = console.next();
			obj.setPersonEmail(email);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		Gender gen = null;
		try {
			System.out.println("enter the gender");
			
			System.out.println("1.MALE \n2.FEMALE \n3.TRANSGENDER ");
			gen = null ;
			int ch = console.nextInt();
			switch(ch) {
				case 1:
					gen = Gender.MALE;
					break;
				case 2:
					gen = Gender.FEMALE;
					break;
				case 3:
					gen = Gender.TRANSGENDER;
					break;
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
											// Address
		
		String address = null;
		try {
			System.out.println("enter the Address");
			address = console.next();
			object.setAddress(address);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		String username =null;
		try {
			System.out.println("Enter the user name");
			username = console.next();
			acc.setUserName(username);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		String password = null;
		try {
			System.out.println("Enter the password");
			password = console.next();
			acc.setPassword(password);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		obj = new Person(name , age,mobileno, gen , email,object,acc);
		
		String qry = null;
		
		switch(user) {
		case CUSTOMER:
			qry = "insert into customer values(customerid_seq.nextval,'"+name+"',"+mobileno+","+age+", '"+email+"','"+gen+"','"+address+"','"+username+"','"+password+"')";
			break;
		case ADMIN:
			qry = "insert into admin values(adminid_seq.nextval,'"+name+"',"+mobileno+","+age+", '"+email+"','"+gen+"','"+address+"','"+username+"','"+password+"')";
			break;
		case EMPLOYEE:
			qry = "insert into employee values(empolyeeid_seq.nextval,'"+name+"',"+mobileno+","+age+", '"+email+"','"+gen+"','"+address+"','"+username+"','"+password+"')";
			break;
			
		}
		try {
			stm.executeQuery(qry);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("ROW got INSERTED");

		
	}
	
	public static void main(String[] args) {
		ArrayList<Person> personstore = new ArrayList<Person>();
		System.out.println("--------------------------------------");
		System.out.println("Welcome to online movie ticket booking");
		boolean out = true;
		while (out ==true) {
			Scanner console = new Scanner(System.in);
			System.out.println("--------------------------------------");
			System.out.println("Enter the option:");
			System.out.println("1. customer \n2.Admin \n3.Employee \n4.logout");
			System.out.println("--------------------------------------");
			int choice = console.nextInt();
			switch(choice) {
			case 1:		
															//Customer Login
				acc.setUsertype(Usertype.CUSTOMER);
				boolean s = true;
				while (s == true) {
					System.out.println("--------------------------------------");
					System.out.println("Enter your option:");
					System.out.println("--------------------------------------");
					System.out.println("1.Create account \n2.To login \n3.To logout");
					System.out.println("--------------------------------------");
					int option = console.nextInt();
					switch (option) {
					case 1:
						
						login.loginDetails(acc.getUsertype());
						
						acc.setAccountStatus(AccountStatus.CLOSED);
						break;
					case 2:
						System.out.println("Enter the user name");
						String name = console.next();
						System.out.println("Enter the password");
						String passcode = console.next();
						acc.verification(name, passcode,acc.getUsertype());
						System.out.println("--------------------------------------");
						System.out.println("enter your options");
						boolean x = true;
						while(x == true) {
							System.out.println("--------------------------------------");
							System.out.println("1.user Details \n2.change password \n3.main page");
							System.out.println("--------------------------------------");
							int choose1 = console.nextInt();
							switch(choose1) {
							
							case 1:
								obj.displayPerson(acc.getUsertype(),name);
								object.displayAddress();
								break;
							case 2:
								acc.changePassword();
								break;
							case 3:
								
								x = false;
								break;
								
							}
						}
					case 3:
						acc.setAccountStatus(AccountStatus.CLOSED);
						System.out.println("-----logged out-----");
						s = false;
						break;
						
					}
			}
				break;
			case 2:								//Admin login
				boolean w = true;
				while (w == true) {
					System.out.println("--------------------------------------");
					System.out.println("Enter your option:");
					System.out.println("--------------------------------------");
					System.out.println("1.Create account \n2.To login \n3.To logout");
					System.out.println("--------------------------------------");
					int option2 = console.nextInt();
					switch(option2) {
					case 1:
						acc.setUsertype(Usertype.ADMIN);
						login.loginDetails(acc.getUsertype());
						
						acc.setAccountStatus(AccountStatus.CLOSED);
						break;
					case 2:
						System.out.println("Enter the user name");
						String nameadmin = console.next();
						System.out.println("Enter the password");
						String passcodeadmin = console.next();
						acc.verification(nameadmin, passcodeadmin,acc.getUsertype());
						System.out.println("--------------------------------------");
						System.out.println("enter the option");
						boolean z = true;
						while(z == true) {
							System.out.println("--------------------------------------");
							System.out.println(" 1.user Details \n 2.change password \n 3.main page");
							System.out.println("--------------------------------------");
							int choose1 = console.nextInt();
							switch(choose1) {
							case 1:
								obj.displayPerson(acc.getUsertype(),nameadmin);
								
								object.displayAddress();
								break;
							case 2:
								acc.changePassword();
								break;
							case 3:
								
								z = false;
								break;
							}
						}
					case 3:
						acc.setAccountStatus(AccountStatus.CLOSED);
						System.out.println("-----logged out-----");
						w = false;
						break;
									
						
					}
					
				}
			case 3:									//Employee Login
				boolean q = true;
				while (q == true) {
					System.out.println("--------------------------------------");
					System.out.println("Enter your option:");
					System.out.println("--------------------------------------");
					System.out.println("1.Create account \n 2.To login \n 3.To logout");
					System.out.println("--------------------------------------");
					int option2 = console.nextInt();
					switch(option2) {
					case 1:
						acc.setUsertype(Usertype.EMPLOYEE);
						login.loginDetails(acc.getUsertype());
						
						acc.setAccountStatus(AccountStatus.CLOSED);
						break;
						
					case 2:
						
						System.out.println("Enter the user name");
						String nameemp = console.next();
						System.out.println("Enter the password");
						String passcodeemp = console.next();
						acc.verification(nameemp, passcodeemp,acc.getUsertype());
						System.out.println("--------------------------------------");
						System.out.println("enter the option");
						boolean z = true;
						while(z == true) {
							System.out.println("--------------------------------------");
							System.out.println("1.user Details \n 2.change password \n 3. adddress details \n  4.main page");
							System.out.println("--------------------------------------");
							int choose1 = console.nextInt();
							switch(choose1) {
							case 1:
								obj.displayPerson(acc.getUsertype(),nameemp);
								object.displayAddress();
								break;
							case 2:
								acc.changePassword();
								break;
							case 3:
								
								z = false;
								break;
								
							}
						}
					case 3:
						acc.setAccountStatus(AccountStatus.CLOSED);
						System.out.println("-----LOGGED OUT-----");
						q = false;
						break;
									
						
					}
					
				}	
			case 4:	
				out = false;
				System.out.println("-----LOGGED OUT----");
				break;
			
				}
		}
	}

}
