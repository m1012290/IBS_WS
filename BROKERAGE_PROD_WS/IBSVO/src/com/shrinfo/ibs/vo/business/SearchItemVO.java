package com.shrinfo.ibs.vo.business;

import com.shrinfo.ibs.cmn.vo.BaseVO;


public class SearchItemVO extends BaseVO {

    /**
     * 
     */
    private static final long serialVersionUID = 733026355772901204L;

    private CustomerVO customerDetails;

    private InsuredVO insuredDetails;

    private long enquiryNum;

    private long quotationNum;

    private String policyNum;


    public CustomerVO getCustomerDetails() {
        return customerDetails;
    }


    public void setCustomerDetails(CustomerVO customerDetails) {
        this.customerDetails = customerDetails;
    }


    public InsuredVO getInsuredDetails() {
        return insuredDetails;
    }


    public void setInsuredDetails(InsuredVO insuredDetails) {
        this.insuredDetails = insuredDetails;
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
