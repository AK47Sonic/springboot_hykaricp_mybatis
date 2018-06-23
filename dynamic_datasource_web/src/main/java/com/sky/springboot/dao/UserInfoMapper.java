package com.sky.springboot.dao;

import com.sky.springboot.annotation.TargetDataSource;
import com.sky.springboot.module.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper {
	/**
	 * 从test1数据源中获取用户信息
	 */
	@TargetDataSource("test1")
	UserInfo selectByOddUserId(Integer id);
	/**
	 * 从test2数据源中获取用户信息
	 */
	@TargetDataSource("test2")
	UserInfo selectByEvenUserId(Integer id);

	@TargetDataSource("test2")

	UserInfo getUserInfoById(Integer id);

}