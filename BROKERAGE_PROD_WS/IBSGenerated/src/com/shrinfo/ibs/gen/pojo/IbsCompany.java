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
 * IbsCompany generated by hbm2java
 */
@Entity
@Table(name = "IBS_COMPANY", schema = "IBSUSER")
public class IbsCompany implements java.io.Serializable {


    private String code;

    private IbsContact ibsContact;

    private String shortname;

    private String name;

    private String status;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    private Set<IbsCompanyBranch> ibsCompanyBranchs = new HashSet<IbsCompanyBranch>(0);

    private Set<IbsInsuranceCompanyContact> ibsInsuranceCompanyContacts =
        new HashSet<IbsInsuranceCompanyContact>(0);

    public IbsCompany() {}


    public IbsCompany(String code) {
        this.code = code;
    }

    public IbsCompany(String code, IbsContact ibsContact, String shortname, String name,
            String status, BigDecimal recCreUserId, Serializable recCreDate,
            BigDecimal recUpdUserId, Serializable recUpdDate,
            Set<IbsCompanyBranch> ibsCompanyBranchs,
            Set<IbsInsuranceCompanyContact> ibsInsuranceCompanyContacts) {
        this.code = code;
        this.ibsContact = ibsContact;
        this.shortname = shortname;
        this.name = name;
        this.status = status;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
        this.ibsCompanyBranchs = ibsCompanyBranchs;
        this.ibsInsuranceCompanyContacts = ibsInsuranceCompanyContacts;
    }

    @Id
    @Column(name = "CODE", unique = true, nullable = false, length = 10)
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTACT_ID")
    public IbsContact getIbsContact() {
        return this.ibsContact;
    }

    public void setIbsContact(IbsContact ibsContact) {
        this.ibsContact = ibsContact;
    }


    @Column(name = "SHORTNAME", length = 10)
    public String getShortname() {
        return this.shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }


    @Column(name = "NAME", length = 10)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsCompany")
    public Set<IbsCompanyBranch> getIbsCompanyBranchs() {
        return this.ibsCompanyBranchs;
    }

    public void setIbsCompanyBranchs(Set<IbsCompanyBranch> ibsCompanyBranchs) {
        this.ibsCompanyBranchs = ibsCompanyBranchs;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsCompany")
    public Set<IbsInsuranceCompanyContact> getIbsInsuranceCompanyContacts() {
        return this.ibsInsuranceCompanyContacts;
    }

    public void setIbsInsuranceCompanyContacts(
            Set<IbsInsuranceCompanyContact> ibsInsuranceCompanyContacts) {
        this.ibsInsuranceCompanyContacts = ibsInsuranceCompanyContacts;
    }




}
