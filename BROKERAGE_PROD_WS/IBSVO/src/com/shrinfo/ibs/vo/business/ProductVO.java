package com.shrinfo.ibs.vo.business;

import java.util.List;

import com.shrinfo.ibs.cmn.vo.BaseVO;

/**
 * @author Sunil Kumar This class represents product details for a particular product class. This
 *         class includes details such as product name, product class, Underwriting fields
 *         applicable etc..
 */
public class ProductVO extends BaseVO {

    private static final long serialVersionUID = -1081127236877284077L;

    private String name;

    private int productClass;

    private String shortName;

    private int subClass;

    // Categorization like Retail / corporate product
    private String category;

    private List<ProductUWFieldVO> uwFieldsList;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getProductClass() {
        return productClass;
    }


    public void setProductClass(int productClass) {
        this.productClass = productClass;
    }


    public String getShortName() {
        return shortName;
    }


    public void setShortName(String shortName) {
        this.shortName = shortName;
    }


    public int getSubClass() {
        return subClass;
    }


    public void setSubClass(int subClass) {
        this.subClass = subClass;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public List<ProductUWFieldVO> getUwFieldsList() {
        return uwFieldsList;
    }


    public void setUwFieldsList(List<ProductUWFieldVO> uwFieldsList) {
        this.uwFieldsList = uwFieldsList;
    }

}