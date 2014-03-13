package com.shrinfo.ibs.gen.pojo;

// Generated Mar 13, 2014 1:39:55 PM by Hibernate Tools 3.4.0.CR1


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * IbsInsuranceCompanyContact generated by hbm2java
 */
public class IbsInsuranceCompanyContact implements java.io.Serializable {


    private BigDecimal id;

    private IbsProductMaster ibsProductMaster;

    private IbsContact ibsContact;

    private IbsCompany ibsCompany;

    private String companyName;

    private String status;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    public IbsInsuranceCompanyContact() {}


    public IbsInsuranceCompanyContact(BigDecimal id) {
        this.id = id;
    }

    public IbsInsuranceCompanyContact(BigDecimal id, IbsProductMaster ibsProductMaster,
            IbsContact ibsContact, IbsCompany ibsCompany, String companyName, String status,
            BigDecimal recCreUserId, Serializable recCreDate, BigDecimal recUpdUserId,
            Serializable recUpdDate) {
        this.id = id;
        this.ibsProductMaster = ibsProductMaster;
        this.ibsContact = ibsContact;
        this.ibsCompany = ibsCompany;
        this.companyName = companyName;
        this.status = status;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public IbsProductMaster getIbsProductMaster() {
        return this.ibsProductMaster;
    }

    public void setIbsProductMaster(IbsProductMaster ibsProductMaster) {
        this.ibsProductMaster = ibsProductMaster;
    }

    public IbsContact getIbsContact() {
        return this.ibsContact;
    }

    public void setIbsContact(IbsContact ibsContact) {
        this.ibsContact = ibsContact;
    }

    public IbsCompany getIbsCompany() {
        return this.ibsCompany;
    }

    public void setIbsCompany(IbsCompany ibsCompany) {
        this.ibsCompany = ibsCompany;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getRecCreUserId() {
        return this.recCreUserId;
    }

    public void setRecCreUserId(BigDecimal recCreUserId) {
        this.recCreUserId = recCreUserId;
    }

    public Serializable getRecCreDate() {
        return this.recCreDate;
    }

    public void setRecCreDate(Serializable recCreDate) {
        this.recCreDate = recCreDate;
    }

    public BigDecimal getRecUpdUserId() {
        return this.recUpdUserId;
    }

    public void setRecUpdUserId(BigDecimal recUpdUserId) {
        this.recUpdUserId = recUpdUserId;
    }

    public Serializable getRecUpdDate() {
        return this.recUpdDate;
    }

    public void setRecUpdDate(Serializable recUpdDate) {
        this.recUpdDate = recUpdDate;
    }




}
