package com.shrinfo.ibs.vo.business;

import java.util.Date;

import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.vo.app.EnquiryType;

/**
 * @author Sunil Kumar This class represents enquiry details which are coming in to the broker.
 */
public class EnquiryVO extends BaseVO {

    private static final long serialVersionUID = -5553146497827099745L;

    private Long enquiryNo;

    private EnquiryType type;

    private CustomerVO customerDetails;

    private ContactVO enquiryContact;

    private Date recievedDate;

    private ProductVO productDetails;

    private String description;

    // From Client Side
    private String enquirySme;


    public Long getEnquiryNo() {
        return enquiryNo;
    }


    public void setEnquiryNo(Long enquiryNo) {
        this.enquiryNo = enquiryNo;
    }


    public EnquiryType getType() {
        return type;
    }


    public void setType(EnquiryType type) {
        this.type = type;
    }


    public CustomerVO getCustomerDetails() {
        return customerDetails;
    }


    public void setCustomerDetails(CustomerVO customerDetails) {
        this.customerDetails = customerDetails;
    }


    public ContactVO getEnquiryContact() {
        return enquiryContact;
    }


    public void setEnquiryContact(ContactVO enquiryContact) {
        this.enquiryContact = enquiryContact;
    }


    public Date getRecievedDate() {
        return recievedDate;
    }


    public void setRecievedDate(Date recievedDate) {
        this.recievedDate = recievedDate;
    }


    public ProductVO getProduct() {
        return productDetails;
    }

    /**
     * 
     * @param product
     */
    public void setProduct(ProductVO product) {
        this.productDetails = product;
    }

    /**
     * 
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    public String getEnquirySme() {
        return enquirySme;
    }


    public void setEnquirySme(String enquirySme) {
        this.enquirySme = enquirySme;
    }

}