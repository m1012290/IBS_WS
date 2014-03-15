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
 * IbsRolesProductPrivileges generated by hbm2java
 */
@Entity
@Table(name = "IBS_ROLES_PRODUCT_PRIVILEGES", schema = "IBSUSER")
public class IbsRolesProductPrivileges implements java.io.Serializable {


    private BigDecimal id;

    private IbsRoles ibsRoles;

    private IbsProductMaster ibsProductMaster;

    private String roleName;

    private String productName;

    private BigDecimal fromSiLimit;

    private BigDecimal toSiLimit;

    private String emailRequisition;

    private String generateClosingslip;

    private String emailClosingslip;

    private String generateQuoteslip;

    private String emailQuoteslip;

    private String freetext1;

    private String freetext2;

    private String status;

    private String remarks;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    public IbsRolesProductPrivileges() {}


    public IbsRolesProductPrivileges(BigDecimal id) {
        this.id = id;
    }

    public IbsRolesProductPrivileges(BigDecimal id, IbsRoles ibsRoles,
            IbsProductMaster ibsProductMaster, String roleName, String productName,
            BigDecimal fromSiLimit, BigDecimal toSiLimit, String emailRequisition,
            String generateClosingslip, String emailClosingslip, String generateQuoteslip,
            String emailQuoteslip, String freetext1, String freetext2, String status,
            String remarks, BigDecimal recCreUserId, Serializable recCreDate,
            BigDecimal recUpdUserId, Serializable recUpdDate) {
        this.id = id;
        this.ibsRoles = ibsRoles;
        this.ibsProductMaster = ibsProductMaster;
        this.roleName = roleName;
        this.productName = productName;
        this.fromSiLimit = fromSiLimit;
        this.toSiLimit = toSiLimit;
        this.emailRequisition = emailRequisition;
        this.generateClosingslip = generateClosingslip;
        this.emailClosingslip = emailClosingslip;
        this.generateQuoteslip = generateQuoteslip;
        this.emailQuoteslip = emailQuoteslip;
        this.freetext1 = freetext1;
        this.freetext2 = freetext2;
        this.status = status;
        this.remarks = remarks;
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
    @JoinColumn(name = "ROLE_ID")
    public IbsRoles getIbsRoles() {
        return this.ibsRoles;
    }

    public void setIbsRoles(IbsRoles ibsRoles) {
        this.ibsRoles = ibsRoles;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_CLASS")
    public IbsProductMaster getIbsProductMaster() {
        return this.ibsProductMaster;
    }

    public void setIbsProductMaster(IbsProductMaster ibsProductMaster) {
        this.ibsProductMaster = ibsProductMaster;
    }


    @Column(name = "ROLE_NAME", length = 30)
    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    @Column(name = "PRODUCT_NAME", length = 30)
    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Column(name = "FROM_SI_LIMIT", precision = 13, scale = 3)
    public BigDecimal getFromSiLimit() {
        return this.fromSiLimit;
    }

    public void setFromSiLimit(BigDecimal fromSiLimit) {
        this.fromSiLimit = fromSiLimit;
    }


    @Column(name = "TO_SI_LIMIT", precision = 13, scale = 3)
    public BigDecimal getToSiLimit() {
        return this.toSiLimit;
    }

    public void setToSiLimit(BigDecimal toSiLimit) {
        this.toSiLimit = toSiLimit;
    }


    @Column(name = "EMAIL_REQUISITION", length = 1)
    public String getEmailRequisition() {
        return this.emailRequisition;
    }

    public void setEmailRequisition(String emailRequisition) {
        this.emailRequisition = emailRequisition;
    }


    @Column(name = "GENERATE_CLOSINGSLIP", length = 1)
    public String getGenerateClosingslip() {
        return this.generateClosingslip;
    }

    public void setGenerateClosingslip(String generateClosingslip) {
        this.generateClosingslip = generateClosingslip;
    }


    @Column(name = "EMAIL_CLOSINGSLIP", length = 1)
    public String getEmailClosingslip() {
        return this.emailClosingslip;
    }

    public void setEmailClosingslip(String emailClosingslip) {
        this.emailClosingslip = emailClosingslip;
    }


    @Column(name = "GENERATE_QUOTESLIP", length = 1)
    public String getGenerateQuoteslip() {
        return this.generateQuoteslip;
    }

    public void setGenerateQuoteslip(String generateQuoteslip) {
        this.generateQuoteslip = generateQuoteslip;
    }


    @Column(name = "EMAIL_QUOTESLIP", length = 1)
    public String getEmailQuoteslip() {
        return this.emailQuoteslip;
    }

    public void setEmailQuoteslip(String emailQuoteslip) {
        this.emailQuoteslip = emailQuoteslip;
    }


    @Column(name = "FREETEXT1", length = 100)
    public String getFreetext1() {
        return this.freetext1;
    }

    public void setFreetext1(String freetext1) {
        this.freetext1 = freetext1;
    }


    @Column(name = "FREETEXT2", length = 100)
    public String getFreetext2() {
        return this.freetext2;
    }

    public void setFreetext2(String freetext2) {
        this.freetext2 = freetext2;
    }


    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Column(name = "REMARKS", length = 50)
    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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
