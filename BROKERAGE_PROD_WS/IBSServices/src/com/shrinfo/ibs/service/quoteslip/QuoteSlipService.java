package com.shrinfo.ibs.service.quoteslip;

import java.util.List;

import com.shrinfo.ibs.vo.business.CompanyVO;
import com.shrinfo.ibs.vo.business.EnquiryVO;
import com.shrinfo.ibs.vo.business.QuoteDetailsVO;


public interface QuoteSlipService {

    public QuoteDetailsVO getQuoteSlipDetails(EnquiryVO enquiry);

    public void createQuoteSlip(QuoteDetailsVO quoteSlip);

    public void emailQuoteSlip(QuoteDetailsVO quoteSlip, List<CompanyVO> companyList);

}
