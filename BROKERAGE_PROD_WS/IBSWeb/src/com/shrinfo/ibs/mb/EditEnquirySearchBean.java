package com.shrinfo.ibs.mb;

import java.io.IOException;
import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.event.SelectEvent;

import com.shrinfo.ibs.vo.business.SearchItemVO;

@ManagedBean(name="editEnquirySearchBean")
@SessionScoped
public class EditEnquirySearchBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8882016695712534609L;
	private String custName;
	private String mobNumber;
	private String emailID;
	private String insuredName;
	private long enquiryNumber;
	private long quoteSlipNumber;
	private String policyNumber;
	
	
	
	public EditEnquirySearchBean() {
		
		super();

		/* HttpSession session=(HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
	        
         SearchItemVO searchItemVO=(SearchItemVO) session.getAttribute("searchItmVO");
         this.custName=searchItemVO.getCustomerName();
         this.mobNumber=searchItemVO.getCustomerMob();
         this.emailID=searchItemVO.getCustomerEmail();
         this.insuredName=searchItemVO.getInsuredName();
         this.enquiryNumber=searchItemVO.getEnquiryNum();
         this.quoteSlipNumber=searchItemVO.getQuotationNum();
         this.policyNumber=searchItemVO.getPolicyNum();*/
         //new EditEnquirySearchBean(searchItemVO.getCustomerName(), searchItemVO.getCustomerMob(), searchItemVO.getCustomerEmail(), searchItemVO.getInsuredName(), searchItemVO.getEnquiryNum(), searchItemVO.getQuotationNum(), searchItemVO.getPolicyNum());
        
		System.out.println("EditEnquirySearchBean Initiated");
		// TODO Auto-generated constructor stub
	}
	public EditEnquirySearchBean(String custName, String mobNumber,
			String emailID, String insuredName, long enquiryNumber,
			long quoteSlipNumber, String policyNumber) {
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
	
	public void onRowSelect(SelectEvent event) { 
		

		
		SearchItemVO searchItmVO=(SearchItemVO) event.getObject();
		System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[");
		this.custName=searchItmVO.getCustomerName();
        this.mobNumber=searchItmVO.getCustomerMob();
        this.emailID=searchItmVO.getCustomerEmail();
        this.insuredName=searchItmVO.getInsuredName();
        this.enquiryNumber=searchItmVO.getEnquiryNum();
        this.quoteSlipNumber=searchItmVO.getQuotationNum();
        this.policyNumber=searchItmVO.getPolicyNum();
        
        try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("/IBSWeb/faces/pages/editenquiry.xhtml");
		  

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
    }
	
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
