package com.shrinfo.ibs.gen.pojo;

// Generated Mar 15, 2014 6:17:35 AM by Hibernate Tools 3.4.0.CR1


import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * IbsQuoteComparisionDetail generated by hbm2java
 */
@Entity
@Table(name = "IBS_QUOTE_COMPARISION_DETAIL", schema = "IBSUSER")
public class IbsQuoteComparisionDetail implements java.io.Serializable {


    private BigDecimal id;

    private IbsProductUwFields ibsProductUwFields;

    private IbsStatusMaster ibsStatusMaster;

    private IbsQuoteSlipHeader ibsQuoteSlipHeader;

    private IbsProductMaster ibsProductMaster;

    private BigDecimal enquiryNo;

    private String enquiryType;

    private String quotedCompanyCode;

    private Serializable policyStartDate;

    private Serializable policyExpiryDate;

    private String productUwFieldAnswer;

    private String quoteNo;

    private BigDecimal quotedPremium;

    private BigDecimal discountPercentage;

    private BigDecimal loadingPercentage;

    private BigDecimal totalPremium;

    private BigDecimal commissionOnPrm;

    private String policyNo;

    private BigDecimal sumInsured;

    private BigDecimal policyTerm;

    private String coverDescription;

    private Serializable quoteDate;

    private String quoteApprovedBy;

    private String quoteRecommended;

    private String closingSlipEmailed;

    private String quoteConvertedToPol;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    public IbsQuoteComparisionDetail() {}


    public IbsQuoteComparisionDetail(BigDecimal id) {
        this.id = id;
    }

    public IbsQuoteComparisionDetail(BigDecimal id, IbsProductUwFields ibsProductUwFields,
            IbsStatusMaster ibsStatusMaster, IbsQuoteSlipHeader ibsQuoteSlipHeader,
            IbsProductMaster ibsProductMaster, BigDecimal enquiryNo, String enquiryType,
            String quotedCompanyCode, Serializable policyStartDate, Serializable policyExpiryDate,
            String productUwFieldAnswer, String quoteNo, BigDecimal quotedPremium,
            BigDecimal discountPercentage, BigDecimal loadingPercentage, BigDecimal totalPremium,
            BigDecimal commissionOnPrm, String policyNo, BigDecimal sumInsured,
            BigDecimal policyTerm, String coverDescription, Serializable quoteDate,
            String quoteApprovedBy, String quoteRecommended, String closingSlipEmailed,
            String quoteConvertedToPol, BigDecimal recCreUserId, Serializable recCreDate,
            BigDecimal recUpdUserId, Serializable recUpdDate) {
        this.id = id;
        this.ibsProductUwFields = ibsProductUwFields;
        this.ibsStatusMaster = ibsStatusMaster;
        this.ibsQuoteSlipHeader = ibsQuoteSlipHeader;
        this.ibsProductMaster = ibsProductMaster;
        this.enquiryNo = enquiryNo;
        this.enquiryType = enquiryType;
        this.quotedCompanyCode = quotedCompanyCode;
        this.policyStartDate = policyStartDate;
        this.policyExpiryDate = policyExpiryDate;
        this.productUwFieldAnswer = productUwFieldAnswer;
        this.quoteNo = quoteNo;
        this.quotedPremium = quotedPremium;
        this.discountPercentage = discountPercentage;
        this.loadingPercentage = loadingPercentage;
        this.totalPremium = totalPremium;
        this.commissionOnPrm = commissionOnPrm;
        this.policyNo = policyNo;
        this.sumInsured = sumInsured;
        this.policyTerm = policyTerm;
        this.coverDescription = coverDescription;
        this.quoteDate = quoteDate;
        this.quoteApprovedBy = quoteApprovedBy;
        this.quoteRecommended = quoteRecommended;
        this.closingSlipEmailed = closingSlipEmailed;
        this.quoteConvertedToPol = quoteConvertedToPol;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
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
    @JoinColumn(name = "PRODUCT_UW_FIELD_ID")
    public IbsProductUwFields getIbsProductUwFields() {
        return this.ibsProductUwFields;
    }

    public void setIbsProductUwFields(IbsProductUwFields ibsProductUwFields) {
        this.ibsProductUwFields = ibsProductUwFields;
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


    @Column(name = "ENQUIRY_TYPE", length = 15)
    public String getEnquiryType() {
        return this.enquiryType;
    }

    public void setEnquiryType(String enquiryType) {
        this.enquiryType = enquiryType;
    }


    @Column(name = "QUOTED_COMPANY_CODE", length = 10)
    public String getQuotedCompanyCode() {
        return this.quotedCompanyCode;
    }

    public void setQuotedCompanyCode(String quotedCompanyCode) {
        this.quotedCompanyCode = quotedCompanyCode;
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


    @Column(name = "PRODUCT_UW_FIELD_ANSWER", length = 100)
    public String getProductUwFieldAnswer() {
        return this.productUwFieldAnswer;
    }

    public void setProductUwFieldAnswer(String productUwFieldAnswer) {
        this.productUwFieldAnswer = productUwFieldAnswer;
    }


    @Column(name = "QUOTE_NO", length = 50)
    public String getQuoteNo() {
        return this.quoteNo;
    }

    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
    }


    @Column(name = "QUOTED_PREMIUM", precision = 15, scale = 3)
    public BigDecimal getQuotedPremium() {
        return this.quotedPremium;
    }

    public void setQuotedPremium(BigDecimal quotedPremium) {
        this.quotedPremium = quotedPremium;
    }


    @Column(name = "DISCOUNT_PERCENTAGE", precision = 22, scale = 0)
    public BigDecimal getDiscountPercentage() {
        return this.discountPercentage;
    }

    public void setDiscountPercentage(BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
    }


    @Column(name = "LOADING_PERCENTAGE", precision = 22, scale = 0)
    public BigDecimal getLoadingPercentage() {
        return this.loadingPercentage;
    }

    public void setLoadingPercentage(BigDecimal loadingPercentage) {
        this.loadingPercentage = loadingPercentage;
    }


    @Column(name = "TOTAL_PREMIUM", precision = 15, scale = 3)
    public BigDecimal getTotalPremium() {
        return this.totalPremium;
    }

    public void setTotalPremium(BigDecimal totalPremium) {
        this.totalPremium = totalPremium;
    }


    @Column(name = "COMMISSION_ON_PRM", precision = 15, scale = 3)
    public BigDecimal getCommissionOnPrm() {
        return this.commissionOnPrm;
    }

    public void setCommissionOnPrm(BigDecimal commissionOnPrm) {
        this.commissionOnPrm = commissionOnPrm;
    }


    @Column(name = "POLICY_NO", length = 50)
    public String getPolicyNo() {
        return this.policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }


    @Column(name = "SUM_INSURED", precision = 22, scale = 0)
    public BigDecimal getSumInsured() {
        return this.sumInsured;
    }

    public void setSumInsured(BigDecimal sumInsured) {
        this.sumInsured = sumInsured;
    }


    @Column(name = "POLICY_TERM", precision = 20, scale = 3)
    public BigDecimal getPolicyTerm() {
        return this.policyTerm;
    }

    public void setPolicyTerm(BigDecimal policyTerm) {
        this.policyTerm = policyTerm;
    }


    @Column(name = "COVER_DESCRIPTION", length = 1000)
    public String getCoverDescription() {
        return this.coverDescription;
    }

    public void setCoverDescription(String coverDescription) {
        this.coverDescription = coverDescription;
    }


    @Column(name = "QUOTE_DATE")
    public Serializable getQuoteDate() {
        return this.quoteDate;
    }

    public void setQuoteDate(Serializable quoteDate) {
        this.quoteDate = quoteDate;
    }


    @Column(name = "QUOTE_APPROVED_BY", length = 10)
    public String getQuoteApprovedBy() {
        return this.quoteApprovedBy;
    }

    public void setQuoteApprovedBy(String quoteApprovedBy) {
        this.quoteApprovedBy = quoteApprovedBy;
    }


    @Column(name = "QUOTE_RECOMMENDED", length = 1)
    public String getQuoteRecommended() {
        return this.quoteRecommended;
    }

    public void setQuoteRecommended(String quoteRecommended) {
        this.quoteRecommended = quoteRecommended;
    }


    @Column(name = "CLOSING_SLIP_EMAILED", length = 1)
    public String getClosingSlipEmailed() {
        return this.closingSlipEmailed;
    }

    public void setClosingSlipEmailed(String closingSlipEmailed) {
        this.closingSlipEmailed = closingSlipEmailed;
    }


    @Column(name = "QUOTE_CONVERTED_TO_POL", length = 1)
    public String getQuoteConvertedToPol() {
        return this.quoteConvertedToPol;
    }

    public void setQuoteConvertedToPol(String quoteConvertedToPol) {
        this.quoteConvertedToPol = quoteConvertedToPol;
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




}
