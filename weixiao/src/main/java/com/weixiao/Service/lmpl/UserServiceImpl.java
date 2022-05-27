package com.weixiao.Service.lmpl;

import com.weixiao.Service.UserService;
import com.weixiao.User;
import com.weixiao.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component("userService")
public class UserServiceImpl implements UserService {


    //自动配装
    @Autowired
    private UserMapper userMapper;

    /*
     * (non-Javadoc)
     *
     * @see com.geloin.spring.service.MenuService#find()
     */
    @Override
    //重写查询方法
    public List<User> findAllUser() {
        return this.userMapper.findAllUser();
    }



}
