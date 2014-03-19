package com.shrinfo.ibs.policy.svc;

import java.util.List;

import com.shrinfo.ibs.cmn.vo.BaseVO;


public interface PolicyService {

    public BaseVO getPolicy(BaseVO baseVO);

    public List<BaseVO> getPloicies(BaseVO baseVO);

    public BaseVO createPolicy(BaseVO baseVO);

}
