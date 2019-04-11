package com.shared;

public class participantBean {
	public String toString() {
		return "participantBean [participantId=" + participantId + ", year=" + year + ", status=" + status + 
				", transactionNo=" + transactionNo + ", modeId="+modeId+", userId="+  userId + ", eventId=" +eventId+"]";
	}
	private String participantId;
	private String year;
	private String status;
	private String transactionNo;
	private String modeId;
	private String userId;
	private String eventId;
	/**
	 * @return the participantId
	 */
	public String getParticipantId() {
		return participantId;
	}
	/**
	 * @param participantId the participantId to set
	 */
	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}
	/**
	 * @return the year
	 */
	public String getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(String year) {
		this.year = year;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the transactionNo
	 */
	public String getTransactionNo() {
		return transactionNo;
	}
	/**
	 * @param transactionNo the transactionNo to set
	 */
	public void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}
	/**
	 * @return the modeId
	 */
	public String getModeId() {
		return modeId;
	}
	/**
	 * @param modeId the modeId to set
	 */
	public void setModeId(String modeId) {
		this.modeId = modeId;
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
}
