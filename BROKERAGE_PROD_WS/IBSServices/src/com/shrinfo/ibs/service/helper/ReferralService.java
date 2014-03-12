package com.shrinfo.ibs.service.helper;

import java.math.BigDecimal;

import com.shrinfo.ibs.cmn.vo.UserVO;
import com.shrinfo.ibs.vo.business.TaskVO;

/**
 * 
 * @author Rahul
 * 
 */
public interface ReferralService {

    public boolean isReferralApplicable(String referralType, String flow, UserVO assignedBy,
            BigDecimal amount);

    public TaskVO refer(String referralType, String flow, UserVO assignedBy, UserVO assignedTo,
            BigDecimal amount);

}
