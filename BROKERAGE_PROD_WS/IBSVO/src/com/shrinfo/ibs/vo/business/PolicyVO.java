package com.shrinfo.ibs.vo.business;

public class PolicyVO extends QuotationVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8127574257289256602L;

	private Double quotedPremium;

	private Double discountPercentage;

	private Double loadingPercentage;

	private Double totalPremium;

	private Double commisionOnPremium;

	private Long policyNum;

	private Double sumInsured;

	private String policyTerm;

	/**
	 * @return the quotedPremium
	 */
	public Double getQuotedPremium() {
		return quotedPremium;
	}

	/**
	 * @param quotedPremium
	 *            the quotedPremium to set
	 */
	public void setQuotedPremium(Double quotedPremium) {
		this.quotedPremium = quotedPremium;
	}

	/**
	 * @return the discountPercentage
	 */
	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	/**
	 * @param discountPercentage
	 *            the discountPercentage to set
	 */
	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	/**
	 * @return the loadingPercentage
	 */
	public Double getLoadingPercentage() {
		return loadingPercentage;
	}

	/**
	 * @param loadingPercentage
	 *            the loadingPercentage to set
	 */
	public void setLoadingPercentage(Double loadingPercentage) {
		this.loadingPercentage = loadingPercentage;
	}

	/**
	 * @return the totalPremium
	 */
	public Double getTotalPremium() {
		return totalPremium;
	}

	/**
	 * @param totalPremium
	 *            the totalPremium to set
	 */
	public void setTotalPremium(Double totalPremium) {
		this.totalPremium = totalPremium;
	}

	/**
	 * @return the commisionOnPremium
	 */
	public Double getCommisionOnPremium() {
		return commisionOnPremium;
	}

	/**
	 * @param commisionOnPremium
	 *            the commisionOnPremium to set
	 */
	public void setCommisionOnPremium(Double commisionOnPremium) {
		this.commisionOnPremium = commisionOnPremium;
	}

	/**
	 * @return the policyNum
	 */
	public Long getPolicyNum() {
		return policyNum;
	}

	/**
	 * @param policyNum
	 *            the policyNum to set
	 */
	public void setPolicyNum(Long policyNum) {
		this.policyNum = policyNum;
	}

	/**
	 * @return the sumInsured
	 */
	public Double getSumInsured() {
		return sumInsured;
	}

	/**
	 * @param sumInsured
	 *            the sumInsured to set
	 */
	public void setSumInsured(Double sumInsured) {
		this.sumInsured = sumInsured;
	}

	/**
	 * @return the policyTerm
	 */
	public String getPolicyTerm() {
		return policyTerm;
	}

	/**
	 * @param policyTerm
	 *            the policyTerm to set
	 */
	public void setPolicyTerm(String policyTerm) {
		this.policyTerm = policyTerm;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
