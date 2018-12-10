package com.yicloud.feign.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    private static final Logger logger = LoggerFactory.getLogger(SchedualServiceHiHystric.class);

    @Override
    public String callHome(String id) {
        logger.info("嘿，调callHome接口失败");
        return "熔断器熔断了";
    }
}
