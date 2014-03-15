package com.shrinfo.ibs.gen.pojo;

// Generated Mar 15, 2014 6:17:35 AM by Hibernate Tools 3.4.0.CR1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * IbsUwTransaction generated by hbm2java
 */
@Entity
@Table(name = "IBS_UW_TRANSACTION", schema = "IBSUSER")
public class IbsUwTransaction implements java.io.Serializable {


    private IbsUwTransactionId id;

    private IbsProductUwFields ibsProductUwFields;

    private IbsStatusMaster ibsStatusMaster;

    private IbsQuoteSlipHeader ibsQuoteSlipHeader;

    private IbsProductMaster ibsProductMaster;

    public IbsUwTransaction() {}


    public IbsUwTransaction(IbsUwTransactionId id) {
        this.id = id;
    }

    public IbsUwTransaction(IbsUwTransactionId id, IbsProductUwFields ibsProductUwFields,
            IbsStatusMaster ibsStatusMaster, IbsQuoteSlipHeader ibsQuoteSlipHeader,
            IbsProductMaster ibsProductMaster) {
        this.id = id;
        this.ibsProductUwFields = ibsProductUwFields;
        this.ibsStatusMaster = ibsStatusMaster;
        this.ibsQuoteSlipHeader = ibsQuoteSlipHeader;
        this.ibsProductMaster = ibsProductMaster;
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "quoteSlipId", column = @Column(name = "QUOTE_SLIP_ID", precision = 20, scale = 0)),
            @AttributeOverride(name = "enquiryNo", column = @Column(name = "ENQUIRY_NO", precision = 20, scale = 0)),
            @AttributeOverride(name = "quoteSlipVersion", column = @Column(name = "QUOTE_SLIP_VERSION", precision = 3, scale = 0)),
            @AttributeOverride(name = "quoteSlipDate", column = @Column(name = "QUOTE_SLIP_DATE")),
            @AttributeOverride(name = "enquiryCompanyCode", column = @Column(name = "ENQUIRY_COMPANY_CODE", length = 10)),
            @AttributeOverride(name = "productClass", column = @Column(name = "PRODUCT_CLASS", precision = 10, scale = 0)),
            @AttributeOverride(name = "productUwFieldId", column = @Column(name = "PRODUCT_UW_FIELD_ID", precision = 3, scale = 0)),
            @AttributeOverride(name = "productUwFieldAnswer", column = @Column(name = "PRODUCT_UW_FIELD_ANSWER", length = 200)),
            @AttributeOverride(name = "contractPeriodFrom", column = @Column(name = "CONTRACT_PERIOD_FROM")),
            @AttributeOverride(name = "contractPeriodTo", column = @Column(name = "CONTRACT_PERIOD_TO")),
            @AttributeOverride(name = "type", column = @Column(name = "TYPE", length = 15)),
            @AttributeOverride(name = "policyNo", column = @Column(name = "POLICY_NO", length = 50)),
            @AttributeOverride(name = "statusCode", column = @Column(name = "STATUS_CODE", precision = 2, scale = 0)),
            @AttributeOverride(name = "recCreUserId", column = @Column(name = "REC_CRE_USER_ID", precision = 22, scale = 0)),
            @AttributeOverride(name = "recCreDate", column = @Column(name = "REC_CRE_DATE")),
            @AttributeOverride(name = "recUpdUserId", column = @Column(name = "REC_UPD_USER_ID", precision = 22, scale = 0)),
            @AttributeOverride(name = "recUpdDate", column = @Column(name = "REC_UPD_DATE")) })
    public IbsUwTransactionId getId() {
        return this.id;
    }

    public void setId(IbsUwTransactionId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_UW_FIELD_ID", insertable = false, updatable = false)
    public IbsProductUwFields getIbsProductUwFields() {
        return this.ibsProductUwFields;
    }

    public void setIbsProductUwFields(IbsProductUwFields ibsProductUwFields) {
        this.ibsProductUwFields = ibsProductUwFields;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_CODE", insertable = false, updatable = false)
    public IbsStatusMaster getIbsStatusMaster() {
        return this.ibsStatusMaster;
    }

    public void setIbsStatusMaster(IbsStatusMaster ibsStatusMaster) {
        this.ibsStatusMaster = ibsStatusMaster;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "QUOTE_SLIP_ID", referencedColumnName = "ID", insertable = false, updatable = false),
            @JoinColumn(name = "QUOTE_SLIP_VERSION", referencedColumnName = "QUOTE_SLIP_VERSION", insertable = false, updatable = false) })
    public IbsQuoteSlipHeader getIbsQuoteSlipHeader() {
        return this.ibsQuoteSlipHeader;
    }

    public void setIbsQuoteSlipHeader(IbsQuoteSlipHeader ibsQuoteSlipHeader) {
        this.ibsQuoteSlipHeader = ibsQuoteSlipHeader;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_CLASS", insertable = false, updatable = false)
    public IbsProductMaster getIbsProductMaster() {
        return this.ibsProductMaster;
    }

    public void setIbsProductMaster(IbsProductMaster ibsProductMaster) {
        this.ibsProductMaster = ibsProductMaster;
    }




}
