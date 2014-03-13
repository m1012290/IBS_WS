package com.shrinfo.ibs.gen.pojo;

// Generated Mar 13, 2014 6:53:45 PM by Hibernate Tools 3.4.0.CR1


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
 * IbsCustomerEnquiry generated by hbm2java
 */
@Entity
@Table(name = "IBS_CUSTOMER_ENQUIRY", schema = "IBSUSER")
public class IbsCustomerEnquiry implements java.io.Serializable {


    private BigDecimal enquiryNo;

    private IbsCustomer ibsCustomer;

    private IbsProductMaster ibsProductMaster;

    private String type;

    private Serializable receivedDate;

    private String rcvdFrom;

    private String rcvdEmailid;

    private String rcvdContactno;

    private String enquiryDescription;

    private String enquirySubjectmatterExpert;

    private BigDecimal recCreUserId;

    private Serializable recCreDate;

    private BigDecimal recUpdUserId;

    private Serializable recUpdDate;

    public IbsCustomerEnquiry() {}


    public IbsCustomerEnquiry(BigDecimal enquiryNo) {
        this.enquiryNo = enquiryNo;
    }

    public IbsCustomerEnquiry(BigDecimal enquiryNo, IbsCustomer ibsCustomer,
            IbsProductMaster ibsProductMaster, String type, Serializable receivedDate,
            String rcvdFrom, String rcvdEmailid, String rcvdContactno, String enquiryDescription,
            String enquirySubjectmatterExpert, BigDecimal recCreUserId, Serializable recCreDate,
            BigDecimal recUpdUserId, Serializable recUpdDate) {
        this.enquiryNo = enquiryNo;
        this.ibsCustomer = ibsCustomer;
        this.ibsProductMaster = ibsProductMaster;
        this.type = type;
        this.receivedDate = receivedDate;
        this.rcvdFrom = rcvdFrom;
        this.rcvdEmailid = rcvdEmailid;
        this.rcvdContactno = rcvdContactno;
        this.enquiryDescription = enquiryDescription;
        this.enquirySubjectmatterExpert = enquirySubjectmatterExpert;
        this.recCreUserId = recCreUserId;
        this.recCreDate = recCreDate;
        this.recUpdUserId = recUpdUserId;
        this.recUpdDate = recUpdDate;
    }

    @Id
    @Column(name = "ENQUIRY_NO", unique = true, nullable = false, precision = 22, scale = 0)
    public BigDecimal getEnquiryNo() {
        return this.enquiryNo;
    }

    public void setEnquiryNo(BigDecimal enquiryNo) {
        this.enquiryNo = enquiryNo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    public IbsCustomer getIbsCustomer() {
        return this.ibsCustomer;
    }

    public void setIbsCustomer(IbsCustomer ibsCustomer) {
        this.ibsCustomer = ibsCustomer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_CLASS")
    public IbsProductMaster getIbsProductMaster() {
        return this.ibsProductMaster;
    }

    public void setIbsProductMaster(IbsProductMaster ibsProductMaster) {
        this.ibsProductMaster = ibsProductMaster;
    }


    @Column(name = "TYPE", length = 15)
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Column(name = "RECEIVED_DATE")
    public Serializable getReceivedDate() {
        return this.receivedDate;
    }

    public void setReceivedDate(Serializable receivedDate) {
        this.receivedDate = receivedDate;
    }


    @Column(name = "RCVD_FROM", length = 50)
    public String getRcvdFrom() {
        return this.rcvdFrom;
    }

    public void setRcvdFrom(String rcvdFrom) {
        this.rcvdFrom = rcvdFrom;
    }


    @Column(name = "RCVD_EMAILID", length = 50)
    public String getRcvdEmailid() {
        return this.rcvdEmailid;
    }

    public void setRcvdEmailid(String rcvdEmailid) {
        this.rcvdEmailid = rcvdEmailid;
    }


    @Column(name = "RCVD_CONTACTNO", length = 50)
    public String getRcvdContactno() {
        return this.rcvdContactno;
    }

    public void setRcvdContactno(String rcvdContactno) {
        this.rcvdContactno = rcvdContactno;
    }


    @Column(name = "ENQUIRY_DESCRIPTION", length = 500)
    public String getEnquiryDescription() {
        return this.enquiryDescription;
    }

    public void setEnquiryDescription(String enquiryDescription) {
        this.enquiryDescription = enquiryDescription;
    }


    @Column(name = "ENQUIRY_SUBJECTMATTER_EXPERT", length = 50)
    public String getEnquirySubjectmatterExpert() {
        return this.enquirySubjectmatterExpert;
    }

    public void setEnquirySubjectmatterExpert(String enquirySubjectmatterExpert) {
        this.enquirySubjectmatterExpert = enquirySubjectmatterExpert;
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
