package com.shrinfo.ibs.customer.svc;

import com.shrinfo.ibs.base.service.BaseService;
import com.shrinfo.ibs.cmn.vo.BaseVO;



public class CustomerServiceImpl extends BaseService implements CustomerService {

    @Override
    public Object invokeMethod(String methodName, Object... args) {
        Object returnValue = null;

        if ("getCustomer".equals(methodName)) {
            returnValue = getCustomer((BaseVO) args[0]);
        }
        if ("createCustomer".equals(methodName)) {
            returnValue = createCustomer((BaseVO) args[0]);
        }
        return returnValue;
    }


    @Override
    public BaseVO getCustomer(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseVO createCustomer(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }


}
