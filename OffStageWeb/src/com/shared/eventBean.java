package com.shared;

public class eventBean {
	public String toString() {
		return "eventBean [eventId=" + eventId + ", eventName=" + eventName + ", description=" + description +
				", date=" + date + ", startTime=" + startTime + ", endTime=" + endTime +",eventType="+eventType
				+",prizeMoney=" + prizeMoney +",participationFee="+participationFee+",venue=" + venue + ",userId="
				+  userId + "]";
	}
	private String eventId;
	private String eventName;
	private String description;
	private String date;
	private String startTime;
	private String endTime;
	private String eventType;
	private String prizeMoney;
	private String participationFee;
	private String venue;
	private String userId;
	/**
	 * @return the eventId
	 */
	public String getEventId() {
		return eventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the startTime
	 */
	public String getStartTime() {
		return startTime;
	}
	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	/**
	 * @return the endTime
	 */
	public String getEndTime() {
		return endTime;
	}
	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	/**
	 * @return the eventType
	 */
	public String getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the prizeMoney
	 */
	public String getPrizeMoney() {
		return prizeMoney;
	}
	/**
	 * @param prizeMoney the prizeMoney to set
	 */
	public void setPrizeMoney(String prizeMoney) {
		this.prizeMoney = prizeMoney;
	}
	/**
	 * @return the participationFee
	 */
	public String getParticipationFee() {
		return participationFee;
	}
	/**
	 * @param participationFee the participationFee to set
	 */
	public void setParticipationFee(String participationFee) {
		this.participationFee = participationFee;
	}
	/**
	 * @return the venue
	 */
	public String getVenue() {
		return venue;
	}
	/**
	 * @param venue the venue to set
	 */
	public void setVenue(String venue) {
		this.venue = venue;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
}
