package com.shrinfo.ibs.gen.pojo;

// Generated Mar 15, 2014 8:53:32 PM by Hibernate Tools 3.4.0.CR1


import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * IbsCompanyBranch generated by hbm2java
 */
@Entity
@Table(name = "IBS_COMPANY_BRANCH", schema = "IBSUSER")
public class IbsCompanyBranch implements java.io.Serializable {


    private String code;

    private IbsContact ibsContact;

    private IbsCompany ibsCompany;

    private String shortname;

    private String name;

    private String abbr;

    private String status;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    public IbsCompanyBranch() {}


    public IbsCompanyBranch(String code) {
        this.code = code;
    }

    public IbsCompanyBranch(String code, IbsContact ibsContact, IbsCompany ibsCompany,
            String shortname, String name, String abbr, String status, BigDecimal recCreUserId,
            Serializable recCreDate, BigDecimal recUpdUserId, Serializable recUpdDate) {
        this.code = code;
        this.ibsContact = ibsContact;
        this.ibsCompany = ibsCompany;
        this.shortname = shortname;
        this.name = name;
        this.abbr = abbr;
        this.status = status;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COMPANY_CODE")
    public IbsCompany getIbsCompany() {
        return this.ibsCompany;
    }

    public void setIbsCompany(IbsCompany ibsCompany) {
        this.ibsCompany = ibsCompany;
    }


    @Column(name = "SHORTNAME", length = 10)
    public String getShortname() {
        return this.shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }


    @Column(name = "NAME", length = 30)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "ABBR", length = 4)
    public String getAbbr() {
        return this.abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
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




}
