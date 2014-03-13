package com.shrinfo.ibs.vo.business;

import com.shrinfo.ibs.cmn.vo.BaseVO;

/**
 * @author Sunil Kumar This Class represents Insured entity in the application. These details are
 *         considered for underwriting as this entity is the insured.
 */
public class InsuredVO extends BaseVO {

    private static final long serialVersionUID = -2934748953623182662L;

    private String salutation;

    private String name;

    // source of business
    private String sourceOfBusiness;

    private ContactVO contactAndAddrDetails;

    private CustomerVO customerDetails;


    public String getSalutation() {
        return salutation;
    }


    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSourceOfBusiness() {
        return sourceOfBusiness;
    }


    public void setSourceOfBusiness(String sourceOfBusiness) {
        this.sourceOfBusiness = sourceOfBusiness;
    }


    public ContactVO getContactAndAddrDetails() {
        return contactAndAddrDetails;
    }


    public void setContactAndAddrDetails(ContactVO contactAndAddrDetails) {
        this.contactAndAddrDetails = contactAndAddrDetails;
    }


    public CustomerVO getInsuredCustomer() {
        return customerDetails;
    }


    public void setInsuredCustomer(CustomerVO insuredCustomer) {
        this.customerDetails = insuredCustomer;
    }

}