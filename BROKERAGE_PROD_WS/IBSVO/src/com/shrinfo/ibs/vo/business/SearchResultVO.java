package com.shrinfo.ibs.vo.business;

import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.cmn.vo.UserVO;


public class SearchResultVO extends BaseVO {

    /**
     * 
     */
    private static final long serialVersionUID = 733026355772901204L;

    private CustomerVO customerDetails;
    
    private InsuredVO insuredDetails;
    
    private long enquiryNum;

    private long quotationNum;

    private long policyNum;
    
    private UserVO createdBy;



}
