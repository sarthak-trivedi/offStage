package com.shared;

public class memberBean {
	public String toString() {
		return "participantBean [id=" + id + ", name=" + name + ", email=" + 
				email + ", contact=" + contact + ", gender" + gender + ",participationId="+  participationId +"]";
	}
	private String id;
	private String name;
	private String email;
	private String contact;
	private String gender;
	private String participationId;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the contact
	 */
	public String getContact() {
		return contact;
	}
	/**
	 * @param contact the contact to set
	 */
	public void setContact(String contact) {
		this.contact = contact;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the participationId
	 */
	public String getParticipationId() {
		return participationId;
	}
	/**
	 * @param participationId the participationId to set
	 */
	public void setParticipationId(String participationId) {
		this.participationId = participationId;
	}
}
