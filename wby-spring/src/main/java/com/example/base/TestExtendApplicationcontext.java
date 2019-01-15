package com.example.base;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试扩展spring
 *
 * @author wubinyu
 * @date 2018/12/15 15:51.
 */
public class TestExtendApplicationcontext extends ClassPathXmlApplicationContext {
    public TestExtendApplicationcontext(String configLocation) throws BeansException {
        super(configLocation);
    }

    @Override
    protected void initPropertySources() {
        getEnvironment().setRequiredProperties("JAVA_HOME");
    }
}
