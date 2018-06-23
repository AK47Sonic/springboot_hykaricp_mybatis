package com.sky.springboot;

import com.sky.springboot.dao.UserInfoMapper;
import com.sky.springboot.module.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApplicationStarter.class)
@Slf4j
public class AppTest {
	@Autowired
	private UserInfoMapper userInfoMapper;

	@Test
	public void testDynamicDatasource() {
		UserInfo userInfo;
		for (int i = 1; i <= 2; i++) {
			//i为奇数时调用selectByOddUserId方法获取，i为偶数时调用selectByEvenUserId方法获取
			userInfo = i % 2 == 1 ? userInfoMapper.selectByOddUserId(i) : userInfoMapper.selectByEvenUserId(i);
			log.info("{}->={}", userInfo);
		}
	}
}
