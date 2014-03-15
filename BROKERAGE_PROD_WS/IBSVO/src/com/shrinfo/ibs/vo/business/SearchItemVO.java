package com.shrinfo.ibs.vo.business;

import com.shrinfo.ibs.cmn.vo.BaseVO;


public class SearchItemVO extends BaseVO {

    /**
     * 
     */
    private static final long serialVersionUID = 733026355772901204L;

    private String customerName;

    private String customerMob;

    private String customerEmail;

    private long customerId;

    private String insuredName;

    private long insuredId;

    private long enquiryNum;

    private long quotationNum;

    private String policyNum;


    public String getCustomerName() {
        return customerName;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getCustomerMob() {
        return customerMob;
    }


    public void setCustomerMob(String customerMob) {
        this.customerMob = customerMob;
    }


    public String getCustomerEmail() {
        return customerEmail;
    }


    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }


    public long getCustomerId() {
        return customerId;
    }


    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }


    public String getInsuredName() {
        return insuredName;
    }


    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }


    public long getInsuredId() {
        return insuredId;
    }


    public void setInsuredId(long insuredId) {
        this.insuredId = insuredId;
    }


    public long getEnquiryNum() {
        return enquiryNum;
    }


    public void setEnquiryNum(long enquiryNum) {
        this.enquiryNum = enquiryNum;
    }


    public long getQuotationNum() {
        return quotationNum;
    }


    public void setQuotationNum(long quotationNum) {
        this.quotationNum = quotationNum;
    }


    public String getPolicyNum() {
        return policyNum;
    }


    public void setPolicyNum(String policyNum) {
        this.policyNum = policyNum;
    }


    public static long getSerialversionuid() {
        return serialVersionUID;
    }


}
