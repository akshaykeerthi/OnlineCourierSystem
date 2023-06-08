/**
 * 
 */
package PaymentInfo;

/**
 * @author AKSHAY
 *
 */
public class Card {
	private long cardNo;
	/**
	 * @return the cardNo
	 */
	public long getCardNo() {
		return cardNo;
	}
	/**
	 * @param cardNo the cardNo to set
	 */
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	/**
	 * @return the nameOnCard
	 */
	public String getNameOnCard() {
		return nameOnCard;
	}
	/**
	 * @param nameOnCard the nameOnCard to set
	 */
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	private String nameOnCard;

}
