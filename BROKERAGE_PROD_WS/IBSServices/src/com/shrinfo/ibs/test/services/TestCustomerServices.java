package com.shrinfo.ibs.test.services;

import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.customerenquiry.svc.CustomerEnquiryService;
import com.shrinfo.ibs.vo.business.ContactVO;
import com.shrinfo.ibs.vo.business.CustomerVO;
import com.shrinfo.ibs.vo.business.EnquiryVO;
import com.shrinfo.ibs.vo.business.PolicyVO;


public class TestCustomerServices {

    public static void main(String args[]) {
        Utils.setAppContext(Utils.loadSpringBeansFactory("config/applicationcontext.xml"));

        CustomerEnquiryService customerService =
            (CustomerEnquiryService) Utils.getBean("customerEnquirySvc");

        CustomerVO customerVO = new CustomerVO();
        customerVO.setCategory("Retail");
        customerVO.setClassification("");
        customerVO.setGroup("");
        customerVO.setIsStatusActive("Y");
        customerVO.setName("cumstomer save");
        customerVO.setSalutation("Mr");
        customerVO.setSourceOfBusiness("source");
        ContactVO contactVO = new ContactVO();
        contactVO.setEmailId("customer_save@ibs.com");
        contactVO.setMobileNo("888888888");
        contactVO.getAddress().setLattitude("1");
        contactVO.getAddress().setLongitude("1");

        EnquiryVO enquiryVO = new EnquiryVO();
        enquiryVO.setEnquiryNo(23l);
        customerVO.setContactAndAddrDets(contactVO);
        enquiryVO.setEnquiryContact(contactVO);
        enquiryVO.setCustomerDetails(customerVO);

        //System.out.println(customerService.getCustomerEnquiry(enquiryVO));

         System.out.println(customerService.createCustomerEnquiry(enquiryVO));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
