package com.shrinfo.ibs.vo.business;

public class CompanyVO extends BaseVO {

    /**
	 * 
	 */
    private static final long serialVersionUID = 8674776028827953900L;

    private String code;

    private String name;

    private AddressVO address;

    private String status;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public AddressVO getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(AddressVO address) {
        this.address = address;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
}
