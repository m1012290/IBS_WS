package com.shrinfo.ibs.mb;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.search.svc.SearchService;
import com.shrinfo.ibs.vo.business.SearchItemVO;
import com.shrinfo.ibs.vo.business.SearchVO;

@ManagedBean(name="enquirySearchBean")
@SessionScoped
public class EnquirySearchBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2909580737203256643L;
	
	private String custName;
	private String mobNumber;
	private String emailID;
	private String insuredName;
	private long enquiryNumber;
	private long quoteSlipNumber;
	private String policyNumber;
    private List<SearchItemVO> searchList; 
    private SearchItemVO searchItem; 
    private SearchItemVODataModel searchItemVODataModel;  

	
	public EnquirySearchBean(){
		System.out.println("EnquirySearchBean is initiated");
		
	}
	
	
	public EnquirySearchBean(String custName, String mobNumber, String emailID,
			String insuredName, long enquiryNumber, long quoteSlipNumber,
			String policyNumber) {
		super();
		this.custName = custName;
		this.mobNumber = mobNumber;
		this.emailID = emailID;
		this.insuredName = insuredName;
		this.enquiryNumber = enquiryNumber;
		this.quoteSlipNumber = quoteSlipNumber;
		this.policyNumber = policyNumber;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getMobNumber() {
		return mobNumber;
	}


	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}


	public String getEmailID() {
		return emailID;
	}


	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}


	public String getInsuredName() {
		return insuredName;
	}


	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}


	public long getEnquiryNumber() {
		return enquiryNumber;
	}


	public void setEnquiryNumber(long enquiryNumber) {
		this.enquiryNumber = enquiryNumber;
	}


	public long getQuoteSlipNumber() {
		return quoteSlipNumber;
	}


	public void setQuoteSlipNumber(long quoteSlipNumber) {
		this.quoteSlipNumber = quoteSlipNumber;
	}


	public String getPolicyNumber() {
		return policyNumber;
	}


	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	


	public List<SearchItemVO> getSearchList() {
		return searchList;
	}


	public void setSearchList(List<SearchItemVO> searchList) {
		this.searchList = searchList;
	}
    
    public SearchItemVO getSearchItem() {
		return searchItem;
	}


	public void setSearchItem(SearchItemVO searchItem) {
		this.searchItem = searchItem;
	}
	
	
	public SearchItemVODataModel getSearchItemVODataModel() {
		return searchItemVODataModel;
	}


	public void setSearchItemVODataModel(SearchItemVODataModel searchItemVODataModel) {
		this.searchItemVODataModel = searchItemVODataModel;
	}


	public String submit(){
		
		 System.out.println("custName="+custName+"mobNumber="+mobNumber+"emailID="+emailID+"insuredName="+insuredName+"enquiryNumber="+enquiryNumber+"quoteSlipNumber="+quoteSlipNumber+"policyNumber="+policyNumber);
		 
		 SearchItemVO item=new SearchItemVO();
		 item.setCustomerName(this.custName);
		 item.setCustomerMob(this.mobNumber);
		 item.setCustomerEmail(this.emailID);
		 item.setInsuredName(this.insuredName);
		 item.setEnquiryNum(this.enquiryNumber);
		 item.setQuotationNum(this.quoteSlipNumber);
		 item.setPolicyNum(this.policyNumber);
		 
		 SearchService searchService = (SearchService) Utils.getBean("customerInsuredSearchSvcBean");
		 searchList = ((SearchVO)searchService.getSearchResult(item)).getSearchItems();
		 searchItemVODataModel=new SearchItemVODataModel(searchList);
		 
		 return null;
		 
		 
	 }
	
	public String newEnquiry(){
	
		// reset the values
		FacesContext fc = FacesContext.getCurrentInstance();
		if (fc.getExternalContext().getSessionMap().containsKey("editCustEnqDetailsMB")) {  
		      fc.getExternalContext().getSessionMap().remove("editCustEnqDetailsMB");  
		    }  
		
		return "editenquiry";
	}
	
}	

	
	

