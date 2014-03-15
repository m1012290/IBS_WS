package com.shrinfo.ibs.gen.pojo;

// Generated Mar 15, 2014 6:17:35 AM by Hibernate Tools 3.4.0.CR1


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * IbsCustomer generated by hbm2java
 */
@Entity
@Table(name = "IBS_CUSTOMER", schema = "IBSUSER")
public class IbsCustomer implements java.io.Serializable {


    private BigDecimal id;

    private IbsContact ibsContact;

    private String salutation;

    private String name;

    private String category;

    private String custGroup;

    private String classification;

    private String source;

    private String salesExecutive;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    private Set<IbsInsuredMaster> ibsInsuredMasters = new HashSet<IbsInsuredMaster>(0);

    private Set<IbsCustomerEnquiry> ibsCustomerEnquiries = new HashSet<IbsCustomerEnquiry>(0);

    public IbsCustomer() {}


    public IbsCustomer(BigDecimal id) {
        this.id = id;
    }

    public IbsCustomer(BigDecimal id, IbsContact ibsContact, String salutation, String name,
            String category, String custGroup, String classification, String source,
            String salesExecutive, BigDecimal recCreUserId, Serializable recCreDate,
            BigDecimal recUpdUserId, Serializable recUpdDate,
            Set<IbsInsuredMaster> ibsInsuredMasters, Set<IbsCustomerEnquiry> ibsCustomerEnquiries) {
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
        this.ibsInsuredMasters = ibsInsuredMasters;
        this.ibsCustomerEnquiries = ibsCustomerEnquiries;
    }

    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
    public BigDecimal getId() {
        return this.id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTACT_ID")
    public IbsContact getIbsContact() {
        return this.ibsContact;
    }

    public void setIbsContact(IbsContact ibsContact) {
        this.ibsContact = ibsContact;
    }


    @Column(name = "SALUTATION", length = 5)
    public String getSalutation() {
        return this.salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }


    @Column(name = "NAME", length = 100)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "CATEGORY", length = 15)
    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    @Column(name = "CUST_GROUP", length = 50)
    public String getCustGroup() {
        return this.custGroup;
    }

    public void setCustGroup(String custGroup) {
        this.custGroup = custGroup;
    }


    @Column(name = "CLASSIFICATION", length = 15)
    public String getClassification() {
        return this.classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }


    @Column(name = "SOURCE", length = 15)
    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }


    @Column(name = "SALES_EXECUTIVE", length = 50)
    public String getSalesExecutive() {
        return this.salesExecutive;
    }

    public void setSalesExecutive(String salesExecutive) {
        this.salesExecutive = salesExecutive;
    }


    @Column(name = "REC_CRE_USER_ID", precision = 22, scale = 0)
    public BigDecimal getRecCreUserId() {
        return this.recCreUserId;
    }

    public void setRecCreUserId(BigDecimal recCreUserId) {
        this.recCreUserId = recCreUserId;
    }


    @Column(name = "REC_CRE_DATE")
    public Serializable getRecCreDate() {
        return this.recCreDate;
    }

    public void setRecCreDate(Serializable recCreDate) {
        this.recCreDate = recCreDate;
    }


    @Column(name = "REC_UPD_USER_ID", precision = 22, scale = 0)
    public BigDecimal getRecUpdUserId() {
        return this.recUpdUserId;
    }

    public void setRecUpdUserId(BigDecimal recUpdUserId) {
        this.recUpdUserId = recUpdUserId;
    }


    @Column(name = "REC_UPD_DATE")
    public Serializable getRecUpdDate() {
        return this.recUpdDate;
    }

    public void setRecUpdDate(Serializable recUpdDate) {
        this.recUpdDate = recUpdDate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsCustomer")
    public Set<IbsInsuredMaster> getIbsInsuredMasters() {
        return this.ibsInsuredMasters;
    }

    public void setIbsInsuredMasters(Set<IbsInsuredMaster> ibsInsuredMasters) {
        this.ibsInsuredMasters = ibsInsuredMasters;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsCustomer")
    public Set<IbsCustomerEnquiry> getIbsCustomerEnquiries() {
        return this.ibsCustomerEnquiries;
    }

    public void setIbsCustomerEnquiries(Set<IbsCustomerEnquiry> ibsCustomerEnquiries) {
        this.ibsCustomerEnquiries = ibsCustomerEnquiries;
    }




}
