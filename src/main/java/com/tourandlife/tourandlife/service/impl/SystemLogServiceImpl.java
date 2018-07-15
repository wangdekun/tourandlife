package com.tourandlife.tourandlife.service.impl;

import com.tourandlife.tourandlife.dao.SystemLogMapper;
import com.tourandlife.tourandlife.model.SystemLog;
import com.tourandlife.tourandlife.service.SystemLogService;
import com.tourandlife.tourandlife.core.universal.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
* @Description: SystemLogService接口实现类
* @author 张瑶
* @date 2018/07/15 23:18
*/
@Service
public class SystemLogServiceImpl extends AbstractService<SystemLog> implements SystemLogService {

    @Resource
    private SystemLogMapper systemLogMapper;

}