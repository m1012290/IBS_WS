package com.shrinfo.ibs.vo.business;

public class BranchVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7657694427397868180L;

	private String code;

	private String name;

	private String abbrevation;

	private CompanyVO company;

	private AddressVO address;

	private ContactVO incharge;

	private String status;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
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
	 * @return the abbrevation
	 */
	public String getAbbrevation() {
		return abbrevation;
	}

	/**
	 * @param abbrevation
	 *            the abbrevation to set
	 */
	public void setAbbrevation(String abbrevation) {
		this.abbrevation = abbrevation;
	}

	/**
	 * @return the company
	 */
	public CompanyVO getCompany() {
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(CompanyVO company) {
		this.company = company;
	}

	/**
	 * @return the address
	 */
	public AddressVO getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(AddressVO address) {
		this.address = address;
	}

	/**
	 * @return the incharge
	 */
	public ContactVO getIncharge() {
		return incharge;
	}

	/**
	 * @param incharge
	 *            the incharge to set
	 */
	public void setIncharge(ContactVO incharge) {
		this.incharge = incharge;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
