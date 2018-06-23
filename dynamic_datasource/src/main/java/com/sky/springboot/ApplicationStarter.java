package com.sky.springboot;

import com.sky.springboot.controller.UserInfoController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import javax.annotation.Resource;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ApplicationStarter implements CommandLineRunner {

    @Resource
    private UserInfoController userInfoController;

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println(userInfoController.getUserInfoById(1));

    }
}
