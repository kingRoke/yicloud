package com.yicloud.feign.controller;

import com.yicloud.feign.service.SchedualServiceHi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private SchedualServiceHi serviceHi;

    @RequestMapping("/call/{id}")
    public String callHome(@PathVariable String id){
        logger.info("调用8081服务");

        return serviceHi.callHome(id)+" world!!!";
    }

}
