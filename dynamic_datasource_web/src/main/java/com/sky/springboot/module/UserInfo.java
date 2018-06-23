package com.sky.springboot.module;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class UserInfo implements Serializable {
    private Integer id;

    private String userName;

    private Integer userAge;

    private String address;

    private Date addTime;

    private String remarks;
    
}