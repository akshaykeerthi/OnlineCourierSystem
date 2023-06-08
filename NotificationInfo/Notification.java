package NotificationInfo;

import java.util.Date;

import Canlender.Time;
import NotificationDetail.NotificationType;

public class Notification {
	private String notificationID;
	/**
	 * @return the notificationID
	 */
	public String getNotificationID() {
		return notificationID;
	}
	/**
	 * @param notificationID the notificationID to set
	 */
	public void setNotificationID(String notificationID) {
		this.notificationID = notificationID;
	}
	/**
	 * @return the notificationCategory
	 */
	public NotificationType getNotificationCategory() {
		return notificationCategory;
	}
	/**
	 * @param notificationCategory the notificationCategory to set
	 */
	public void setNotificationCategory(NotificationType notificationCategory) {
		this.notificationCategory = notificationCategory;
	}
	/**
	 * @return the notificationDate
	 */
	public Date getNotificationDate() {
		return notificationDate;
	}
	/**
	 * @param notificationDate the notificationDate to set
	 */
	public void setNotificationDate(Date notificationDate) {
		this.notificationDate = notificationDate;
	}
	/**
	 * @return the notificationTime
	 */
	public Time getNotificationTime() {
		return notificationTime;
	}
	/**
	 * @param notificationTime the notificationTime to set
	 */
	public void setNotificationTime(Time notificationTime) {
		this.notificationTime = notificationTime;
	}
	/**
	 * @return the notificationContent
	 */
	public String getNotificationContent() {
		return notificationContent;
	}
	/**
	 * @param notificationContent the notificationContent to set
	 */
	public void setNotificationContent(String notificationContent) {
		this.notificationContent = notificationContent;
	}
	private NotificationType notificationCategory;
	private Date notificationDate;
	private Time notificationTime;
	private String notificationContent;

}
