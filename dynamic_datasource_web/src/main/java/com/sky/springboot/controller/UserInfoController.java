package com.sky.springboot.controller;

import com.sky.springboot.module.UserInfo;
import com.sky.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserInfoController {

    @Autowired(required = true)
    private UserInfoService userInfoService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public UserInfo getUserInfoById(@RequestParam(value = "id") Integer id) {
        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping(value = "/user2", method = RequestMethod.GET)
    public UserInfo getUser2InfoById() {
        return userInfoService.getUserInfoById(1);
    }

    @RequestMapping(value = "/user3/{id}", method = RequestMethod.GET)
    public UserInfo getUser3InfoById(@PathVariable(value = "id") Integer id) {
        return userInfoService.getUserInfoById(id);
    }

    @RequestMapping(value = "/user4", method = RequestMethod.GET)
    public UserInfo selectUserInfoById(@RequestParam(value = "id") Integer id) {
        return userInfoService.selectUserInfoById(id);
    }
}
