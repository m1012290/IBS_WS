package com.shrinfo.ibs.task.svc;

import java.util.List;

import com.shrinfo.ibs.base.service.BaseService;
import com.shrinfo.ibs.cmn.vo.BaseVO;

/**
 * 
 * @author Rahul
 * 
 */

public class ReferralTaskServiceImpl extends BaseService implements ReferralTaskService {

    @Override
    public Object invokeMethod(String methodName, Object... args) {
        Object returnValue = null;

        if ("getTasks".equals(methodName)) {
            returnValue = getTasks((BaseVO) args[0]);
        }
        if ("getTask".equals(methodName)) {
            returnValue = getTask((BaseVO) args[0]);
        }
        if ("createTask".equals(methodName)) {
            returnValue = createTask((BaseVO) args[0]);
        }
        return returnValue;
    }


    @Override
    public List<BaseVO> getTasks(BaseVO user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseVO getTask(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public BaseVO createTask(BaseVO baseVO) {
        // TODO Auto-generated method stub
        return null;
    }

}
