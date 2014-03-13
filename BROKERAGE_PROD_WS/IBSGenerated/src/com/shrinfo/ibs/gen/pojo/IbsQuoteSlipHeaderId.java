package com.shrinfo.ibs.gen.pojo;

// Generated Mar 13, 2014 6:53:45 PM by Hibernate Tools 3.4.0.CR1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IbsQuoteSlipHeaderId generated by hbm2java
 */
@Embeddable
public class IbsQuoteSlipHeaderId implements java.io.Serializable {


    private BigDecimal id;

    private BigDecimal quoteSlipVersion;

    public IbsQuoteSlipHeaderId() {}

    public IbsQuoteSlipHeaderId(BigDecimal id, BigDecimal quoteSlipVersion) {
        this.id = id;
        this.quoteSlipVersion = quoteSlipVersion;
    }



    @Column(name = "ID", nullable = false, precision = 22, scale = 0)
    public BigDecimal getId() {
        return this.id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }


    @Column(name = "QUOTE_SLIP_VERSION", nullable = false, precision = 22, scale = 0)
    public BigDecimal getQuoteSlipVersion() {
        return this.quoteSlipVersion;
    }

    public void setQuoteSlipVersion(BigDecimal quoteSlipVersion) {
        this.quoteSlipVersion = quoteSlipVersion;
    }


    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof IbsQuoteSlipHeaderId))
            return false;
        IbsQuoteSlipHeaderId castOther = (IbsQuoteSlipHeaderId) other;

        return ((this.getId() == castOther.getId()) || (this.getId() != null
            && castOther.getId() != null && this.getId().equals(castOther.getId())))
            && ((this.getQuoteSlipVersion() == castOther.getQuoteSlipVersion()) || (this
                    .getQuoteSlipVersion() != null && castOther.getQuoteSlipVersion() != null && this
                    .getQuoteSlipVersion().equals(castOther.getQuoteSlipVersion())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
        result =
            37 * result
                + (getQuoteSlipVersion() == null ? 0 : this.getQuoteSlipVersion().hashCode());
        return result;
    }


}
