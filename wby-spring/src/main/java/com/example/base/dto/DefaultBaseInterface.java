package com.example.base.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class DefaultBaseInterface implements BaseInterface {

    private static Logger logger = LoggerFactory.getLogger(DefaultBaseInterface.class);

    @Override
    public void init() {
        logger.info("BaseInterface接口的实现类init method执行了");
    }
}
