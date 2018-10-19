package com.dxf.myspringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dxf.myspringboot.service.RedisService;
/*
 * @author 独善其身的狗
 * @date   2018年10月19日
 * 
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/save")
    public String save(){   //这里用于测试，key值可以自定义实现
        redisService.set("wukonglai","www.wukonglai.com");
        return "SUCCESS";
    }

    @RequestMapping("/get")
    public String get(){    //这里用于测试，key值可以自定义实现
        return (String) redisService.get("wukonglai");
    }
}