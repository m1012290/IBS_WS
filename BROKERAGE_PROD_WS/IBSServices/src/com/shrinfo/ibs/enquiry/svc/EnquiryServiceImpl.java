package com.shrinfo.ibs.enquiry.svc;

import java.util.List;

import com.shrinfo.ibs.base.service.BaseService;
import com.shrinfo.ibs.cmn.vo.BaseVO;


public class EnquiryServiceImpl extends BaseService implements EnquiryService {

    @Override
    public Object invokeMethod(String methodName, Object... args) {
        Object returnValue = null;

        if ("getEnquiryDetail".equals(methodName)) {
            returnValue = getEnquiryDetail((BaseVO) args[0]);
        }
        if ("getEnquiryDetails".equals(methodName)) {
            returnValue = getEnquiryDetails((BaseVO) args[0]);
        }
        if ("createEnquiry".equals(methodName)) {
            returnValue = createEnquiry((BaseVO) args[0]);
        }

        return returnValue;
    }


    @Override
    public BaseVO getEnquiryDetail(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<BaseVO> getEnquiryDetails(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseVO createEnquiry(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }


}
