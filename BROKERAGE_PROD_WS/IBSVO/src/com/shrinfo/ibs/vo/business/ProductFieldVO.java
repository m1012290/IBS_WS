package com.shrinfo.ibs.vo.business;

public class ProductFieldVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8547918153558242262L;

	private Long id;

	private Long productClass;

	private Long serialNum;

	private String fieldName;

	private String fieldType;

	private Boolean isMandatory;

	private Integer fieldLength;

	private String status;

	private String srcOfData;
	
	private String fieldValue;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the productClass
	 */
	public Long getProductClass() {
		return productClass;
	}

	/**
	 * @param productClass
	 *            the productClass to set
	 */
	public void setProductClass(Long productClass) {
		this.productClass = productClass;
	}

	/**
	 * @return the serialNum
	 */
	public Long getSerialNum() {
		return serialNum;
	}

	/**
	 * @param serialNum
	 *            the serialNum to set
	 */
	public void setSerialNum(Long serialNum) {
		this.serialNum = serialNum;
	}

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

	/**
	 * @param fieldName
	 *            the fieldName to set
	 */
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	/**
	 * @return the fieldType
	 */
	public String getFieldType() {
		return fieldType;
	}

	/**
	 * @param fieldType
	 *            the fieldType to set
	 */
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	/**
	 * @return the isMandatory
	 */
	public Boolean getIsMandatory() {
		return isMandatory;
	}

	/**
	 * @param isMandatory
	 *            the isMandatory to set
	 */
	public void setIsMandatory(Boolean isMandatory) {
		this.isMandatory = isMandatory;
	}

	/**
	 * @return the fieldLength
	 */
	public Integer getFieldLength() {
		return fieldLength;
	}

	/**
	 * @param fieldLength
	 *            the fieldLength to set
	 */
	public void setFieldLength(Integer fieldLength) {
		this.fieldLength = fieldLength;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the srcOfData
	 */
	public String getSrcOfData() {
		return srcOfData;
	}

	/**
	 * @param srcOfData
	 *            the srcOfData to set
	 */
	public void setSrcOfData(String srcOfData) {
		this.srcOfData = srcOfData;
	}

	/**
	 * @return the fieldValue
	 */
	public String getFieldValue() {
		return fieldValue;
	}

	/**
	 * @param fieldValue the fieldValue to set
	 */
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
