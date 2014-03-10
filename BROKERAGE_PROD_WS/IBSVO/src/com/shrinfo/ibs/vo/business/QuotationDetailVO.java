package com.shrinfo.ibs.vo.business;

import java.util.Date;

public class QuotationDetailVO extends BaseVO {

    /**
	 * 
	 */
    private static final long serialVersionUID = 7651075027414064301L;

    private Long id;

    private QuoteSlipVO quoteSlip;

    private EnquiryVO enquiry;

    private Date recordValidFrom;

    private Date recordValidTo;

    private ProductFieldVO underWrittenField;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public QuoteSlipVO getQuoteSlip() {
        return quoteSlip;
    }

    public void setQuoteSlip(QuoteSlipVO quoteSlip) {
        this.quoteSlip = quoteSlip;
    }

    public EnquiryVO getEnquiry() {
        return enquiry;
    }

    public void setEnquiry(EnquiryVO enquiry) {
        this.enquiry = enquiry;
    }

    public Date getRecordValidFrom() {
        return recordValidFrom;
    }

    public void setRecordValidFrom(Date recordValidFrom) {
        this.recordValidFrom = recordValidFrom;
    }

    public Date getRecordValidTo() {
        return recordValidTo;
    }

    public void setRecordValidTo(Date recordValidTo) {
        this.recordValidTo = recordValidTo;
    }

    public ProductFieldVO getUnderWrittenField() {
        return underWrittenField;
    }

    public void setUnderWrittenField(ProductFieldVO underWrittenField) {
        this.underWrittenField = underWrittenField;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
