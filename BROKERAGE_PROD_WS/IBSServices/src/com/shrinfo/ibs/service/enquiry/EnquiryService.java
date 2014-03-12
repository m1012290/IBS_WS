package com.shrinfo.ibs.service.enquiry;

import java.util.List;

import com.shrinfo.ibs.vo.business.CustomerVO;
import com.shrinfo.ibs.vo.business.EnquiryVO;
import com.shrinfo.ibs.vo.business.PolicyVO;
import com.shrinfo.ibs.vo.business.QuoteDetailsVO;

/**
 * 
 * @author Rahul
 * 
 */

public interface EnquiryService {

    public EnquiryVO getEnquiryDetails(EnquiryVO enquiry);

    public List<EnquiryVO> getEnquiryDetails(CustomerVO customer);

    public List<EnquiryVO> getEnquiryDetails(PolicyVO policy);

    public List<EnquiryVO> getEnquiryDetails(QuoteDetailsVO quotation);

    public void createEnquiry(EnquiryVO enquiry);


}
