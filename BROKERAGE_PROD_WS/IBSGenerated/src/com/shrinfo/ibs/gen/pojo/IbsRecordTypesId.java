package com.shrinfo.ibs.gen.pojo;

// Generated Mar 13, 2014 6:53:45 PM by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * IbsRecordTypesId generated by hbm2java
 */
@Embeddable
public class IbsRecordTypesId implements java.io.Serializable {


    private Byte type;

    private String description;

    public IbsRecordTypesId() {}

    public IbsRecordTypesId(Byte type, String description) {
        this.type = type;
        this.description = description;
    }



    @Column(name = "TYPE", precision = 2, scale = 0)
    public Byte getType() {
        return this.type;
    }

    public void setType(Byte type) {
        this.type = type;
    }


    @Column(name = "DESCRIPTION", length = 25)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof IbsRecordTypesId))
            return false;
        IbsRecordTypesId castOther = (IbsRecordTypesId) other;

        return ((this.getType() == castOther.getType()) || (this.getType() != null
            && castOther.getType() != null && this.getType().equals(castOther.getType())))
            && ((this.getDescription() == castOther.getDescription()) || (this.getDescription() != null
                && castOther.getDescription() != null && this.getDescription().equals(
                castOther.getDescription())));
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (getType() == null ? 0 : this.getType().hashCode());
        result = 37 * result + (getDescription() == null ? 0 : this.getDescription().hashCode());
        return result;
    }


}
