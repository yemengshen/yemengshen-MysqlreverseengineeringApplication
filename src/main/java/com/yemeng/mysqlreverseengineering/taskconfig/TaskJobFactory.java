package com.yemeng.mysqlreverseengineering.taskconfig;


import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
/**
 * @ProjectName: demo
 * @Package: com.example.demo.config
 * @ClassName: TaskJobFactory
 * @Author: wuxiaobin
 * @Description: 解决quartz无法注入spring bean问题
 * @Date: 2020/8/2 23:10
 * @Version: 1.0
 */
@Component
public class TaskJobFactory extends AdaptableJobFactory {
    @Autowired
    private AutowireCapableBeanFactory capableBeanFactory;

    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        //调用父类的方法
        Object jobInstance = super.createJobInstance(bundle);
        //进行注入
        capableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}
