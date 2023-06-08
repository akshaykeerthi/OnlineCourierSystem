/**
 * 
 */
package BookingInfo;

import BookingInfo.BookingStatus;
import PaymentInfo.Payment;

/**
 * @author user
 *
 */
public class Booking {
	private int customerID;
	private int bookingID;
	private BookingStatus bookingStatus;
	private Payment payment;
	private String bookingDate;
	private String pickUpLocation;
	private String dropInLocation;
	private String deliveryToName;
	private long deliveryMobileNumber;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getBookingID() {
		return bookingID;
	}
	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}
	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public String getPickUpLocation() {
		return pickUpLocation;
	}
	public void setPickUpLocation(String pickUpLocation) {
		this.pickUpLocation = pickUpLocation;
	}
	public String getDropInLocation() {
		return dropInLocation;
	}
	public void setDropInLocation(String dropInLocation) {
		this.dropInLocation = dropInLocation;
	}
	public String getDeliveryToName() {
		return deliveryToName;
	}
	public void setDeliveryToName(String deliveryToName) {
		this.deliveryToName = deliveryToName;
	}
	public long getDeliveryMobileNumber() {
		return deliveryMobileNumber;
	}
	public void setDeliveryMobileNumber(long deliveryMobileNumber) {
		this.deliveryMobileNumber = deliveryMobileNumber;
	}
	
	Booking(int customerID,int bookingID,BookingStatus bookingStatus,Payment payment,String bookingDate,String pickUpLocation,String dropInLocation,String deliveryToName,long deliveryMobileNumber){
		this.customerID = customerID;
		this.bookingID = bookingID;
		this.bookingStatus = bookingStatus;
		this.payment = payment;
		this.bookingDate = bookingDate;
		this.pickUpLocation = pickUpLocation;
		this.dropInLocation = dropInLocation;
		this.deliveryToName = deliveryToName;
		this.deliveryMobileNumber = deliveryMobileNumber;
	}
	
	Booking(){
		
	}
	
	
	

	
	

}
