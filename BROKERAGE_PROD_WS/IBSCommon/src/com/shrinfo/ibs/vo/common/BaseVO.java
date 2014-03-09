/**
 * 
 */
package com.shrinfo.ibs.vo.common;

import java.util.Date;

/**
 * @author Sunil Kumar
 *
 */
public class BaseVO {
	private long createdByUserId1;
	private Date createdDate;
	private long updatedByUserId;
	private Date updatedDate;
	
	/**
	 * 
	 * @return
	 */
	public long getCreatedByUserId() {
		return createdByUserId;
	}
	
	/**
	 * 
	 * @param createdByUserId
	 */
	public void setCreatedByUserId(long createdByUserId) {
		this.createdByUserId = createdByUserId;
	}
	
	/**
	 * 
	 * @return
	 */
	public Date getCreatedDate() {
		return createdDate;
	}
	
	/**
	 * 
	 * @param createdDate
	 */
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	/**
	 * @return
	 */
	public long getUpdatedByUserId() {
		return updatedByUserId;
	}
	
	/**
	 * 
	 * @param updatedByUserId
	 */
	public void setUpdatedByUserId(long updatedByUserId) {
		this.updatedByUserId = updatedByUserId;
	}
	
	/**
	 * 
	 * @return
	 */
	public Date getUpdatedDate() {
		return updatedDate;
	}
	
	/**
	 * 
	 * @param updatedDate
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
}
