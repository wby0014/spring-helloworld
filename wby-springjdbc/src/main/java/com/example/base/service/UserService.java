package com.example.base.service;

import com.example.base.entity.User;

import java.util.List;

/**
 * 创建数据操作接口
 *
 * @author wubinyu
 * @date 2019/4/3 16:49.
 */
public interface UserService {

    public void save(User user);

    public List<User> getUsers();
}
