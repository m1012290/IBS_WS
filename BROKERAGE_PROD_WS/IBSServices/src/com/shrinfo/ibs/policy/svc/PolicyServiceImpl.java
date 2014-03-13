package com.shrinfo.ibs.policy.svc;

import java.util.List;

import com.shrinfo.ibs.cmn.vo.BaseVO;


public class PolicyServiceImpl extends BaseService implements PolicyService {

    @Override
    public Object invokeMethod(String methodName, Object... args) {
        Object returnValue = null;

        if ("getPolicy".equals(methodName)) {
            returnValue = getPolicy((BaseVO) args[0]);
        }
        if ("getPloicies".equals(methodName)) {
            returnValue = getPloicies((BaseVO) args[0]);
        }
        if ("createPolicy".equals(methodName)) {
            returnValue = createPolicy((BaseVO) args[0]);
        }
        return returnValue;
    }



    @Override
    public BaseVO getPolicy(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<BaseVO> getPloicies(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseVO createPolicy(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

}
