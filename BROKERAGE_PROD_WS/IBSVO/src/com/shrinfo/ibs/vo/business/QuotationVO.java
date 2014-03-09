package com.shrinfo.ibs.vo.business;

import java.util.Date;
import java.util.List;

public class QuotationVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5592076230860134980L;

	private Long id;

	private EnquiryVO enquiry;

	private QuoteSlipVO quoteSlip;

	private CustomerVO customer;

	private InsuredVO insured;

	private InsCompanyVO quotedInsCompany;

	private ProductVO product;

	private Date recordValidFrom;

	private Date recordValidTo;

	private Date policyStartDate;

	private Date policyExpiryDate;

	private Boolean isRecommended;

	private String recommendationSummary;
	
	private String coverDescription;

	private UserVO quoteApprovedBy;

	private Boolean isQuoteApproved;// is quoteRecommened

	private Boolean isClosingSlipEmailed;
	
	private Integer statusCode;

	private List<QuotationDetailVO> quotationDetails;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the enquiry
	 */
	public EnquiryVO getEnquiry() {
		return enquiry;
	}

	/**
	 * @param enquiry
	 *            the enquiry to set
	 */
	public void setEnquiry(EnquiryVO enquiry) {
		this.enquiry = enquiry;
	}

	/**
	 * @return the quoteSlip
	 */
	public QuoteSlipVO getQuoteSlip() {
		return quoteSlip;
	}

	/**
	 * @param quoteSlip
	 *            the quoteSlip to set
	 */
	public void setQuoteSlip(QuoteSlipVO quoteSlip) {
		this.quoteSlip = quoteSlip;
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
	 * @return the insured
	 */
	public InsuredVO getInsured() {
		return insured;
	}

	/**
	 * @param insured
	 *            the insured to set
	 */
	public void setInsured(InsuredVO insured) {
		this.insured = insured;
	}

	/**
	 * @return the recordValidFrom
	 */
	public Date getRecordValidFrom() {
		return recordValidFrom;
	}

	/**
	 * @param recordValidFrom
	 *            the recordValidFrom to set
	 */
	public void setRecordValidFrom(Date recordValidFrom) {
		this.recordValidFrom = recordValidFrom;
	}

	/**
	 * @return the recordValidTo
	 */
	public Date getRecordValidTo() {
		return recordValidTo;
	}

	/**
	 * @param recordValidTo
	 *            the recordValidTo to set
	 */
	public void setRecordValidTo(Date recordValidTo) {
		this.recordValidTo = recordValidTo;
	}

	/**
	 * @return the policyStartDate
	 */
	public Date getPolicyStartDate() {
		return policyStartDate;
	}

	/**
	 * @param policyStartDate
	 *            the policyStartDate to set
	 */
	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	/**
	 * @return the policyExpiryDate
	 */
	public Date getPolicyExpiryDate() {
		return policyExpiryDate;
	}

	/**
	 * @param policyExpiryDate
	 *            the policyExpiryDate to set
	 */
	public void setPolicyExpiryDate(Date policyExpiryDate) {
		this.policyExpiryDate = policyExpiryDate;
	}

	/**
	 * @return the isRecommended
	 */
	public Boolean getIsRecommended() {
		return isRecommended;
	}

	/**
	 * @param isRecommended
	 *            the isRecommended to set
	 */
	public void setIsRecommended(Boolean isRecommended) {
		this.isRecommended = isRecommended;
	}

	/**
	 * @return the recommendationSummary
	 */
	public String getRecommendationSummary() {
		return recommendationSummary;
	}

	/**
	 * @param recommendationSummary
	 *            the recommendationSummary to set
	 */
	public void setRecommendationSummary(String recommendationSummary) {
		this.recommendationSummary = recommendationSummary;
	}

	/**
	 * @return the statusCode
	 */
	public Integer getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode
	 *            the statusCode to set
	 */
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the quotationDetails
	 */
	public List<QuotationDetailVO> getQuotationDetails() {
		return quotationDetails;
	}

	/**
	 * @param quotationDetails
	 *            the quotationDetails to set
	 */
	public void setQuotationDetails(List<QuotationDetailVO> quotationDetails) {
		this.quotationDetails = quotationDetails;
	}

	/**
	 * @return the quotedInsCompany
	 */
	public InsCompanyVO getQuotedInsCompany() {
		return quotedInsCompany;
	}

	/**
	 * @param quotedInsCompany
	 *            the quotedInsCompany to set
	 */
	public void setQuotedInsCompany(InsCompanyVO quotedInsCompany) {
		this.quotedInsCompany = quotedInsCompany;
	}

	/**
	 * @return the product
	 */
	public ProductVO getProduct() {
		return product;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProduct(ProductVO product) {
		this.product = product;
	}

	public String getCoverDescription() {
		return coverDescription;
	}

	public void setCoverDescription(String coverDescription) {
		this.coverDescription = coverDescription;
	}

	public UserVO getQuoteApprovedBy() {
		return quoteApprovedBy;
	}

	public void setQuoteApprovedBy(UserVO quoteApprovedBy) {
		this.quoteApprovedBy = quoteApprovedBy;
	}

	public Boolean getIsQuoteApproved() {
		return isQuoteApproved;
	}

	public void setIsQuoteApproved(Boolean isQuoteApproved) {
		this.isQuoteApproved = isQuoteApproved;
	}

	public Boolean getIsClosingSlipEmailed() {
		return isClosingSlipEmailed;
	}

	public void setIsClosingSlipEmailed(Boolean isClosingSlipEmailed) {
		this.isClosingSlipEmailed = isClosingSlipEmailed;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
