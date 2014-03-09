package com.shrinfo.ibs.vo.business;

public class ContactVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1199380266871786516L;

	private String name;

	private String status;

	private String phone;

	private String phoneAlternate1;

	private String phoneAlternate2;

	private String landline;

	private String email;

	private String emailAlternate1;

	private String emailAlternate2;

	private String fax;

	private AddressVO Address;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the status
	 */
	protected String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	protected void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax
	 *            the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return the address
	 */
	public AddressVO getAddress() {
		return Address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(AddressVO address) {
		Address = address;
	}

	/**
	 * @return the phoneAlternate1
	 */
	public String getPhoneAlternate1() {
		return phoneAlternate1;
	}

	/**
	 * @param phoneAlternate1
	 *            the phoneAlternate1 to set
	 */
	public void setPhoneAlternate1(String phoneAlternate1) {
		this.phoneAlternate1 = phoneAlternate1;
	}

	/**
	 * @return the phoneAlternate2
	 */
	public String getPhoneAlternate2() {
		return phoneAlternate2;
	}

	/**
	 * @param phoneAlternate2
	 *            the phoneAlternate2 to set
	 */
	public void setPhoneAlternate2(String phoneAlternate2) {
		this.phoneAlternate2 = phoneAlternate2;
	}

	/**
	 * @return the landline
	 */
	public String getLandline() {
		return landline;
	}

	/**
	 * @param landline
	 *            the landline to set
	 */
	public void setLandline(String landline) {
		this.landline = landline;
	}

	/**
	 * @return the emailAlternate1
	 */
	public String getEmailAlternate1() {
		return emailAlternate1;
	}

	/**
	 * @param emailAlternate1
	 *            the emailAlternate1 to set
	 */
	public void setEmailAlternate1(String emailAlternate1) {
		this.emailAlternate1 = emailAlternate1;
	}

	/**
	 * @return the emailAlternate2
	 */
	public String getEmailAlternate2() {
		return emailAlternate2;
	}

	/**
	 * @param emailAlternate2
	 *            the emailAlternate2 to set
	 */
	public void setEmailAlternate2(String emailAlternate2) {
		this.emailAlternate2 = emailAlternate2;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
