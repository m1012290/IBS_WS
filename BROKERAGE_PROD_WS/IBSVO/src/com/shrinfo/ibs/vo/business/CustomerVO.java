package com.shrinfo.ibs.vo.business;

import java.util.List;

public abstract class CustomerVO extends BaseVO {

    /**
	 * 
	 */
    private static final long serialVersionUID = -7346107748917877189L;

    private Long customerId;

    private String salutation;

    private String name;

    // Individual / Corporate
    private String category;

    private String group;

    // Any specific classification reqd. Eg/- Government,Private,Public Limited
    // etc
    private String classification;

    // source of business
    private String source;

    private ContactVO contact;

    private List<InsuredVO> insureList;

    private String status;

    /**
     * @return the customerId
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the salutation
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * @param salutation the salutation to set
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @return the classification
     */
    public String getClassification() {
        return classification;
    }

    /**
     * @param classification the classification to set
     */
    public void setClassification(String classification) {
        this.classification = classification;
    }

    /**
     * @return the source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source the source to set
     */
    public void setSource(String source) {
        this.source = source;
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
     * @return the insureList
     */
    public List<InsuredVO> getInsureList() {
        return insureList;
    }

    /**
     * @param insureList the insureList to set
     */
    public void setInsureList(List<InsuredVO> insureList) {
        this.insureList = insureList;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
