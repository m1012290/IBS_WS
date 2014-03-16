package com.shrinfo.ibs.gen.pojo;

// Generated Mar 17, 2014 1:52:55 AM by Hibernate Tools 3.4.0.CR1



/**
 * IbsUwTransaction generated by hbm2java
 */
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

    public IbsUwTransactionId getId() {
        return this.id;
    }

    public void setId(IbsUwTransactionId id) {
        this.id = id;
    }

    public IbsProductUwFields getIbsProductUwFields() {
        return this.ibsProductUwFields;
    }

    public void setIbsProductUwFields(IbsProductUwFields ibsProductUwFields) {
        this.ibsProductUwFields = ibsProductUwFields;
    }

    public IbsStatusMaster getIbsStatusMaster() {
        return this.ibsStatusMaster;
    }

    public void setIbsStatusMaster(IbsStatusMaster ibsStatusMaster) {
        this.ibsStatusMaster = ibsStatusMaster;
    }

    public IbsQuoteSlipHeader getIbsQuoteSlipHeader() {
        return this.ibsQuoteSlipHeader;
    }

    public void setIbsQuoteSlipHeader(IbsQuoteSlipHeader ibsQuoteSlipHeader) {
        this.ibsQuoteSlipHeader = ibsQuoteSlipHeader;
    }

    public IbsProductMaster getIbsProductMaster() {
        return this.ibsProductMaster;
    }

    public void setIbsProductMaster(IbsProductMaster ibsProductMaster) {
        this.ibsProductMaster = ibsProductMaster;
    }




}
