/**
 * 
 */
package PaymentInfo;

/**
 * @author AKSHAY
 *
 */
public class Payment {
	private String paymentID;
	/**
	 * @return the paymentID
	 */
	public String getPaymentID() {
		return paymentID;
	}
	/**
	 * @param paymentID the paymentID to set
	 */
	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}
	/**
	 * @return the totalAmount
	 */
	public double getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	private double totalAmount;

}
