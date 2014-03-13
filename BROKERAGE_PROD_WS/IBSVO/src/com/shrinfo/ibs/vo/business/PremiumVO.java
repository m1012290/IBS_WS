/**
 * 
 */
package com.shrinfo.ibs.vo.business;

import java.math.BigDecimal;


/**
 * @author Sunil Kumar This class represents premium details entity in the application. This can be
 *         used to hold premium details for all the type of enquiries.
 */
public class PremiumVO {

    private BigDecimal premium;

    private BigDecimal totalPremium;

    private double discountPercentage;

    private double loadingPercentage;

    private BigDecimal commissionAmt;

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    public BigDecimal getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(BigDecimal totalPremium) {
        this.totalPremium = totalPremium;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getLoadingPercentage() {
        return loadingPercentage;
    }

    public void setLoadingPercentage(double loadingPercentage) {
        this.loadingPercentage = loadingPercentage;
    }

    public BigDecimal getCommissionAmt() {
        return commissionAmt;
    }

    public void setCommissionAmt(BigDecimal commissionAmt) {
        this.commissionAmt = commissionAmt;
    }
}
