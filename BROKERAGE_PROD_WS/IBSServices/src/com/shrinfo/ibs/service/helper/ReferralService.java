package com.shrinfo.ibs.service.helper;

import java.math.BigDecimal;

import com.shrinfo.ibs.vo.business.UserVO;

/**
 * 
 * @author Rahul
 *
 */
public interface ReferralService {

	public boolean isReferralApplicable(String referralType, String flow,
			UserVO assignedBy, BigDecimal amount);
	
	public boolean refer(String referralType, String flow,
			UserVO assignedBy, UserVO assignedTo, BigDecimal amount);

}
