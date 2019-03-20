package com.example.base.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.stereotype.Component;

/**
 * @author wubinyu
 * @date 2019/3/20 15:28.
 */
@Component("beanFactoryPostProcessorTest")
public class BeanFactoryPostProcessorTest implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware {

    private String name;
    private String sex;

    public BeanFactoryPostProcessorTest() {
        this.name = "张三";
        this.sex = "男";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(">>>调用了InitializingBean的afterPropertiesSet方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(">>>调用了DisposableBean的destroy方法");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println(">>>调用了BeanNameAware的setBeanName方法");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(">>>调用了BeanFactoryAware的setBeanFactory方法");
    }

    @Override
    public String toString() {
        return "BeanFactoryPostProcessorTest{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
