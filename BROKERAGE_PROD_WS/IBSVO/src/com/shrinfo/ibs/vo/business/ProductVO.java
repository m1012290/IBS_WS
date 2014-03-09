package com.shrinfo.ibs.vo.business;

import java.util.List;

public class ProductVO extends BaseVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1081127236877284077L;

	private String name;

	private Long productClass;

	private String shortName;

	// Categorization like Retail / corporate product
	private String category;

	private String status;

	private List<ProductFieldVO> productFieldVO;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the shortName
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * @param shortName
	 *            the shortName to set
	 */
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
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
	 * @return the productFieldVO
	 */
	public List<ProductFieldVO> getProductFieldVO() {
		return productFieldVO;
	}

	/**
	 * @param productFieldVO
	 *            the productFieldVO to set
	 */
	public void setProductFieldVO(List<ProductFieldVO> productFieldVO) {
		this.productFieldVO = productFieldVO;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
