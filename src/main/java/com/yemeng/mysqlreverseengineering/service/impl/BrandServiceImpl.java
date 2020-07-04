package com.yemeng.mysqlreverseengineering.service.impl;

import com.yemeng.mysqlreverseengineering.dao.BrandMapper;
import com.yemeng.mysqlreverseengineering.pojo.Brand;
import com.yemeng.mysqlreverseengineering.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: mysqlreverseengineering
 * @Package: com.yemeng.mysqlreverseengineering.service.impl
 * @ClassName: BrandServiceImpl
 * @Author: yemengshen
 * @Description:
 * @Date: 2020/6/8 23:28
 * @Version: 1.0
 */
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;
    public List<Brand> findAll(){
        return brandMapper.selectAllBrand();
    }

}
