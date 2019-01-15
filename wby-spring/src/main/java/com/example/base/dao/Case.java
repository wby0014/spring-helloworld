package com.example.base.dao;

/**
 * @author wubinyu
 * @date 2018/11/30 10:18.
 */
public class Case {

    public volatile int n;

    public synchronized void add() {
        n++;
    }
}
