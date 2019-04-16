package com.shared;

public class participantBean {
	public String toString() {
		return "participantBean [id=" + id + ", participationCategory=" + partcipationCategory + ", paymentMode=" + 
				paymentMode + ", teamName=" + teamName + ", eventId" + eventId + ",participantId="+  participantId +
				"participationFeeId"+ participatioFeeId + "]";
	}
	private String id;
	private String partcipationCategory;
	private String paymentMode;
	private String teamName;
	private String eventId;
	private String participantId;
	private String participatioFeeId;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the partcipationCategory
	 */
	public String getPartcipationCategory() {
		return partcipationCategory;
	}
	/**
	 * @param partcipationCategory the partcipationCategory to set
	 */
	public void setPartcipationCategory(String partcipationCategory) {
		this.partcipationCategory = partcipationCategory;
	}
	/**
	 * @return the paymentMode
	 */
	public String getPaymentMode() {
		return paymentMode;
	}
	/**
	 * @param paymentMode the paymentMode to set
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	/**
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}
	/**
	 * @param teamName the teamName to set
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
	 * @return the participatioFeeId
	 */
	public String getParticipatioFeeId() {
		return participatioFeeId;
	}
	/**
	 * @param participatioFeeId the participatioFeeId to set
	 */
	public void setParticipatioFeeId(String participatioFeeId) {
		this.participatioFeeId = participatioFeeId;
	}
	
}
