package com.shrinfo.ibs.gen.pojo;

// Generated Mar 17, 2014 1:52:55 AM by Hibernate Tools 3.4.0.CR1


import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * IbsUser generated by hbm2java
 */
public class IbsUser implements java.io.Serializable {


    private Long id;

    private String loginName;

    private String password;

    private String description;

    private String name;

    private String contactNo;

    private String emailId;

    private Long branchCode;

    private String freezeFlag;

    private String status;

    private Long recCreUserId;

    private Date recCreDate;

    private Long recUpdUserId;

    private Date recUpdDate;

    private Set<IbsUserProductLink> ibsUserProductLinks = new HashSet<IbsUserProductLink>(0);

    public IbsUser() {}


    public IbsUser(Long id) {
        this.id = id;
    }

    public IbsUser(Long id, String loginName, String password, String description, String name,
            String contactNo, String emailId, Long branchCode, String freezeFlag, String status,
            Long recCreUserId, Date recCreDate, Long recUpdUserId, Date recUpdDate,
            Set<IbsUserProductLink> ibsUserProductLinks) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
        this.description = description;
        this.name = name;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.branchCode = branchCode;
        this.freezeFlag = freezeFlag;
        this.status = status;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
        this.ibsUserProductLinks = ibsUserProductLinks;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return this.contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public Long getBranchCode() {
        return this.branchCode;
    }

    public void setBranchCode(Long branchCode) {
        this.branchCode = branchCode;
    }

    public String getFreezeFlag() {
        return this.freezeFlag;
    }

    public void setFreezeFlag(String freezeFlag) {
        this.freezeFlag = freezeFlag;
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

    public Set<IbsUserProductLink> getIbsUserProductLinks() {
        return this.ibsUserProductLinks;
    }

    public void setIbsUserProductLinks(Set<IbsUserProductLink> ibsUserProductLinks) {
        this.ibsUserProductLinks = ibsUserProductLinks;
    }




}
