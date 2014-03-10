package com.shrinfo.ibs.vo.business;

public class AddressVO extends BaseVO {

    /**
	 * 
	 */
    private static final long serialVersionUID = 2132316498974290653L;

    private String city;

    private String country;

    private String lattitude;

    private String longitude;

    private String status;

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the lattitude
     */
    public String getLattitude() {
        return lattitude;
    }

    /**
     * @param lattitude the lattitude to set
     */
    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    /**
     * @return the longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
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
