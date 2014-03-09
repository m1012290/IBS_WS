package com.shrinfo.ibs.helper;

import java.math.BigDecimal;

import com.shrinfo.ibs.vo.business.UserVO;

/**
 * 
 * @author Rahul
 * 
 */

public class ReferralHelper {
	
	
	/**
	 * 
	 * @param referralType
	 *            :Values- QUOTESLIP, POLICY
	 * @param flow
	 *            : Values- EDIT, NORMAL
	 * @param assignedBy
	 *            :
	 * @param amount: amount entered during quote-slip generation or policy generation
	 * @return
	 */
	public Boolean isReferralApplicable(String referralType, String flow,
			UserVO assignedBy, BigDecimal amount) {

		return false;
	}

	/**
	 * 
	 * @param referralType
	 * @param flow
	 * @param assignedBy
	 * @param assignedTo
	 * @param amount
	 * @return
	 */
	public boolean refer(String referralType, String flow, UserVO assignedBy,
			UserVO assignedTo, BigDecimal amount) {

		return false;
	}

}
