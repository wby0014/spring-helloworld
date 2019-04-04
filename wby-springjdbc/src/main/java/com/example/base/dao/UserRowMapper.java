package com.example.base.dao;


import com.example.base.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 创建表与实体间的映射
 *
 * @author wubinyu
 * @date 2019/4/3 16:42.
 */
public class UserRowMapper implements RowMapper {


    @Override
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        User person = new User(resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getInt("age"),
                resultSet.getString("sex"));
        return person;
    }
}
