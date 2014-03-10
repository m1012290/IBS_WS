package com.shrinfo.ibs.vo.business;

import java.util.Date;
import java.util.List;

public class QuoteSlipVO extends BaseVO {

    /**
	 * 
	 */
    private static final long serialVersionUID = -8565841406476244574L;

    private Long id;

    private EnquiryVO enquiry;

    private Integer version;

    private Date date;

    private ProductVO product;

    // ????????
    private String subClass;

    private CustomerVO customer;

    private InsuredVO insured;

    private Date recordValidFrom;

    private Date recordValidTo;

    private Date policyStartDate;

    private Date policyExpiryDate;

    private Boolean isQuoteSlipEmailed;

    // deleted, Active, Pending, approved
    private Integer statusCode;

    private List<QuoteSlipDetailVO> slipDetails;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
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
     * @param enquiry the enquiry to set
     */
    public void setEnquiry(EnquiryVO enquiry) {
        this.enquiry = enquiry;
    }

    /**
     * @return the version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the product
     */
    public ProductVO getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ProductVO product) {
        this.product = product;
    }

    /**
     * @return the customer
     */
    public CustomerVO getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
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
     * @param insured the insured to set
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
     * @param recordValidFrom the recordValidFrom to set
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
     * @param recordValidTo the recordValidTo to set
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
     * @param policyStartDate the policyStartDate to set
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
     * @param policyExpiryDate the policyExpiryDate to set
     */
    public void setPolicyExpiryDate(Date policyExpiryDate) {
        this.policyExpiryDate = policyExpiryDate;
    }

    /**
     * @return the isQuoteSlipEmailed
     */
    public Boolean getIsQuoteSlipEmailed() {
        return isQuoteSlipEmailed;
    }

    /**
     * @param isQuoteSlipEmailed the isQuoteSlipEmailed to set
     */
    public void setIsQuoteSlipEmailed(Boolean isQuoteSlipEmailed) {
        this.isQuoteSlipEmailed = isQuoteSlipEmailed;
    }

    /**
     * @return the statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode the statusCode to set
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * @return the subClass
     */
    public String getSubClass() {
        return subClass;
    }

    /**
     * @param subClass the subClass to set
     */
    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }

    /**
     * @return the slipDetails
     */
    public List<QuoteSlipDetailVO> getSlipDetails() {
        return slipDetails;
    }

    /**
     * @param slipDetails the slipDetails to set
     */
    public void setSlipDetails(List<QuoteSlipDetailVO> slipDetails) {
        this.slipDetails = slipDetails;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
