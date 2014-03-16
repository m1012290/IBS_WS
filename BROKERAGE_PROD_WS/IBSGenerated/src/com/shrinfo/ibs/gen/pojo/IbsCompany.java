package com.shrinfo.ibs.gen.pojo;

// Generated Mar 17, 2014 1:52:55 AM by Hibernate Tools 3.4.0.CR1


import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * IbsCompany generated by hbm2java
 */
public class IbsCompany implements java.io.Serializable {


    private String code;

    private IbsContact ibsContact;

    private String shortname;

    private String name;

    private String status;

    private Long recCreUserId;

    private Date recCreDate;

    private Long recUpdUserId;

    private Date recUpdDate;

    private Set<IbsCompanyBranch> ibsCompanyBranchs = new HashSet<IbsCompanyBranch>(0);

    private Set<IbsInsuranceCompanyContact> ibsInsuranceCompanyContacts =
        new HashSet<IbsInsuranceCompanyContact>(0);

    public IbsCompany() {}


    public IbsCompany(String code) {
        this.code = code;
    }

    public IbsCompany(String code, IbsContact ibsContact, String shortname, String name,
            String status, Long recCreUserId, Date recCreDate, Long recUpdUserId, Date recUpdDate,
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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public IbsContact getIbsContact() {
        return this.ibsContact;
    }

    public void setIbsContact(IbsContact ibsContact) {
        this.ibsContact = ibsContact;
    }

    public String getShortname() {
        return this.shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Set<IbsCompanyBranch> getIbsCompanyBranchs() {
        return this.ibsCompanyBranchs;
    }

    public void setIbsCompanyBranchs(Set<IbsCompanyBranch> ibsCompanyBranchs) {
        this.ibsCompanyBranchs = ibsCompanyBranchs;
    }

    public Set<IbsInsuranceCompanyContact> getIbsInsuranceCompanyContacts() {
        return this.ibsInsuranceCompanyContacts;
    }

    public void setIbsInsuranceCompanyContacts(
            Set<IbsInsuranceCompanyContact> ibsInsuranceCompanyContacts) {
        this.ibsInsuranceCompanyContacts = ibsInsuranceCompanyContacts;
    }




}
