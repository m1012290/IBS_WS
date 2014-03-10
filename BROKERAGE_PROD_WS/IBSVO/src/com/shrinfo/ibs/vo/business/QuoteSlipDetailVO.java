package com.shrinfo.ibs.vo.business;

import java.util.Date;

public class QuoteSlipDetailVO extends BaseVO {

    /**
	 * 
	 */
    private static final long serialVersionUID = 2988845699753210671L;

    private EnquiryVO enquiry;

    private Integer version;

    private ProductFieldVO underWrittenField;

    private String status;

    private Date recordValidFrom;

    private Date recordValidTo;

    /**
     * @return the underWrittenField
     */
    public ProductFieldVO getUnderWrittenField() {
        return underWrittenField;
    }

    /**
     * @param underWrittenField the underWrittenField to set
     */
    public void setUnderWrittenField(ProductFieldVO underWrittenField) {
        this.underWrittenField = underWrittenField;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
