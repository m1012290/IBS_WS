package com.shrinfo.ibs.quoteslip.svc;

import java.util.List;

import com.shrinfo.ibs.cmn.vo.BaseVO;
import com.shrinfo.ibs.vo.business.EnquiryVO;
import com.shrinfo.ibs.vo.business.QuoteDetailsVO;


public interface QuoteSlipService {

    public BaseVO getQuoteSlipDetails(BaseVO baseVO);

    public BaseVO createQuoteSlip(BaseVO baseVO);

    public BaseVO emailQuoteSlip(BaseVO baseVO, List<BaseVO> companies);

}
