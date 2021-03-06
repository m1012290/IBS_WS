package com.shrinfo.ibs.gen.pojo;

// Generated Mar 17, 2014 1:52:55 AM by Hibernate Tools 3.4.0.CR1


import java.sql.Date;

/**
 * IbsTask generated by hbm2java
 */
public class IbsTask implements java.io.Serializable {


    private Long id;

    private IbsStatusMaster ibsStatusMaster;

    private Long enquiryNo;

    private String documentId;

    private String referralDesc;

    private Long assignorUserId;

    private Long assigneeUserId;

    private Long recCreUserId;

    private Date recCreDate;

    private Long recUpdUserId;

    private Date recUpdDate;

    public IbsTask() {}


    public IbsTask(Long id) {
        this.id = id;
    }

    public IbsTask(Long id, IbsStatusMaster ibsStatusMaster, Long enquiryNo, String documentId,
            String referralDesc, Long assignorUserId, Long assigneeUserId, Long recCreUserId,
            Date recCreDate, Long recUpdUserId, Date recUpdDate) {
        this.id = id;
        this.ibsStatusMaster = ibsStatusMaster;
        this.enquiryNo = enquiryNo;
        this.documentId = documentId;
        this.referralDesc = referralDesc;
        this.assignorUserId = assignorUserId;
        this.assigneeUserId = assigneeUserId;
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

    public IbsStatusMaster getIbsStatusMaster() {
        return this.ibsStatusMaster;
    }

    public void setIbsStatusMaster(IbsStatusMaster ibsStatusMaster) {
        this.ibsStatusMaster = ibsStatusMaster;
    }

    public Long getEnquiryNo() {
        return this.enquiryNo;
    }

    public void setEnquiryNo(Long enquiryNo) {
        this.enquiryNo = enquiryNo;
    }

    public String getDocumentId() {
        return this.documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getReferralDesc() {
        return this.referralDesc;
    }

    public void setReferralDesc(String referralDesc) {
        this.referralDesc = referralDesc;
    }

    public Long getAssignorUserId() {
        return this.assignorUserId;
    }

    public void setAssignorUserId(Long assignorUserId) {
        this.assignorUserId = assignorUserId;
    }

    public Long getAssigneeUserId() {
        return this.assigneeUserId;
    }

    public void setAssigneeUserId(Long assigneeUserId) {
        this.assigneeUserId = assigneeUserId;
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
