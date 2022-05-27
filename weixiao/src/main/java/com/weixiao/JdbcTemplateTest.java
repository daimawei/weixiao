package com.weixiao;

import com.weixiao.dao.BiageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest implements BiageDao {

    @Autowired
    //注入jdbc
    private JdbcTemplate jdbcTemplate;


    @Override
    public int add(Biage bg) {
        String sql="INSERT INTO biage(name,type,school ) VALUES(?,?,?)";
        Object[] args={bg.getName(),bg.getType(),bg.getSchool()};
        int update = jdbcTemplate.update(sql, args);
        return update;


    }

}


