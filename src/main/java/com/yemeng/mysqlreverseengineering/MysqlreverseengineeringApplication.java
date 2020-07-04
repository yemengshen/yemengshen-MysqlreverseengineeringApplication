package com.yemeng.mysqlreverseengineering;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 开启Scheduled定时任务
@MapperScan("com.yemeng.mysqlreverseengineering.dao")
public class MysqlreverseengineeringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlreverseengineeringApplication.class, args);
    }

}
