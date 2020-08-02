package com.yemeng.mysqlreverseengineering.task;

import com.yemeng.mysqlreverseengineering.taskconfig.BaseTaskJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: mysqlreverseengineering
 * @Package: com.yemeng.mysqlreverseengineering.task
 * @ClassName: TestQuartz
 * @Author: wuxiaobin
 * @Description: 定时任务测试类
 * @Date: 2020/8/2 23:30
 * @Version: 1.0
 */
@Component
public class TestQuartz implements BaseTaskJob {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public int i = 0;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        i++;
        logger.error("task2>>>>>>>  " + i);
        try {
//            QuartzJobManager.getInstance().jobdelete(this.getClass().getSimpleName(),"ah");//执行完此任务就删除自己
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}