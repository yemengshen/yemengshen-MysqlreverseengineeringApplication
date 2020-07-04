package com.yemeng.mysqlreverseengineering.controller;

import com.yemeng.mysqlreverseengineering.pojo.Brand;
import com.yemeng.mysqlreverseengineering.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ProjectName: mysqlreverseengineering
 * @Package: com.yemeng.mysqlreverseengineering.controller
 * @ClassName: BrandController
 * @Author: yemengshen
 * @Description:
 * @Date: 2020/6/8 23:19
 * @Version: 1.0
 */
@Controller
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }
}
