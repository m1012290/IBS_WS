package com.shrinfo.ibs.vo.business;

public class InsuredVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2934748953623182662L;

	private String salutation;

	private String name;
	// source of business
	private String source;

	private ContactVO contact;

	private CustomerVO customer;

	/**
	 * @return the salutation
	 */
	public String getSalutation() {
		return salutation;
	}

	/**
	 * @param salutation
	 *            the salutation to set
	 */
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

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
	 * @return the source
	 */
	public String getSource() {
		return source;
	}

	/**
	 * @param source
	 *            the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * @return the contact
	 */
	public ContactVO getContact() {
		return contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(ContactVO contact) {
		this.contact = contact;
	}

	/**
	 * @return the customer
	 */
	public CustomerVO getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(CustomerVO customer) {
		this.customer = customer;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
