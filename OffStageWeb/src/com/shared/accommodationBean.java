package com.shared;

public class accommodationBean {
	public String toString() {
		return "accommodationBean [attendeeId=" + attendeeId + ", transactionNo=" + transactionNo + ", noOfDays=" 
				+ noOfDays + ", modeId=" + modeId + ",userId=" +  userId + "]";
	}
	private String attendeeId;
	private String transactionNo;
	private String noOfDays;
	private String modeId;
	private String userId;
	/**
	 * @return the attendeeId
	 */
	public String getAttendeeId() {
		return attendeeId;
	}
	/**
	 * @param attendeeId the attendeeId to set
	 */
	public void setAttendeeId(String attendeeId) {
		this.attendeeId = attendeeId;
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
	 * @return the noOfDays
	 */
	public String getNoOfDays() {
		return noOfDays;
	}
	/**
	 * @param noOfDays the noOfDays to set
	 */
	public void setNoOfDays(String noOfDays) {
		this.noOfDays = noOfDays;
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
}
