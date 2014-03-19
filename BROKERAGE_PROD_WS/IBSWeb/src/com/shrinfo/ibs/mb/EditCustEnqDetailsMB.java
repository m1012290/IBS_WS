package com.shrinfo.ibs.mb;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

import com.shrinfo.ibs.vo.business.SearchItemVO;

@ManagedBean(name="editCustEnqDetailsMB")
@SessionScoped
public class EditCustEnqDetailsMB implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6311980649197374413L;
	private String custName;
	private String custGroup;
	private String firstName;
	private String middleName;
	private String lastName;
	private String primaryEmailID;
	private String primaryMobNum;
	private String primaryLandLineNum;
	private String faxNum;
	private String city;
	private String country;
	private String address;
	private String poBox;
	private String locLattitude;
	private String locLongitude;
	private String altEmailID1;
	private String altMobNum1;
	private String altLandLineNum1;
	private String altEmailID2;
	private String altMobNum2;
	private String altLandLineNum2;
	private String sourceOfBusiness;
	private String salesExecutive;
	
	private String title;
	private String custCategory;
	private String custClassification;
	private String salutation;
	
	private Map<String,String> titles = new HashMap<String, String>(); 
	private Map<String,String> custCategories = new HashMap<String, String>(); 
	private Map<String,String> custClassifications = new HashMap<String, String>(); 
	private Map<String,String> salutations=new HashMap<String, String>();

	private long enquiryNum;
	private String enquiryType;
	private Map<String,String>  enquiryTypes= new HashMap<String, String>(); 
	private String enquiryDesc;
	private String recCreatedUserID;
	private Timestamp recCreatedDate;
	private String recUpdatedUserID;
	private Timestamp recUpdatedDate;
	
	private long quotationNum;
	private String policyNum;
	private long quoteVersion;
	private long endorsementNum;
	
	public EditCustEnqDetailsMB() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustGroup() {
		return custGroup;
	}

	public void setCustGroup(String custGroup) {
		this.custGroup = custGroup;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrimaryEmailID() {
		return primaryEmailID;
	}

	public void setPrimaryEmailID(String primaryEmailID) {
		this.primaryEmailID = primaryEmailID;
	}

	public String getPrimaryMobNum() {
		return primaryMobNum;
	}

	public void setPrimaryMobNum(String primaryMobNum) {
		this.primaryMobNum = primaryMobNum;
	}

	public String getPrimaryLandLineNum() {
		return primaryLandLineNum;
	}

	public void setPrimaryLandLineNum(String primaryLandLineNum) {
		this.primaryLandLineNum = primaryLandLineNum;
	}

	public String getFaxNum() {
		return faxNum;
	}

	public void setFaxNum(String faxNum) {
		this.faxNum = faxNum;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getLocLattitude() {
		return locLattitude;
	}

	public void setLocLattitude(String locLattitude) {
		this.locLattitude = locLattitude;
	}

	public String getLocLongitude() {
		return locLongitude;
	}

	public void setLocLongitude(String locLongitude) {
		this.locLongitude = locLongitude;
	}

	public String getAltEmailID1() {
		return altEmailID1;
	}

	public void setAltEmailID1(String altEmailID1) {
		this.altEmailID1 = altEmailID1;
	}

	public String getAltMobNum1() {
		return altMobNum1;
	}

	public void setAltMobNum1(String altMobNum1) {
		this.altMobNum1 = altMobNum1;
	}

	public String getAltLandLineNum1() {
		return altLandLineNum1;
	}

	public void setAltLandLineNum1(String altLandLineNum1) {
		this.altLandLineNum1 = altLandLineNum1;
	}

	public String getAltEmailID2() {
		return altEmailID2;
	}

	public void setAltEmailID2(String altEmailID2) {
		this.altEmailID2 = altEmailID2;
	}

	public String getAltMobNum2() {
		return altMobNum2;
	}

	public void setAltMobNum2(String altMobNum2) {
		this.altMobNum2 = altMobNum2;
	}

	public String getAltLandLineNum2() {
		return altLandLineNum2;
	}

	public void setAltLandLineNum2(String altLandLineNum2) {
		this.altLandLineNum2 = altLandLineNum2;
	}

	public String getSourceOfBusiness() {
		return sourceOfBusiness;
	}

	public void setSourceOfBusiness(String sourceOfBusiness) {
		this.sourceOfBusiness = sourceOfBusiness;
	}

	public String getSalesExecutive() {
		return salesExecutive;
	}

	public void setSalesExecutive(String salesExecutive) {
		this.salesExecutive = salesExecutive;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCustCategory() {
		return custCategory;
	}

	public void setCustCategory(String custCategory) {
		this.custCategory = custCategory;
	}

	public String getCustClassification() {
		return custClassification;
	}

	public void setCustClassification(String custClassification) {
		this.custClassification = custClassification;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public Map<String, String> getTitles() {
		return titles;
	}

	public void setTitles(Map<String, String> titles) {
		this.titles = titles;
	}

	public Map<String, String> getCustCategories() {
		return custCategories;
	}

	public void setCustCategories(Map<String, String> custCategories) {
		this.custCategories = custCategories;
	}

	public Map<String, String> getCustClassifications() {
		return custClassifications;
	}

	public void setCustClassifications(Map<String, String> custClassifications) {
		this.custClassifications = custClassifications;
	}

	public Map<String, String> getSalutations() {
		return salutations;
	}

	public void setSalutations(Map<String, String> salutations) {
		this.salutations = salutations;
	}

	public long getEnquiryNum() {
		return enquiryNum;
	}

	public void setEnquiryNum(long enquiryNum) {
		this.enquiryNum = enquiryNum;
	}

	public String getEnquiryType() {
		return enquiryType;
	}

	public void setEnquiryType(String enquiryType) {
		this.enquiryType = enquiryType;
	}

	public Map<String, String> getEnquiryTypes() {
		return enquiryTypes;
	}

	public void setEnquiryTypes(Map<String, String> enquiryTypes) {
		this.enquiryTypes = enquiryTypes;
	}

	public String getEnquiryDesc() {
		return enquiryDesc;
	}

	public void setEnquiryDesc(String enquiryDesc) {
		this.enquiryDesc = enquiryDesc;
	}

	public String getRecCreatedUserID() {
		return recCreatedUserID;
	}

	public void setRecCreatedUserID(String recCreatedUserID) {
		this.recCreatedUserID = recCreatedUserID;
	}

	public Timestamp getRecCreatedDate() {
		return recCreatedDate;
	}

	public void setRecCreatedDate(Timestamp recCreatedDate) {
		this.recCreatedDate = recCreatedDate;
	}

	public String getRecUpdatedUserID() {
		return recUpdatedUserID;
	}

	public void setRecUpdatedUserID(String recUpdatedUserID) {
		this.recUpdatedUserID = recUpdatedUserID;
	}

	public Timestamp getRecUpdatedDate() {
		return recUpdatedDate;
	}

	public void setRecUpdatedDate(Timestamp recUpdatedDate) {
		this.recUpdatedDate = recUpdatedDate;
	}

	public long getQuotationNum() {
		return quotationNum;
	}

	public void setQuotationNum(long quotationNum) {
		this.quotationNum = quotationNum;
	}

	public String getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}

	public long getQuoteVersion() {
		return quoteVersion;
	}

	public void setQuoteVersion(long quoteVersion) {
		this.quoteVersion = quoteVersion;
	}

	public long getEndorsementNum() {
		return endorsementNum;
	}

	public void setEndorsementNum(long endorsementNum) {
		this.endorsementNum = endorsementNum;
	}
	
	public void onRowSelect(SelectEvent event) { 
		
		try {
		
			SearchItemVO searchItmVO=(SearchItemVO) event.getObject();
			this.custName=searchItmVO.getCustomerName();
	        this.primaryMobNum=searchItmVO.getCustomerMob();
	        this.primaryEmailID=searchItmVO.getCustomerEmail();
	        //this.insuredName=searchItmVO.getInsuredName();
	        this.enquiryNum=searchItmVO.getEnquiryNum();
	        this.quotationNum=searchItmVO.getQuotationNum();
	        this.policyNum=searchItmVO.getPolicyNum();
        
	        FacesContext.getCurrentInstance().getExternalContext().redirect("/IBSWeb/faces/pages/editenquiry.xhtml");
		  

		} catch (IOException e) {
			
			e.printStackTrace();
		}  
        
    }
	
	//later remove it below
	public String submit(){
		
		System.out.println("submit() in EditEnquirySearchBean");
		
		return "quoteSlip";
	}
	public String save(){
		
		
				//FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("hi"));
				
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Customer Details", "Saved Successfully")); 
		
		System.out.println("save() in EditEnquirySearchBean");
		
		return "editenquiry";
		
	}
}
