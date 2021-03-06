package com.shrinfo.ibs.gen.pojo;

// Generated Mar 17, 2014 1:52:55 AM by Hibernate Tools 3.4.0.CR1


import java.sql.Date;

/**
 * IbsInsuredMaster generated by hbm2java
 */
public class IbsInsuredMaster implements java.io.Serializable {


    private Long id;

    private IbsCustomer ibsCustomer;

    private IbsContact ibsContact;

    private String salutation;

    private String name;

    private String source;

    private String salesExecutive;

    private Long recCreUserId;

    private Date recCreDate;

    private Long recUpdUserId;

    private Date recUpdDate;

    public IbsInsuredMaster() {}


    public IbsInsuredMaster(Long id) {
        this.id = id;
    }

    public IbsInsuredMaster(Long id, IbsCustomer ibsCustomer, IbsContact ibsContact,
            String salutation, String name, String source, String salesExecutive,
            Long recCreUserId, Date recCreDate, Long recUpdUserId, Date recUpdDate) {
        this.id = id;
        this.ibsCustomer = ibsCustomer;
        this.ibsContact = ibsContact;
        this.salutation = salutation;
        this.name = name;
        this.source = source;
        this.salesExecutive = salesExecutive;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IbsCustomer getIbsCustomer() {
        return this.ibsCustomer;
    }

    public void setIbsCustomer(IbsCustomer ibsCustomer) {
        this.ibsCustomer = ibsCustomer;
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




}
