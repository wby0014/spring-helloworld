package com.example.base.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * bean后置处理器
 *
 * @author wubinyu
 * @date 2019/3/20 15:19.
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("后置处理器处理bean=【" + s + "】开始");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("后置处理器处理bean=【" + s + "】结束");
        return o;
    }
}
