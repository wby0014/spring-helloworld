package com.example.base.service;

/**
 * @author wubinyu
 * @date 2019/4/2 16:36.
 */
public class TestBean {

    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    public void test() {
        System.out.println("test");
    }
}
