package com.yemeng.mysqlreverseengineering.taskconfig;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @ProjectName: mysqlreverseengineering
 * @Package: com.yemeng.mysqlreverseengineering.config
 * @ClassName: BaseTaskJob
 * @Author: wuxiaobin
 * @Description: 基础任务调度taskJob接口
 * @Date: 2020/8/2 23:26
 * @Version: 1.0
 */
public interface BaseTaskJob extends Job {
     void execute(JobExecutionContext context)
             throws JobExecutionException;
 }