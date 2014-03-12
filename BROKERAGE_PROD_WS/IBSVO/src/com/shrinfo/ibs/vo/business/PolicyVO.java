package com.shrinfo.ibs.vo.business;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.vo.app.EnquiryType;

public class PolicyVO extends BaseVO {

    private static final long serialVersionUID = 8127574257289256602L;
    
    //policy table transaction id is captured in below field
    private long uwTransactionId;
    
    private String policyNo;

    private String quoteNo;
    
    private int quoteNoVersion;
    
    private Map<InsCompanyVO,QuoteDetailsVO> quoteDetails;
    
    private InsuredVO insuredDetails;
    
    private EnquiryType enquiryType;//enquiry type enum
    
    private int statusCode;
    
    private PremiumVO premiumDetails;
    
    private BigDecimal sumInsured;

    private int policyTerm;
    
    private String coverDescription;
    
    private long policyApprovedByUserId;
    
    private boolean isQuote;//will tell us if its a policy or quote

    private Date policyEffectiveDate;
    
    private Date policyExpiryDate;
    
    private Date endtEffectiveDate;
    
    private Date endtExpiryDate;
    
    private int newQuoteVersion;
    
    private String isQuoteConvertedToPolicy;

    
    public long getUwTransactionId() {
        return uwTransactionId;
    }

    
    public void setUwTransactionId(long uwTransactionId) {
        this.uwTransactionId = uwTransactionId;
    }

    
    public String getPolicyNo() {
        return policyNo;
    }

    
    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    
    public String getQuoteNo() {
        return quoteNo;
    }

    
    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
    }

    
    public int getQuoteNoVersion() {
        return quoteNoVersion;
    }

    
    public void setQuoteNoVersion(int quoteNoVersion) {
        this.quoteNoVersion = quoteNoVersion;
    }

    
    public Map<InsCompanyVO, QuoteDetailsVO> getQuoteDetails() {
        return quoteDetails;
    }

    
    public void setQuoteDetails(Map<InsCompanyVO, QuoteDetailsVO> quoteDetails) {
        this.quoteDetails = quoteDetails;
    }

    
    public InsuredVO getInsuredDetails() {
        return insuredDetails;
    }

    
    public void setInsuredDetails(InsuredVO insuredDetails) {
        this.insuredDetails = insuredDetails;
    }

    
    public EnquiryType getEnquiryType() {
        return enquiryType;
    }

    
    public void setEnquiryType(EnquiryType enquiryType) {
        this.enquiryType = enquiryType;
    }

    
    public int getStatusCode() {
        return statusCode;
    }

    
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    
    public PremiumVO getPremiumDetails() {
        return premiumDetails;
    }

    
    public void setPremiumDetails(PremiumVO premiumDetails) {
        this.premiumDetails = premiumDetails;
    }

    
    public BigDecimal getSumInsured() {
        return sumInsured;
    }

    
    public void setSumInsured(BigDecimal sumInsured) {
        this.sumInsured = sumInsured;
    }

    
    public int getPolicyTerm() {
        return policyTerm;
    }

    
    public void setPolicyTerm(int policyTerm) {
        this.policyTerm = policyTerm;
    }

    
    public String getCoverDescription() {
        return coverDescription;
    }

    
    public void setCoverDescription(String coverDescription) {
        this.coverDescription = coverDescription;
    }

    
    public long getPolicyApprovedByUserId() {
        return policyApprovedByUserId;
    }

    
    public void setPolicyApprovedByUserId(long policyApprovedByUserId) {
        this.policyApprovedByUserId = policyApprovedByUserId;
    }

    
    public boolean isQuote() {
        return isQuote;
    }

    
    public void setQuote(boolean isQuote) {
        this.isQuote = isQuote;
    }

    
    public Date getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

    
    public void setPolicyEffectiveDate(Date policyEffectiveDate) {
        this.policyEffectiveDate = policyEffectiveDate;
    }

    
    public Date getPolicyExpiryDate() {
        return policyExpiryDate;
    }

    
    public void setPolicyExpiryDate(Date policyExpiryDate) {
        this.policyExpiryDate = policyExpiryDate;
    }

    
    public Date getEndtEffectiveDate() {
        return endtEffectiveDate;
    }

    
    public void setEndtEffectiveDate(Date endtEffectiveDate) {
        this.endtEffectiveDate = endtEffectiveDate;
    }

    
    public Date getEndtExpiryDate() {
        return endtExpiryDate;
    }

    
    public void setEndtExpiryDate(Date endtExpiryDate) {
        this.endtExpiryDate = endtExpiryDate;
    }

    
    public int getNewQuoteVersion() {
        return newQuoteVersion;
    }

    
    public void setNewQuoteVersion(int newQuoteVersion) {
        this.newQuoteVersion = newQuoteVersion;
    }

    
    public String getIsQuoteConvertedToPolicy() {
        return isQuoteConvertedToPolicy;
    }

    
    public void setIsQuoteConvertedToPolicy(String isQuoteConvertedToPolicy) {
        this.isQuoteConvertedToPolicy = isQuoteConvertedToPolicy;
    }
}