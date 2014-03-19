package com.shrinfo.ibs.web;

import com.shrinfo.ibs.cmn.utils.Utils;
import com.shrinfo.ibs.search.svc.SearchService;
import com.shrinfo.ibs.vo.business.SearchItemVO;
import com.shrinfo.ibs.vo.business.SearchVO;

public class Test {
	
	public static void main(String[] args) {
		
		Utils.setAppContext(Utils.loadSpringBeansFactory("config/applicationcontext.xml"));
        SearchService searchService = (SearchService) Utils.getBean("customerInsuredSearchSvcBean");
        SearchItemVO item = new SearchItemVO();
        item.setCustomerName("Shaik");
        item.setCustomerEmail("ABC_GMAIL.COM");
        //item.setCustomerMob("99808080801");
        //item.setInsuredName("insured");
        item.setEnquiryNum(3);
        item.setQuotationNum(1);
       // item.setPolicyNum("1234567890");
        
        System.out.println(((SearchVO)searchService.getSearchResult(item)).getSearchItems());
		
	}

}