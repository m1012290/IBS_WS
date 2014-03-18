/**
 * 
 */
package com.shrinfo.ibs.vo.business;

import java.util.Date;

import com.shrinfo.ibs.cmn.vo.BaseVO;


/**
 * @author Sunil Kumar
 * 
 */
public class QuoteDetailVO extends BaseVO {

    /**
     * 
     */
    private static final long serialVersionUID = -5498039917625223122L;

    private String quoteNo;

    private long quoteSlipId;

    private int quoteSlipVersion;

    private String quoteSlipDescription;

    private ProductVO productDetails;

    private long customerId;

    private long enquiryNum;

    private long quoteSlipApprovedByUserId;

    private Date quoteSlipApprovalDate;

    private Date quoteSlipDate;

    private PremiumVO quoteSlipPrmDetails;

    private int statusCode;

    private String isQuoteSlipEmailed;

    private String isQuoteRecommended;

    private String recommendationSummary;

    private String isClosingSlipGenerated;

    private String isClosingSlipEmailed;

    private InsuredVO insuredDetails;

    private PolicyVO policyVO;

    public long getQuoteSlipId() {
        return quoteSlipId;
    }

    public void setQuoteSlipId(long quoteSlipId) {
        this.quoteSlipId = quoteSlipId;
    }

    public int getQuoteSlipVersion() {
        return quoteSlipVersion;
    }

    public void setQuoteSlipVersion(int quoteSlipVersion) {
        this.quoteSlipVersion = quoteSlipVersion;
    }

    public String getQuoteSlipDescription() {
        return quoteSlipDescription;
    }

    public void setQuoteSlipDescription(String quoteSlipDescription) {
        this.quoteSlipDescription = quoteSlipDescription;
    }

    public ProductVO getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductVO productDetails) {
        this.productDetails = productDetails;
    }


    public long getCustomerId() {
        return customerId;
    }


    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }


    public long getEnquiryNum() {
        return enquiryNum;
    }


    public void setEnquiryNum(long enquiryNum) {
        this.enquiryNum = enquiryNum;
    }


    public long getQuoteSlipApprovedByUserId() {
        return quoteSlipApprovedByUserId;
    }

    public void setQuoteSlipApprovedByUserId(long quoteSlipApprovedByUserId) {
        this.quoteSlipApprovedByUserId = quoteSlipApprovedByUserId;
    }

    public Date getQuoteSlipDate() {
        return quoteSlipDate;
    }

    public void setQuoteSlipDate(Date quoteSlipDate) {
        this.quoteSlipDate = quoteSlipDate;
    }

    public PremiumVO getQuoteSlipPrmDetails() {
        return quoteSlipPrmDetails;
    }

    public void setQuoteSlipPrmDetails(PremiumVO quoteSlipPrmDetails) {
        this.quoteSlipPrmDetails = quoteSlipPrmDetails;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getIsQuoteSlipEmailed() {
        return isQuoteSlipEmailed;
    }

    public void setIsQuoteSlipEmailed(String isQuoteSlipEmailed) {
        this.isQuoteSlipEmailed = isQuoteSlipEmailed;
    }

    public String getIsQuoteRecommended() {
        return isQuoteRecommended;
    }

    public void setIsQuoteRecommended(String isQuoteRecommended) {
        this.isQuoteRecommended = isQuoteRecommended;
    }

    public String getRecommendationSummary() {
        return recommendationSummary;
    }

    public void setRecommendationSummary(String recommendationSummary) {
        this.recommendationSummary = recommendationSummary;
    }


    public String getQuoteNo() {
        return quoteNo;
    }


    public void setQuoteNo(String quoteNo) {
        this.quoteNo = quoteNo;
    }


    public Date getQuoteSlipApprovalDate() {
        return quoteSlipApprovalDate;
    }


    public void setQuoteSlipApprovalDate(Date quoteSlipApprovalDate) {
        this.quoteSlipApprovalDate = quoteSlipApprovalDate;
    }


    public String getIsClosingSlipGenerated() {
        return isClosingSlipGenerated;
    }


    public void setIsClosingSlipGenerated(String isClosingSlipGenerated) {
        this.isClosingSlipGenerated = isClosingSlipGenerated;
    }


    public String getIsClosingSlipEmailed() {
        return isClosingSlipEmailed;
    }


    public void setIsClosingSlipEmailed(String isClosingSlipEmailed) {
        this.isClosingSlipEmailed = isClosingSlipEmailed;
    }


    public InsuredVO getInsuredDetails() {
        return insuredDetails;
    }


    public void setInsuredDetails(InsuredVO insuredDetails) {
        this.insuredDetails = insuredDetails;
    }



    public PolicyVO getPolicyVO() {
        return policyVO;
    }


    public void setPolicyVO(PolicyVO policyVO) {
        this.policyVO = policyVO;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
