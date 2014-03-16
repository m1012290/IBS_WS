package com.shrinfo.ibs.gen.pojo;

// Generated Mar 17, 2014 1:52:55 AM by Hibernate Tools 3.4.0.CR1


import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * IbsCustomer generated by hbm2java
 */
public class IbsCustomer implements java.io.Serializable {


    private Long id;

    private IbsContact ibsContact;

    private String salutation;

    private String name;

    private String category;

    private String custGroup;

    private String classification;

    private String source;

    private String salesExecutive;

    private Long recCreUserId;

    private Date recCreDate;

    private Long recUpdUserId;

    private Date recUpdDate;

    private Long status;

    private Set<IbsCustomerEnquiry> ibsCustomerEnquiries = new HashSet<IbsCustomerEnquiry>(0);

    private Set<IbsInsuredMaster> ibsInsuredMasters = new HashSet<IbsInsuredMaster>(0);

    public IbsCustomer() {}


    public IbsCustomer(Long id) {
        this.id = id;
    }

    public IbsCustomer(Long id, IbsContact ibsContact, String salutation, String name,
            String category, String custGroup, String classification, String source,
            String salesExecutive, Long recCreUserId, Date recCreDate, Long recUpdUserId,
            Date recUpdDate, Long status, Set<IbsCustomerEnquiry> ibsCustomerEnquiries,
            Set<IbsInsuredMaster> ibsInsuredMasters) {
        this.id = id;
        this.ibsContact = ibsContact;
        this.salutation = salutation;
        this.name = name;
        this.category = category;
        this.custGroup = custGroup;
        this.classification = classification;
        this.source = source;
        this.salesExecutive = salesExecutive;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
        this.status = status;
        this.ibsCustomerEnquiries = ibsCustomerEnquiries;
        this.ibsInsuredMasters = ibsInsuredMasters;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IbsContact getIbsContact() {
        return this.ibsContact;
    }

    public void setIbsContact(IbsContact ibsContact) {
        this.ibsContact = ibsContact;
    }

    public String getSalutation() {
        return this.salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCustGroup() {
        return this.custGroup;
    }

    public void setCustGroup(String custGroup) {
        this.custGroup = custGroup;
    }

    public String getClassification() {
        return this.classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSalesExecutive() {
        return this.salesExecutive;
    }

    public void setSalesExecutive(String salesExecutive) {
        this.salesExecutive = salesExecutive;
    }

    public Long getRecCreUserId() {
        return this.recCreUserId;
    }

    public void setRecCreUserId(Long recCreUserId) {
        this.recCreUserId = recCreUserId;
    }

    public Date getRecCreDate() {
        return this.recCreDate;
    }

    public void setRecCreDate(Date recCreDate) {
        this.recCreDate = recCreDate;
    }

    public Long getRecUpdUserId() {
        return this.recUpdUserId;
    }

    public void setRecUpdUserId(Long recUpdUserId) {
        this.recUpdUserId = recUpdUserId;
    }

    public Date getRecUpdDate() {
        return this.recUpdDate;
    }

    public void setRecUpdDate(Date recUpdDate) {
        this.recUpdDate = recUpdDate;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Set<IbsCustomerEnquiry> getIbsCustomerEnquiries() {
        return this.ibsCustomerEnquiries;
    }

    public void setIbsCustomerEnquiries(Set<IbsCustomerEnquiry> ibsCustomerEnquiries) {
        this.ibsCustomerEnquiries = ibsCustomerEnquiries;
    }

    public Set<IbsInsuredMaster> getIbsInsuredMasters() {
        return this.ibsInsuredMasters;
    }

    public void setIbsInsuredMasters(Set<IbsInsuredMaster> ibsInsuredMasters) {
        this.ibsInsuredMasters = ibsInsuredMasters;
    }




}
