package com.example.base.jdbc;

import com.example.base.entity.User;
import com.example.base.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author wubinyu
 * @date 2019/4/3 17:16.
 */
public class SpringJDBCTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setName("张三");
        user.setAge(18);
        user.setSex("男");
        userService.save(user);
        List<User> users = userService.getUsers();
        for (User person : users) {
            System.out.println("person:" + person.getName());
        }
    }
}
