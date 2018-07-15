package com.tourandlife.tourandlife.dao;

import com.tourandlife.tourandlife.core.universal.Mapper;
import com.tourandlife.tourandlife.model.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper extends Mapper<UserInfo> {
    UserInfo selectById(@Param("id") Integer id);
    List<UserInfo> selectAll();
}
