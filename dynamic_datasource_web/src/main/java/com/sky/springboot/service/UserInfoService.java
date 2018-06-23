package com.sky.springboot.service;

import com.sky.springboot.dao.UserInfoMapper;
import com.sky.springboot.module.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService {

    @Autowired(required = true)
    private UserInfoMapper userInfoMapper;

    public UserInfo getUserInfoById(Integer id) {
        return userInfoMapper.getUserInfoById(id);
    }

    public UserInfo selectUserInfoById(Integer id) {
        return userInfoMapper.selectByOddUserId(id);
    }
}
