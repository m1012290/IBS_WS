package com.shrinfo.ibs.task.svc;

import java.util.List;

import com.shrinfo.ibs.cmn.vo.BaseVO;


public interface TaskService {

    public List<BaseVO> getTasks(BaseVO user);

    public BaseVO getTask(BaseVO baseVO);

    public BaseVO createTask(BaseVO baseVO);

}
