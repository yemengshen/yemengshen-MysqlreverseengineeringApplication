package com.yemeng.mysqlreverseengineering.service;

import com.yemeng.mysqlreverseengineering.pojo.Brand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @ProjectName: mysqlreverseengineering
 * @Package: com.yemeng.mysqlreverseengineering.service
 * @ClassName: BrandService
 * @Author: yemengshen
 * @Description:
 * @Date: 2020/6/8 23:27
 * @Version: 1.0
 */
public interface BrandService {
    public List<Brand> findAll();
}
