package com.shrinfo.ibs.gen.pojo;

// Generated Mar 15, 2014 8:53:32 PM by Hibernate Tools 3.4.0.CR1


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * IbsQuoteComparisionHeader generated by hbm2java
 */
@Entity
@Table(name = "IBS_QUOTE_COMPARISION_HEADER", schema = "IBSUSER")
public class IbsQuoteComparisionHeader implements java.io.Serializable {


    private BigDecimal id;

    private IbsStatusMaster ibsStatusMaster;

    private IbsQuoteSlipHeader ibsQuoteSlipHeader;

    private IbsProductMaster ibsProductMaster;

    private BigDecimal enquiryNo;

    private String subClass;

    private BigDecimal customerId;

    private BigDecimal insuredId;

    private String insuredName;

    private Serializable policyStartDate;

    private Serializable policyExpiryDate;

    private String recommendationSummary;

    private String quoteRecommended;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    private Set<IbsUwTransactionHeader> ibsUwTransactionHeaders =
        new HashSet<IbsUwTransactionHeader>(0);

    public IbsQuoteComparisionHeader() {}


    public IbsQuoteComparisionHeader(BigDecimal id) {
        this.id = id;
    }

    public IbsQuoteComparisionHeader(BigDecimal id, IbsStatusMaster ibsStatusMaster,
            IbsQuoteSlipHeader ibsQuoteSlipHeader, IbsProductMaster ibsProductMaster,
            BigDecimal enquiryNo, String subClass, BigDecimal customerId, BigDecimal insuredId,
            String insuredName, Serializable policyStartDate, Serializable policyExpiryDate,
            String recommendationSummary, String quoteRecommended, BigDecimal recCreUserId,
            Serializable recCreDate, BigDecimal recUpdUserId, Serializable recUpdDate,
            Set<IbsUwTransactionHeader> ibsUwTransactionHeaders) {
        this.id = id;
        this.ibsStatusMaster = ibsStatusMaster;
        this.ibsQuoteSlipHeader = ibsQuoteSlipHeader;
        this.ibsProductMaster = ibsProductMaster;
        this.enquiryNo = enquiryNo;
        this.subClass = subClass;
        this.customerId = customerId;
        this.insuredId = insuredId;
        this.insuredName = insuredName;
        this.policyStartDate = policyStartDate;
        this.policyExpiryDate = policyExpiryDate;
        this.recommendationSummary = recommendationSummary;
        this.quoteRecommended = quoteRecommended;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
        this.ibsUwTransactionHeaders = ibsUwTransactionHeaders;
    }

    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
    public BigDecimal getId() {
        return this.id;
    }

    public void setId(BigDecimal id) {
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
    @JoinColumns({ @JoinColumn(name = "QUOTE_SLIP_ID", referencedColumnName = "ID"),
            @JoinColumn(name = "QUOTE_SLIP_VERSION", referencedColumnName = "QUOTE_SLIP_VERSION") })
    public IbsQuoteSlipHeader getIbsQuoteSlipHeader() {
        return this.ibsQuoteSlipHeader;
    }

    public void setIbsQuoteSlipHeader(IbsQuoteSlipHeader ibsQuoteSlipHeader) {
        this.ibsQuoteSlipHeader = ibsQuoteSlipHeader;
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


    @Column(name = "RECOMMENDATION_SUMMARY", length = 1000)
    public String getRecommendationSummary() {
        return this.recommendationSummary;
    }

    public void setRecommendationSummary(String recommendationSummary) {
        this.recommendationSummary = recommendationSummary;
    }


    @Column(name = "QUOTE_RECOMMENDED", length = 1)
    public String getQuoteRecommended() {
        return this.quoteRecommended;
    }

    public void setQuoteRecommended(String quoteRecommended) {
        this.quoteRecommended = quoteRecommended;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsQuoteComparisionHeader")
    public Set<IbsUwTransactionHeader> getIbsUwTransactionHeaders() {
        return this.ibsUwTransactionHeaders;
    }

    public void setIbsUwTransactionHeaders(Set<IbsUwTransactionHeader> ibsUwTransactionHeaders) {
        this.ibsUwTransactionHeaders = ibsUwTransactionHeaders;
    }




}
