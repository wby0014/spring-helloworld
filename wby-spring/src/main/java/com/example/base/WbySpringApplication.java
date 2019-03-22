package com.example.base;

import com.example.base.postprocessor.BeanFactoryPostProcessorTest;
import com.example.base.service.InitServiceTest;
import com.example.base.util.SpringContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * dev分支新增注释
 * 服务启动类
 */
public class WbySpringApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(WbySpringApplication.class);

    public static void main(String[] args) {
        LOGGER.info(">>>>> wby-spring 正在启动 <<<<<");
        new TestExtendApplicationcontext("classpath:META-INF/spring/*.xml");
        InitServiceTest initServiceTest = (InitServiceTest) SpringContextUtil.getBean("initServiceTest");
        initServiceTest.initMapper();
        BeanFactoryPostProcessorTest bean = SpringContextUtil.getBean(BeanFactoryPostProcessorTest.class);
        System.out.println(bean.toString());
        LOGGER.info(">>>>> wby-spring 启动完成 <<<<<");
    }

}
