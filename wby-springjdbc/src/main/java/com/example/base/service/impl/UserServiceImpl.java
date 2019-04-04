package com.example.base.service.impl;

import com.example.base.dao.UserRowMapper;
import com.example.base.entity.User;
import com.example.base.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.List;

/**
 * @author wubinyu
 * @date 2019/4/3 16:51.
 */
public class UserServiceImpl implements UserService {

    private JdbcTemplate jdbcTemplate;

    /**
     * 设置数据源
     */
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public void save(User user) {
        jdbcTemplate.update("insert into user(name,age,sex) values(?,?,?)", new Object[]{user.getName(), user.getAge(), user.getSex()},
                new int[]{Types.VARCHAR, Types.INTEGER, Types.VARCHAR});
    }

    @Override
    public List<User> getUsers() {
        List<User> list = jdbcTemplate.query("select * from user", new UserRowMapper());
        return list;
    }
}
