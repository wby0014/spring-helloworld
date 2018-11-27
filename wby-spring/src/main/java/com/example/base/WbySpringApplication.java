package com.example.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 */
public class WbySpringApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(WbySpringApplication.class);

    public static void main(String[] args) {
        LOGGER.info(">>>>> wby-spring 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        LOGGER.info(">>>>> wby-spring 启动完成 <<<<<");
    }

}
