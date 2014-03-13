package com.shrinfo.ibs.enquiry.svc;

import java.util.List;

import com.shrinfo.ibs.cmn.vo.BaseVO;

/**
 * 
 * @author Rahul
 * 
 */

public interface EnquiryService {

    public BaseVO getEnquiryDetail(BaseVO baseVO);

    public List<BaseVO> getEnquiryDetails(BaseVO baseVO);

    public BaseVO createEnquiry(BaseVO baseVO);


}
