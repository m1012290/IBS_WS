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
public class QuoteDetailsVO extends BaseVO {

    private String quoteNo;

    private long quoteSlipId;

    private int quoteSlipVersion;

    private String quoteSlipDescription;

    private ProductVO productDetails;

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

}
