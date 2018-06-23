package com.sky.springboot.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 实际数据源配置
 */
@Component
@Data
@ConfigurationProperties(prefix = "hikaricp")
public class DBProperties {
	private HikariDataSource test1;
	private HikariDataSource test2;
}
