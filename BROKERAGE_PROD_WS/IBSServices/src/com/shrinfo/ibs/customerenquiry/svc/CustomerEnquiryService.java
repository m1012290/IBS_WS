package com.shrinfo.ibs.customerenquiry.svc;

import com.shrinfo.ibs.cmn.vo.BaseVO;


public interface CustomerEnquiryService {

    public BaseVO getCustomerEnquiry(BaseVO baseVO);

    public BaseVO createCustomerEnquiry(BaseVO baseVO);

}
