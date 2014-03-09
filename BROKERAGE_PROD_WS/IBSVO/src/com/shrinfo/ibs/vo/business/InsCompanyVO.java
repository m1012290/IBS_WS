package com.shrinfo.ibs.vo.business;

import java.util.Map;

public class InsCompanyVO extends CompanyVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2860672426234918139L;

	private ContactVO contact;

	private Map<ProductVO, ContactVO> contacts;

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
	 * @return the contacts
	 */
	public Map<ProductVO, ContactVO> getContacts() {
		return contacts;
	}

	/**
	 * @param contacts
	 *            the contacts to set
	 */
	public void setContacts(Map<ProductVO, ContactVO> contacts) {
		this.contacts = contacts;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
