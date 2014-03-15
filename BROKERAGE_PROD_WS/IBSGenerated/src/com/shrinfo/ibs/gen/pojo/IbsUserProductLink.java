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
 * IbsUserProductLink generated by hbm2java
 */
@Entity
@Table(name = "IBS_USER_PRODUCT_LINK", schema = "IBSUSER")
public class IbsUserProductLink implements java.io.Serializable {


    private BigDecimal id;

    private IbsUser ibsUser;

    private IbsProductMaster ibsProductMaster;

    private String status;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    public IbsUserProductLink() {}


    public IbsUserProductLink(BigDecimal id) {
        this.id = id;
    }

    public IbsUserProductLink(BigDecimal id, IbsUser ibsUser, IbsProductMaster ibsProductMaster,
            String status, BigDecimal recCreUserId, Serializable recCreDate,
            BigDecimal recUpdUserId, Serializable recUpdDate) {
        this.id = id;
        this.ibsUser = ibsUser;
        this.ibsProductMaster = ibsProductMaster;
        this.status = status;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
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
    @JoinColumn(name = "USER_ID")
    public IbsUser getIbsUser() {
        return this.ibsUser;
    }

    public void setIbsUser(IbsUser ibsUser) {
        this.ibsUser = ibsUser;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_CLASS")
    public IbsProductMaster getIbsProductMaster() {
        return this.ibsProductMaster;
    }

    public void setIbsProductMaster(IbsProductMaster ibsProductMaster) {
        this.ibsProductMaster = ibsProductMaster;
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
