package com.shrinfo.ibs.gen.pojo;

// Generated Mar 13, 2014 6:53:45 PM by Hibernate Tools 3.4.0.CR1


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
 * IbsProductUwFields generated by hbm2java
 */
@Entity
@Table(name = "IBS_PRODUCT_UW_FIELDS", schema = "IBSUSER")
public class IbsProductUwFields implements java.io.Serializable {


    private BigDecimal id;

    private IbsProductMaster ibsProductMaster;

    private BigDecimal srlNo;

    private String fieldName;

    private String fieldType;

    private String isMandatory;

    private BigDecimal fieldLength;

    private String status;

    private String sourceOfData;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    private Set<IbsUwTransaction> ibsUwTransactions = new HashSet<IbsUwTransaction>(0);

    private Set<IbsQuoteSlipDetail> ibsQuoteSlipDetails = new HashSet<IbsQuoteSlipDetail>(0);

    private Set<IbsQuoteComparisionDetail> ibsQuoteComparisionDetails =
        new HashSet<IbsQuoteComparisionDetail>(0);

    public IbsProductUwFields() {}


    public IbsProductUwFields(BigDecimal id) {
        this.id = id;
    }

    public IbsProductUwFields(BigDecimal id, IbsProductMaster ibsProductMaster, BigDecimal srlNo,
            String fieldName, String fieldType, String isMandatory, BigDecimal fieldLength,
            String status, String sourceOfData, BigDecimal recCreUserId, Serializable recCreDate,
            BigDecimal recUpdUserId, Serializable recUpdDate,
            Set<IbsUwTransaction> ibsUwTransactions, Set<IbsQuoteSlipDetail> ibsQuoteSlipDetails,
            Set<IbsQuoteComparisionDetail> ibsQuoteComparisionDetails) {
        this.id = id;
        this.ibsProductMaster = ibsProductMaster;
        this.srlNo = srlNo;
        this.fieldName = fieldName;
        this.fieldType = fieldType;
        this.isMandatory = isMandatory;
        this.fieldLength = fieldLength;
        this.status = status;
        this.sourceOfData = sourceOfData;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
        this.ibsUwTransactions = ibsUwTransactions;
        this.ibsQuoteSlipDetails = ibsQuoteSlipDetails;
        this.ibsQuoteComparisionDetails = ibsQuoteComparisionDetails;
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
    @JoinColumn(name = "PRODUCT_CLASS")
    public IbsProductMaster getIbsProductMaster() {
        return this.ibsProductMaster;
    }

    public void setIbsProductMaster(IbsProductMaster ibsProductMaster) {
        this.ibsProductMaster = ibsProductMaster;
    }


    @Column(name = "SRL_NO", precision = 22, scale = 0)
    public BigDecimal getSrlNo() {
        return this.srlNo;
    }

    public void setSrlNo(BigDecimal srlNo) {
        this.srlNo = srlNo;
    }


    @Column(name = "FIELD_NAME", length = 30)
    public String getFieldName() {
        return this.fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }


    @Column(name = "FIELD_TYPE", length = 30)
    public String getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }


    @Column(name = "IS_MANDATORY", length = 1)
    public String getIsMandatory() {
        return this.isMandatory;
    }

    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory;
    }


    @Column(name = "FIELD_LENGTH", precision = 22, scale = 0)
    public BigDecimal getFieldLength() {
        return this.fieldLength;
    }

    public void setFieldLength(BigDecimal fieldLength) {
        this.fieldLength = fieldLength;
    }


    @Column(name = "STATUS", length = 1)
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Column(name = "SOURCE_OF_DATA", length = 25)
    public String getSourceOfData() {
        return this.sourceOfData;
    }

    public void setSourceOfData(String sourceOfData) {
        this.sourceOfData = sourceOfData;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsProductUwFields")
    public Set<IbsUwTransaction> getIbsUwTransactions() {
        return this.ibsUwTransactions;
    }

    public void setIbsUwTransactions(Set<IbsUwTransaction> ibsUwTransactions) {
        this.ibsUwTransactions = ibsUwTransactions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsProductUwFields")
    public Set<IbsQuoteSlipDetail> getIbsQuoteSlipDetails() {
        return this.ibsQuoteSlipDetails;
    }

    public void setIbsQuoteSlipDetails(Set<IbsQuoteSlipDetail> ibsQuoteSlipDetails) {
        this.ibsQuoteSlipDetails = ibsQuoteSlipDetails;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ibsProductUwFields")
    public Set<IbsQuoteComparisionDetail> getIbsQuoteComparisionDetails() {
        return this.ibsQuoteComparisionDetails;
    }

    public void setIbsQuoteComparisionDetails(
            Set<IbsQuoteComparisionDetail> ibsQuoteComparisionDetails) {
        this.ibsQuoteComparisionDetails = ibsQuoteComparisionDetails;
    }




}
