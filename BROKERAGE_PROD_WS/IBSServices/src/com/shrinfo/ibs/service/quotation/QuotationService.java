package com.shrinfo.ibs.service.quotation;

import java.util.List;

import com.shrinfo.ibs.vo.business.QuoteDetailsVO;


public interface QuotationService {

    public List<QuoteDetailsVO> getQuotations(QuoteDetailsVO quoteSlip);

    public QuoteDetailsVO getQuotation(String quotationId);

    public void createQuotation(QuoteDetailsVO quotation);

    public void closeQuotation(QuoteDetailsVO quotation);

    public void emailQuotation(QuoteDetailsVO quotation);

}
