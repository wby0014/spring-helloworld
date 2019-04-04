package com.example.base.entity;

/**
 * @author wubinyu
 * @date 2019/4/3 16:41.
 */
public class User {
    private int id;
    private String name;
    private int age;
    private String sex;

    public User() {
    }

    public User(int id, String name, int age, String sex) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
