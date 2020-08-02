package com.yemeng.mysqlreverseengineering;

import com.yemeng.mysqlreverseengineering.pojo.Brand;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

@SpringBootApplication
@EnableScheduling // 开启Scheduled定时任务
@MapperScan("com.yemeng.mysqlreverseengineering.dao")
public class MysqlreverseengineeringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlreverseengineeringApplication.class, args);
        Map map=new HashMap();
        Class<Brand> brandClass = Brand.class;
        Brand brand=new Brand();
        ClassLoader classLoader = brand.getClass().getClassLoader();
        brand.getClass().getInterfaces();
    }

}
