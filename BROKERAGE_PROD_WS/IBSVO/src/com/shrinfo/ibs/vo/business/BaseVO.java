package com.shrinfo.ibs.vo.business;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseVO implements Serializable {

    private static final long serialVersionUID = -8650336303052382802L;

    private Date createdOn;

    private Date updatedOn;

    private UserVO createdBy;

    private UserVO updatedBy;

    /**
     * @return the createdOn
     */
    public Date getCreatedOn() {
        return createdOn;
    }

    /**
     * @param createdOn the createdOn to set
     */
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * @return the updatedOn
     */
    public Date getUpdatedOn() {
        return updatedOn;
    }

    /**
     * @param updatedOn the updatedOn to set
     */
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    /**
     * @return the createdBy
     */
    public UserVO getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy the createdBy to set
     */
    public void setCreatedBy(UserVO createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return the updatedBy
     */
    public UserVO getUpdatedBy() {
        return updatedBy;
    }

    /**
     * @param updatedBy the updatedBy to set
     */
    public void setUpdatedBy(UserVO updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
