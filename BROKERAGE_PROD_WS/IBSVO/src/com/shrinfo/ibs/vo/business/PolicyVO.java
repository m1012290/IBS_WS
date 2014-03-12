package com.shrinfo.ibs.vo.business;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.vo.app.EnquiryType;

public class PolicyVO extends BaseVO {

    private static final long serialVersionUID = 8127574257289256602L;
    
    //policy table transaction id is captured in below field
    private long uwTransactionId;
    
    private String policyNo;

    private String quoteNo;
    
    private int quoteNoVersion;
    
    private Map<InsCompanyVO,QuoteDetailsVO> quoteDetails;
    
    private InsuredVO insuredDetails;
    
    private EnquiryType enquiryType;//enquiry type enum
    
    private int statusCode;
    
    private PremiumVO premiumDetails;
    
    private BigDecimal sumInsured;

    private int policyTerm;
    
    private String coverDescription;
    
    private long policyApprovedByUserId;
    
    private boolean isQuote;//will tell us if its a policy or quote

    private Date policyEffectiveDate;
    
    private Date policyExpiryDate;
    
    private Date endtEffectiveDate;
    
    private Date endtExpiryDate;
    
    private int newQuoteVersion;
    
    private String isQuoteConvertedToPolicy;
}