package com.shared;

public class studentBean {
	public String toString() {
		return "studentBean [id=" + id + ", email=" + email + ", programme=" + programme + ", name="
				+ name + ", contact=" + contact + ", altContact" + altContact + ",gender="+gender+",batchYear="+ batchYear + "]";
	}
	private String id;
	private String email;
	private String programme;
	private String name;
	private String contact;
	private String altContact;
	private String gender;
	private String batchYear;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProgramme() {
		return programme;
	}
	public void setProgramme(String programme) {
		this.programme = programme;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAltContact() {
		return altContact;
	}
	public void setAltContact(String altContact) {
		this.altContact = altContact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBatchYear() {
		return batchYear;
	}
	public void setBatchYear(String batchYear) {
		this.batchYear = batchYear;
	}
}
