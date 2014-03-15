package com.shrinfo.ibs.gen.pojo;

// Generated Mar 15, 2014 6:17:35 AM by Hibernate Tools 3.4.0.CR1


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * IbsQuoteSlipHeader generated by hbm2java
 */
@Entity
@Table(name = "IBS_QUOTE_SLIP_HEADER", schema = "IBSUSER")
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

    private Set<IbsUwTransactionHeader> ibsUwTransactionHeaders =
        new HashSet<IbsUwTransactionHeader>(0);

    private Set<IbsQuoteSlipDetail> ibsQuoteSlipDetails = new HashSet<IbsQuoteSlipDetail>(0);

    private Set<IbsQuoteComparisionDetail> ibsQuoteComparisionDetails =
        new HashSet<IbsQuoteComparisionDetail>(0);

    private Set<IbsQuoteComparisionHeader> ibsQuoteComparisionHeaders =
        new HashSet<IbsQuoteComparisionHeader>(0);

    private Set<IbsUwTransaction> ibsUwTransactions = new HashSet<IbsUwTransaction>(0);

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
            BigDecimal recUpdUserId, Serializable recUpdDate,
            Set<IbsUwTransactionHeader> ibsUwTransactionHeaders,
            Set<IbsQuoteSlipDetail> ibsQuoteSlipDetails,
            Set<IbsQuoteComparisionDetail> ibsQuoteComparisionDetails,
            Set<IbsQuoteComparisionHeader> ibsQuoteComparisionHeaders,
            Set<IbsUwTransaction> ibsUwTransactions) {
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
        this.ibsUwTransactionHeaders = ibsUwTransactionHeaders;
        this.ibsQuoteSlipDetails = ibsQuoteSlipDetails;
        this.ibsQuoteComparisionDetails = ibsQuoteComparisionDetails;
        this.ibsQuoteComparisionHeaders = ibsQuoteComparisionHeaders;
        this.ibsUwTransactions = ibsUwTransactions;
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "id", column = @Column(name = "ID", nullable = false, precision = 22, scale = 0)),
            @AttributeOverride(name = "quoteSlipVersion", column = @Column(name = "QUOTE_SLIP_VERSION", nullable = false, precision = 22, scale = 0)) })
    public IbsQuoteSlipHeaderId getId() {
        return this.id;
    }

    public void setId(IbsQuoteSlipHeaderId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_CODE")
    public IbsStatusMaster getIbsStatusMaster() {
        return this.ibsStatusMaster;
    }

    public void setIbsStatusMaster(IbsStatusMaster ibsStatusMaster) {
        this.ibsStatusMaster = ibsStatusMaster;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_CLASS")
    public IbsProductMaster getIbsProductMaster() {
        return this.ibsProductMaster;
    }

    public void setIbsProductMaster(IbsProductMaster ibsProductMaster) {
        this.ibsProductMaster = ibsProductMaster;
    }


    @Column(name = "ENQUIRY_NO", precision = 22, scale = 0)
    public BigDecimal getEnquiryNo() {
        return this.enquiryNo;
    }

    public void setEnquiryNo(BigDecimal enquiryNo) {
        this.enquiryNo = enquiryNo;
    }


    @Column(name = "QUOTE_SLIP_DATE")
    public Serializable getQuoteSlipDate() {
        return this.quoteSlipDate;
    }

    public void setQuoteSlipDate(Serializable quoteSlipDate) {
        this.quoteSlipDate = quoteSlipDate;
    }


    @Column(name = "SUB_CLASS", length = 50)
    public String getSubClass() {
        return this.subClass;
    }

    public void setSubClass(String subClass) {
        this.subClass = subClass;
    }


    @Column(name = "CUSTOMER_ID", precision = 22, scale = 0)
    public BigDecimal getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }


    @Column(name = "INSURED_ID", precision = 22, scale = 0)
    public BigDecimal getInsuredId() {
        return this.insuredId;
    }

    public void setInsuredId(BigDecimal insuredId) {
        this.insuredId = insuredId;
    }


    @Column(name = "INSURED_NAME", length = 50)
    public String getInsuredName() {
        return this.insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }


    @Column(name = "CONTRACT_PERIOD_FROM")
    public Serializable getContractPeriodFrom() {
        return this.contractPeriodFrom;
    }

    public void setContractPeriodFrom(Serializable contractPeriodFrom) {
        this.contractPeriodFrom = contractPeriodFrom;
    }


    @Column(name = "CONTRACT_PERIOD_TO")
    public Serializable getContractPeriodTo() {
        return this.contractPeriodTo;
    }

    public void setContractPeriodTo(Serializable contractPeriodTo) {
        this.contractPeriodTo = contractPeriodTo;
    }


    @Column(name = "POLICY_START_DATE")
    public Serializable getPolicyStartDate() {
        return this.policyStartDate;
    }

    public void setPolicyStartDate(Serializable policyStartDate) {
        this.policyStartDate = policyStartDate;
    }


    @Column(name = "POLICY_EXPIRY_DATE")
    public Serializable getPolicyExpiryDate() {
        return this.policyExpiryDate;
    }

    public void setPolicyExpiryDate(Serializable policyExpiryDate) {
        this.policyExpiryDate = policyExpiryDate;
    }


    @Column(name = "QUOTE_SLIP_EMAILED", length = 1)
    public String getQuoteSlipEmailed() {
        return this.quoteSlipEmailed;
    }

    public void setQuoteSlipEmailed(String quoteSlipEmailed) {
        this.quoteSlipEmailed = quoteSlipEmailed;
    }


    @Column(name = "REMARKS", length = 200)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


    @Column(name = "REC_CRE_USER_ID", precision = 22, scale = 0)
    public BigDecimal getRecCreUserId() {
        return this.recCreUserId;
    }

    public void setRecCreUserId(BigDecimal recCreUserId) {
        this.recCreUserId = recCreUserId;
    }


    @Column(name = "REC_CRE_DATE")
    public Serializable getRecCreDate() {
        return this.recCreDate;
    }

    public void setRecCreDate(Serializable recCreDate) {
        this.recCreDate = recCreDate;
    }


    @Column(name = "REC_UPD_USER_ID", precision = 22, scale = 0)
    public BigDecimal getRecUpdUserId() {
        return this.recUpdUserId;
    }

    public void setRecUpdUserId(BigDecimal recUpdUserId) {
        this.recUpdUserId = recUpdUserId;
    }


    @Column(name = "REC_UPD_DATE")
    public Serializable getRecUpdDate() {
        return this.recUpdDate;
    }

    public void setRecUpdDate(Serializable recUpdDate) {
        this.recUpdDate = recUpdDate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsQuoteSlipHeader")
    public Set<IbsUwTransactionHeader> getIbsUwTransactionHeaders() {
        return this.ibsUwTransactionHeaders;
    }

    public void setIbsUwTransactionHeaders(Set<IbsUwTransactionHeader> ibsUwTransactionHeaders) {
        this.ibsUwTransactionHeaders = ibsUwTransactionHeaders;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsQuoteSlipHeader")
    public Set<IbsQuoteSlipDetail> getIbsQuoteSlipDetails() {
        return this.ibsQuoteSlipDetails;
    }

    public void setIbsQuoteSlipDetails(Set<IbsQuoteSlipDetail> ibsQuoteSlipDetails) {
        this.ibsQuoteSlipDetails = ibsQuoteSlipDetails;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsQuoteSlipHeader")
    public Set<IbsQuoteComparisionDetail> getIbsQuoteComparisionDetails() {
        return this.ibsQuoteComparisionDetails;
    }

    public void setIbsQuoteComparisionDetails(
            Set<IbsQuoteComparisionDetail> ibsQuoteComparisionDetails) {
        this.ibsQuoteComparisionDetails = ibsQuoteComparisionDetails;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsQuoteSlipHeader")
    public Set<IbsQuoteComparisionHeader> getIbsQuoteComparisionHeaders() {
        return this.ibsQuoteComparisionHeaders;
    }

    public void setIbsQuoteComparisionHeaders(
            Set<IbsQuoteComparisionHeader> ibsQuoteComparisionHeaders) {
        this.ibsQuoteComparisionHeaders = ibsQuoteComparisionHeaders;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsQuoteSlipHeader")
    public Set<IbsUwTransaction> getIbsUwTransactions() {
        return this.ibsUwTransactions;
    }

    public void setIbsUwTransactions(Set<IbsUwTransaction> ibsUwTransactions) {
        this.ibsUwTransactions = ibsUwTransactions;
    }




}
