package com.shrinfo.ibs.vo.business;

import java.util.Date;


public class EnquiryVO extends BaseVO {

    /**
	 * 
	 */
    private static final long serialVersionUID = -5553146497827099745L;

    private Long enquiryNum;

    // type of enquireis- policy, endorsement, renewal, claims
    // TODO enum instead of string
    private String enquiryType;

    private CustomerVO recievedFrom;

    private Date recievedDate;

    private ContactVO contact;

    private ProductVO product;

    private String desc;

    // From Client Side
    private String enquirySme;

    /**
     * @return the enquiryNum
     */
    public Long getEnquiryNum() {
        return enquiryNum;
    }

    /**
     * @param enquiryNum the enquiryNum to set
     */
    public void setEnquiryNum(Long enquiryNum) {
        this.enquiryNum = enquiryNum;
    }

    /**
     * @return the enquiryType
     */
    public String getEnquiryType() {
        return enquiryType;
    }

    /**
     * @param enquiryType the enquiryType to set
     */
    public void setEnquiryType(String enquiryType) {
        this.enquiryType = enquiryType;
    }

    /**
     * @return the recievedFrom
     */
    public CustomerVO getRecievedFrom() {
        return recievedFrom;
    }

    /**
     * @param recievedFrom the recievedFrom to set
     */
    public void setRecievedFrom(CustomerVO recievedFrom) {
        this.recievedFrom = recievedFrom;
    }

    /**
     * @return the recievedDate
     */
    public Date getRecievedDate() {
        return recievedDate;
    }

    /**
     * @param recievedDate the recievedDate to set
     */
    public void setRecievedDate(Date recievedDate) {
        this.recievedDate = recievedDate;
    }

    /**
     * @return the contact
     */
    public ContactVO getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(ContactVO contact) {
        this.contact = contact;
    }

    /**
     * @return the product
     */
    public ProductVO getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(ProductVO product) {
        this.product = product;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the enquirySme
     */
    public String getEnquirySme() {
        return enquirySme;
    }

    /**
     * @param enquirySme the enquirySme to set
     */
    public void setEnquirySme(String enquirySme) {
        this.enquirySme = enquirySme;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
