package com.yemeng.mysqlreverseengineering.controller;

import com.yemeng.mysqlreverseengineering.task.TestQuartz;
import com.yemeng.mysqlreverseengineering.taskconfig.QuartzJobManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: mysqlreverseengineering
 * @Package: com.yemeng.mysqlreverseengineering.controller
 * @ClassName: TaskController
 * @Author: wuxiaobin
 * @Description: 定时任务测试类
 * @Date: 2020/8/2 23:32
 * @Version: 1.0
 */
@Controller
@RequestMapping("/task")
public class TaskController {
    @GetMapping("/one")
    public void task(HttpServletRequest request) throws Exception {
        String name = "定时任务1";
        QuartzJobManager.getInstance().addJob(TestQuartz.class, name,name+"", "*/1 * * * * ?");
    }
}
