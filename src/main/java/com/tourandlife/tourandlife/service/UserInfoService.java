package com.tourandlife.tourandlife.service;

import com.github.pagehelper.PageInfo;
import com.tourandlife.tourandlife.core.universal.Service;
import com.tourandlife.tourandlife.model.UserInfo;
public interface UserInfoService extends Service<UserInfo> {
    UserInfo selectById(Integer id);
    PageInfo<UserInfo> selectAll(Integer page, Integer size);
}
