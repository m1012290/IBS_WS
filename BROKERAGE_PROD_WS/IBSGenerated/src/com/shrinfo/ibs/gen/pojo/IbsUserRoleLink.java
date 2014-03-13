package com.shrinfo.ibs.gen.pojo;

// Generated Mar 13, 2014 1:39:55 PM by Hibernate Tools 3.4.0.CR1


import java.io.Serializable;
import java.math.BigDecimal;

/**
 * IbsUserRoleLink generated by hbm2java
 */
public class IbsUserRoleLink implements java.io.Serializable {


    private BigDecimal id;

    private BigDecimal userId;

    private BigDecimal roleId;

    private String status;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    public IbsUserRoleLink() {}


    public IbsUserRoleLink(BigDecimal id) {
        this.id = id;
    }

    public IbsUserRoleLink(BigDecimal id, BigDecimal userId, BigDecimal roleId, String status,
            BigDecimal recCreUserId, Serializable recCreDate, BigDecimal recUpdUserId,
            Serializable recUpdDate) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
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

    public BigDecimal getUserId() {
        return this.userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getRoleId() {
        return this.roleId;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
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
