package com.example.base;

import com.example.base.service.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wubinyu
 * @date 2019/4/2 17:09.
 */
public class WbySpringAopApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
        TestBean testBean = (TestBean) context.getBean("test");
        testBean.test();
    }
}
