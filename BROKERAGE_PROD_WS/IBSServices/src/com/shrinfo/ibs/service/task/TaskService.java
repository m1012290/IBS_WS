package com.shrinfo.ibs.service.task;

import java.util.List;

import com.shrinfo.ibs.cmn.vo.UserVO;
import com.shrinfo.ibs.vo.business.TaskVO;


public interface TaskService {

    public List<TaskVO> getTasks(UserVO user, String status);

    public TaskVO getTask(long taskId);

    public void createTask(TaskVO task);

}
