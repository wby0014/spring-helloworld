package com.example.base;

import com.example.base.util.ApplicationContextListener;
import com.example.base.util.SpringContextUtil;
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
        ApplicationContextListener applicationContextListener = (ApplicationContextListener) SpringContextUtil.getBean("applicationContextListener");
        applicationContextListener.test();
        LOGGER.info(">>>>> wby-spring 启动完成 <<<<<");
    }

}
