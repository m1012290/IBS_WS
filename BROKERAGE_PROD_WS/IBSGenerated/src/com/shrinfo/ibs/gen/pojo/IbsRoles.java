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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * IbsRoles generated by hbm2java
 */
@Entity
@Table(name = "IBS_ROLES", schema = "IBSUSER", uniqueConstraints = @UniqueConstraint(columnNames = "NAME"))
public class IbsRoles implements java.io.Serializable {


    private BigDecimal id;

    private String name;

    private String description;

    private String status;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    private Set<IbsRolesProductPrivileges> ibsRolesProductPrivilegeses =
        new HashSet<IbsRolesProductPrivileges>(0);

    public IbsRoles() {}


    public IbsRoles(BigDecimal id, String name) {
        this.id = id;
        this.name = name;
    }

    public IbsRoles(BigDecimal id, String name, String description, String status,
            BigDecimal recCreUserId, Serializable recCreDate, BigDecimal recUpdUserId,
            Serializable recUpdDate, Set<IbsRolesProductPrivileges> ibsRolesProductPrivilegeses) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.status = status;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
        this.ibsRolesProductPrivilegeses = ibsRolesProductPrivilegeses;
    }

    @Id
    @Column(name = "ID", unique = true, nullable = false, precision = 22, scale = 0)
    public BigDecimal getId() {
        return this.id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }


    @Column(name = "NAME", unique = true, nullable = false, length = 30)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "DESCRIPTION", length = 100)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsRoles")
    public Set<IbsRolesProductPrivileges> getIbsRolesProductPrivilegeses() {
        return this.ibsRolesProductPrivilegeses;
    }

    public void setIbsRolesProductPrivilegeses(
            Set<IbsRolesProductPrivileges> ibsRolesProductPrivilegeses) {
        this.ibsRolesProductPrivilegeses = ibsRolesProductPrivilegeses;
    }




}
