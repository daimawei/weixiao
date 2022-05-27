package com.weixiao.dao;

import com.weixiao.User;
import org.springframework.stereotype.Repository;

import java.util.List;

//接口的一个实现类交给spring管理
//@Repository("UserMapper")
public interface UserMapper {

    /**
     * 添加用户
     * @param user
     */
    void addUser(User user);

    /**
     * 通过用户ID删除用户
     * @param id
     */
    void delUserById(Integer id);

    /**
     * 查询所用用户信息
     * @return
     */
    List<User> findAllUser();

}
