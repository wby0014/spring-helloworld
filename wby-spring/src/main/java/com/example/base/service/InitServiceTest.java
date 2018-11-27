package com.example.base.service;

import com.example.base.annotation.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author wubinyu
 * @date 2018/11/27 10:16.
 */
@Component("initServiceTest")
@BaseService
public class InitServiceTest {

    private static Logger logger = LoggerFactory.getLogger(InitServiceTest.class);


    public void initMapper() {
        logger.info("BaseService注解的类执行了");
    }
}
