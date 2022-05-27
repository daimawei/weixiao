package com.weixiao.Service;

import com.weixiao.User;
import com.weixiao.dao.UserMapper;

import java.awt.*;
import java.util.List;

public interface UserService {

    //查询列表服务
    List<User> findAllUser();
}
