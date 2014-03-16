package com.shrinfo.ibs.gen.pojo;

// Generated Mar 17, 2014 1:52:55 AM by Hibernate Tools 3.4.0.CR1


import java.math.BigDecimal;
import java.sql.Date;

/**
 * IbsUwTransactionId generated by hbm2java
 */
public class IbsUwTransactionId implements java.io.Serializable {


    private BigDecimal quoteSlipId;

    private BigDecimal enquiryNo;

    private Short quoteSlipVersion;

    private Date quoteSlipDate;

    private String enquiryCompanyCode;

    private Long productClass;

    private Short productUwFieldId;

    private String productUwFieldAnswer;

    private Date contractPeriodFrom;

    private Date contractPeriodTo;

    private String type;

    private String policyNo;

    private Byte statusCode;

    private Long recCreUserId;

    private Date recCreDate;

    private Long recUpdUserId;

    private Date recUpdDate;

    public IbsUwTransactionId() {}

    public IbsUwTransactionId(BigDecimal quoteSlipId, BigDecimal enquiryNo, Short quoteSlipVersion,
            Date quoteSlipDate, String enquiryCompanyCode, Long productClass,
            Short productUwFieldId, String productUwFieldAnswer, Date contractPeriodFrom,
            Date contractPeriodTo, String type, String policyNo, Byte statusCode,
            Long recCreUserId, Date recCreDate, Long recUpdUserId, Date recUpdDate) {
        this.quoteSlipId = quoteSlipId;
        this.enquiryNo = enquiryNo;
        this.quoteSlipVersion = quoteSlipVersion;
        this.quoteSlipDate = quoteSlipDate;
        this.enquiryCompanyCode = enquiryCompanyCode;
        this.productClass = productClass;
        this.productUwFieldId = productUwFieldId;
        this.productUwFieldAnswer = productUwFieldAnswer;
        this.contractPeriodFrom = contractPeriodFrom;
        this.contractPeriodTo = contractPeriodTo;
        this.type = type;
        this.policyNo = policyNo;
        this.statusCode = statusCode;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
    }

    public BigDecimal getQuoteSlipId() {
        return this.quoteSlipId;
    }

    public void setQuoteSlipId(BigDecimal quoteSlipId) {
        this.quoteSlipId = quoteSlipId;
    }

    public BigDecimal getEnquiryNo() {
        return this.enquiryNo;
    }

    public void setEnquiryNo(BigDecimal enquiryNo) {
        this.enquiryNo = enquiryNo;
    }

    public Short getQuoteSlipVersion() {
        return this.quoteSlipVersion;
    }

    public void setQuoteSlipVersion(Short quoteSlipVersion) {
        this.quoteSlipVersion = quoteSlipVersion;
    }

    public Date getQuoteSlipDate() {
        return this.quoteSlipDate;
    }

    public void setQuoteSlipDate(Date quoteSlipDate) {
        this.quoteSlipDate = quoteSlipDate;
    }

    public String getEnquiryCompanyCode() {
        return this.enquiryCompanyCode;
    }

    public void setEnquiryCompanyCode(String enquiryCompanyCode) {
        this.enquiryCompanyCode = enquiryCompanyCode;
    }

    public Long getProductClass() {
        return this.productClass;
    }

    public void setProductClass(Long productClass) {
        this.productClass = productClass;
    }

    public Short getProductUwFieldId() {
        return this.productUwFieldId;
    }

    public void setProductUwFieldId(Short productUwFieldId) {
        this.productUwFieldId = productUwFieldId;
    }

    public String getProductUwFieldAnswer() {
        return this.productUwFieldAnswer;
    }

    public void setProductUwFieldAnswer(String productUwFieldAnswer) {
        this.productUwFieldAnswer = productUwFieldAnswer;
    }

    public Date getContractPeriodFrom() {
        return this.contractPeriodFrom;
    }

    public void setContractPeriodFrom(Date contractPeriodFrom) {
        this.contractPeriodFrom = contractPeriodFrom;
    }

    public Date getContractPeriodTo() {
        return this.contractPeriodTo;
    }

    public void setContractPeriodTo(Date contractPeriodTo) {
        this.contractPeriodTo = contractPeriodTo;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPolicyNo() {
        return this.policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public Byte getStatusCode() {
        return this.statusCode;
    }

    public void setStatusCode(Byte statusCode) {
        this.statusCode = statusCode;
    }

    public Long getRecCreUserId() {
        return this.recCreUserId;
    }

    public void setRecCreUserId(Long recCreUserId) {
        this.recCreUserId = recCreUserId;
    }

    public Date getRecCreDate() {
        return this.recCreDate;
    }

    public void setRecCreDate(Date recCreDate) {
        this.recCreDate = recCreDate;
    }

    public Long getRecUpdUserId() {
        return this.recUpdUserId;
    }

    public void setRecUpdUserId(Long recUpdUserId) {
        this.recUpdUserId = recUpdUserId;
    }

    public Date getRecUpdDate() {
        return this.recUpdDate;
    }

    public void setRecUpdDate(Date recUpdDate) {
        this.recUpdDate = recUpdDate;
    }


    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof IbsUwTransactionId))
            return false;
        IbsUwTransactionId castOther = (IbsUwTransactionId) other;

        return ((this.getQuoteSlipId() == castOther.getQuoteSlipId()) || (this.getQuoteSlipId() != null
            && castOther.getQuoteSlipId() != null && this.getQuoteSlipId().equals(
            castOther.getQuoteSlipId())))
            && ((this.getEnquiryNo() == castOther.getEnquiryNo()) || (this.getEnquiryNo() != null
                && castOther.getEnquiryNo() != null && this.getEnquiryNo().equals(
                castOther.getEnquiryNo())))
            && ((this.getQuoteSlipVersion() == castOther.getQuoteSlipVersion()) || (this
                    .getQuoteSlipVersion() != null && castOther.getQuoteSlipVersion() != null && this
                    .getQuoteSlipVersion().equals(castOther.getQuoteSlipVersion())))
            && ((this.getQuoteSlipDate() == castOther.getQuoteSlipDate()) || (this
                    .getQuoteSlipDate() != null && castOther.getQuoteSlipDate() != null && this
                    .getQuoteSlipDate().equals(castOther.getQuoteSlipDate())))
            && ((this.getEnquiryCompanyCode() == castOther.getEnquiryCompanyCode()) || (this
                    .getEnquiryCompanyCode() != null && castOther.getEnquiryCompanyCode() != null && this
                    .getEnquiryCompanyCode().equals(castOther.getEnquiryCompanyCode())))
            && ((this.getProductClass() == castOther.getProductClass()) || (this.getProductClass() != null
                && castOther.getProductClass() != null && this.getProductClass().equals(
                castOther.getProductClass())))
            && ((this.getProductUwFieldId() == castOther.getProductUwFieldId()) || (this
                    .getProductUwFieldId() != null && castOther.getProductUwFieldId() != null && this
                    .getProductUwFieldId().equals(castOther.getProductUwFieldId())))
            && ((this.getProductUwFieldAnswer() == castOther.getProductUwFieldAnswer()) || (this
                    .getProductUwFieldAnswer() != null
                && castOther.getProductUwFieldAnswer() != null && this.getProductUwFieldAnswer()
                    .equals(castOther.getProductUwFieldAnswer())))
            && ((this.getContractPeriodFrom() == castOther.getContractPeriodFrom()) || (this
                    .getContractPeriodFrom() != null && castOther.getContractPeriodFrom() != null && this
                    .getContractPeriodFrom().equals(castOther.getContractPeriodFrom())))
            && ((this.getContractPeriodTo() == castOther.getContractPeriodTo()) || (this
                    .getContractPeriodTo() != null && castOther.getContractPeriodTo() != null && this
                    .getContractPeriodTo().equals(castOther.getContractPeriodTo())))
            && ((this.getType() == castOther.getType()) || (this.getType() != null
                && castOther.getType() != null && this.getType().equals(castOther.getType())))
            && ((this.getPolicyNo() == castOther.getPolicyNo()) || (this.getPolicyNo() != null
                && castOther.getPolicyNo() != null && this.getPolicyNo().equals(
                castOther.getPolicyNo())))
            && ((this.getStatusCode() == castOther.getStatusCode()) || (this.getStatusCode() != null
                && castOther.getStatusCode() != null && this.getStatusCode().equals(
                castOther.getStatusCode())))
            && ((this.getRecCreUserId() == castOther.getRecCreUserId()) || (this.getRecCreUserId() != null
                && castOther.getRecCreUserId() != null && this.getRecCreUserId().equals(
                castOther.getRecCreUserId())))
            && ((this.getRecCreDate() == castOther.getRecCreDate()) || (this.getRecCreDate() != null
                && castOther.getRecCreDate() != null && this.getRecCreDate().equals(
                castOther.getRecCreDate())))
            && ((this.getRecUpdUserId() == castOther.getRecUpdUserId()) || (this.getRecUpdUserId() != null
                && castOther.getRecUpdUserId() != null && this.getRecUpdUserId().equals(
                castOther.getRecUpdUserId())))
            && ((this.getRecUpdDate() == castOther.getRecUpdDate()) || (this.getRecUpdDate() != null
                && castOther.getRecUpdDate() != null && this.getRecUpdDate().equals(
                castOther.getRecUpdDate())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getQuoteSlipId() == null ? 0 : this.getQuoteSlipId().hashCode());
        result = 37 * result + (getEnquiryNo() == null ? 0 : this.getEnquiryNo().hashCode());
        result =
            37 * result
                + (getQuoteSlipVersion() == null ? 0 : this.getQuoteSlipVersion().hashCode());
        result =
            37 * result + (getQuoteSlipDate() == null ? 0 : this.getQuoteSlipDate().hashCode());
        result =
            37 * result
                + (getEnquiryCompanyCode() == null ? 0 : this.getEnquiryCompanyCode().hashCode());
        result = 37 * result + (getProductClass() == null ? 0 : this.getProductClass().hashCode());
        result =
            37 * result
                + (getProductUwFieldId() == null ? 0 : this.getProductUwFieldId().hashCode());
        result =
            37
                * result
                + (getProductUwFieldAnswer() == null ? 0 : this.getProductUwFieldAnswer()
                        .hashCode());
        result =
            37 * result
                + (getContractPeriodFrom() == null ? 0 : this.getContractPeriodFrom().hashCode());
        result =
            37 * result
                + (getContractPeriodTo() == null ? 0 : this.getContractPeriodTo().hashCode());
        result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
        result = 37 * result + (getPolicyNo() == null ? 0 : this.getPolicyNo().hashCode());
        result = 37 * result + (getStatusCode() == null ? 0 : this.getStatusCode().hashCode());
        result = 37 * result + (getRecCreUserId() == null ? 0 : this.getRecCreUserId().hashCode());
        result = 37 * result + (getRecCreDate() == null ? 0 : this.getRecCreDate().hashCode());
        result = 37 * result + (getRecUpdUserId() == null ? 0 : this.getRecUpdUserId().hashCode());
        result = 37 * result + (getRecUpdDate() == null ? 0 : this.getRecUpdDate().hashCode());
        return result;
    }


}
