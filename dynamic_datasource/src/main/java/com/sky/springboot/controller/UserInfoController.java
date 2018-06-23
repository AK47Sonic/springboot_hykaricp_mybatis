package com.sky.springboot.controller;

import com.sky.springboot.module.UserInfo;
import com.sky.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserInfoController {

    @Autowired(required = true)
    private UserInfoService userInfoService;

    public UserInfo getUserInfoById(Integer id) {
        return userInfoService.getUserInfoById(id);
    }

    public UserInfo selectUserInfoById(Integer id) {
        return userInfoService.selectUserInfoById(id);
    }

}
