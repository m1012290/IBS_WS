package com.shrinfo.ibs.gen.pojo;

// Generated Mar 13, 2014 1:39:55 PM by Hibernate Tools 3.4.0.CR1


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * IbsQuoteSlipHeader generated by hbm2java
 */
public class IbsQuoteSlipHeader implements java.io.Serializable {


    private IbsQuoteSlipHeaderId id;

    private IbsStatusMaster ibsStatusMaster;

    private IbsProductMaster ibsProductMaster;

    private BigDecimal enquiryNo;

    private Serializable quoteSlipDate;

    private String subClass;

    private BigDecimal customerId;

    private BigDecimal insuredId;

    private String insuredName;

    private Serializable contractPeriodFrom;

    private Serializable contractPeriodTo;

    private Serializable policyStartDate;

    private Serializable policyExpiryDate;

    private String quoteSlipEmailed;

    private String remarks;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    private Set ibsQuoteSlipDetails = new HashSet(0);

    private Set ibsQuoteComparisionDetails = new HashSet(0);

    private Set ibsQuoteComparisionHeaders = new HashSet(0);

    private Set ibsUwTransactions = new HashSet(0);

    public IbsQuoteSlipHeader() {}


    public IbsQuoteSlipHeader(IbsQuoteSlipHeaderId id) {
        this.id = id;
    }

    public IbsQuoteSlipHeader(IbsQuoteSlipHeaderId id, IbsStatusMaster ibsStatusMaster,
            IbsProductMaster ibsProductMaster, BigDecimal enquiryNo, Serializable quoteSlipDate,
            String subClass, BigDecimal customerId, BigDecimal insuredId, String insuredName,
            Serializable contractPeriodFrom, Serializable contractPeriodTo,
            Serializable policyStartDate, Serializable policyExpiryDate, String quoteSlipEmailed,
            String remarks, BigDecimal recCreUserId, Serializable recCreDate,
            BigDecimal recUpdUserId, Serializable recUpdDate, Set ibsQuoteSlipDetails,
            Set ibsQuoteComparisionDetails, Set ibsQuoteComparisionHeaders, Set ibsUwTransactions) {
        this.id = id;
        this.ibsStatusMaster = ibsStatusMaster;
        this.ibsProductMaster = ibsProductMaster;
        this.enquiryNo = enquiryNo;
        this.quoteSlipDate = quoteSlipDate;
        this.subClass = subClass;
        this.customerId = customerId;
        this.insuredId = insuredId;
        this.insuredName = insuredName;
        this.contractPeriodFrom = contractPeriodFrom;
        this.contractPeriodTo = contractPeriodTo;
        this.policyStartDate = policyStartDate;
        this.policyExpiryDate = policyExpiryDate;
        this.quoteSlipEmailed = quoteSlipEmailed;
        this.remarks = remarks;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
        this.ibsQuoteSlipDetails = ibsQuoteSlipDetails;
        this.ibsQuoteComparisionDetails = ibsQuoteComparisionDetails;
        this.ibsQuoteComparisionHeaders = ibsQuoteComparisionHeaders;
        this.ibsUwTransactions = ibsUwTransactions;
    }

    public IbsQuoteSlipHeaderId getId() {
        return this.id;
    }

    public void setId(IbsQuoteSlipHeaderId id) {
        this.id = id;
    }

    public IbsStatusMaster getIbsStatusMaster() {
        return this.ibsStatusMaster;
    }

    public void setIbsStatusMaster(IbsStatusMaster ibsStatusMaster) {
        this.ibsStatusMaster = ibsStatusMaster;
    }

    public IbsProductMaster getIbsProductMaster() {
        return this.ibsProductMaster;
    }

    public void setIbsProductMaster(IbsProductMaster ibsProductMaster) {
        this.ibsProductMaster = ibsProductMaster;
    }

    public BigDecimal getEnquiryNo() {
        return this.enquiryNo;
    }

    public void setEnquiryNo(BigDecimal enquiryNo) {
        this.enquiryNo = enquiryNo;
    }

    public Serializable getQuoteSlipDate() {
        return this.quoteSlipDate;
    }

    public void setQuoteSlipDate(Serializable quoteSlipDate) {
        this.quoteSlipDate = quoteSlipDate;
    }

    public String getSubClass() {
        return this.subClass;
    }

    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }

    public BigDecimal getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getInsuredId() {
        return this.insuredId;
    }

    public void setInsuredId(BigDecimal insuredId) {
        this.insuredId = insuredId;
    }

    public String getInsuredName() {
        return this.insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public Serializable getContractPeriodFrom() {
        return this.contractPeriodFrom;
    }

    public void setContractPeriodFrom(Serializable contractPeriodFrom) {
        this.contractPeriodFrom = contractPeriodFrom;
    }

    public Serializable getContractPeriodTo() {
        return this.contractPeriodTo;
    }

    public void setContractPeriodTo(Serializable contractPeriodTo) {
        this.contractPeriodTo = contractPeriodTo;
    }

    public Serializable getPolicyStartDate() {
        return this.policyStartDate;
    }

    public void setPolicyStartDate(Serializable policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public Serializable getPolicyExpiryDate() {
        return this.policyExpiryDate;
    }

    public void setPolicyExpiryDate(Serializable policyExpiryDate) {
        this.policyExpiryDate = policyExpiryDate;
    }

    public String getQuoteSlipEmailed() {
        return this.quoteSlipEmailed;
    }

    public void setQuoteSlipEmailed(String quoteSlipEmailed) {
        this.quoteSlipEmailed = quoteSlipEmailed;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public BigDecimal getRecCreUserId() {
        return this.recCreUserId;
    }

    public void setRecCreUserId(BigDecimal recCreUserId) {
        this.recCreUserId = recCreUserId;
    }

    public Serializable getRecCreDate() {
        return this.recCreDate;
    }

    public void setRecCreDate(Serializable recCreDate) {
        this.recCreDate = recCreDate;
    }

    public BigDecimal getRecUpdUserId() {
        return this.recUpdUserId;
    }

    public void setRecUpdUserId(BigDecimal recUpdUserId) {
        this.recUpdUserId = recUpdUserId;
    }

    public Serializable getRecUpdDate() {
        return this.recUpdDate;
    }

    public void setRecUpdDate(Serializable recUpdDate) {
        this.recUpdDate = recUpdDate;
    }

    public Set getIbsQuoteSlipDetails() {
        return this.ibsQuoteSlipDetails;
    }

    public void setIbsQuoteSlipDetails(Set ibsQuoteSlipDetails) {
        this.ibsQuoteSlipDetails = ibsQuoteSlipDetails;
    }

    public Set getIbsQuoteComparisionDetails() {
        return this.ibsQuoteComparisionDetails;
    }

    public void setIbsQuoteComparisionDetails(Set ibsQuoteComparisionDetails) {
        this.ibsQuoteComparisionDetails = ibsQuoteComparisionDetails;
    }

    public Set getIbsQuoteComparisionHeaders() {
        return this.ibsQuoteComparisionHeaders;
    }

    public void setIbsQuoteComparisionHeaders(Set ibsQuoteComparisionHeaders) {
        this.ibsQuoteComparisionHeaders = ibsQuoteComparisionHeaders;
    }

    public Set getIbsUwTransactions() {
        return this.ibsUwTransactions;
    }

    public void setIbsUwTransactions(Set ibsUwTransactions) {
        this.ibsUwTransactions = ibsUwTransactions;
    }




}