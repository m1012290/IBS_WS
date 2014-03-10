package com.shrinfo.ibs.service.helper;

import java.math.BigDecimal;

import com.shrinfo.ibs.vo.business.TaskVO;
import com.shrinfo.ibs.vo.business.UserVO;

public class ReferralServiceImpl implements ReferralService {

    @Override
    public boolean isReferralApplicable(String referralType, String flow, UserVO assignedBy,
            BigDecimal amount) {



        return false;
    }

    @Override
    public TaskVO refer(String referralType, String flow, UserVO assignedBy, UserVO assignedTo,
            BigDecimal amount) {
        // TODO Auto-generated method stub
        return null;
    }

}
