package com.shrinfo.ibs.service.policy;

import java.util.List;

import com.shrinfo.ibs.vo.business.CustomerVO;
import com.shrinfo.ibs.vo.business.EnquiryVO;
import com.shrinfo.ibs.vo.business.InsuredVO;
import com.shrinfo.ibs.vo.business.PolicyVO;


public interface PolicyService {

    public PolicyVO getPolicy(long policyCode);

    public PolicyVO getPolicy(EnquiryVO enquiry);

    public List<PolicyVO> getPloicies(CustomerVO customer);

    public List<PolicyVO> getPloicies(InsuredVO insured);


}
