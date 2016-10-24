package com.yxg.his.user.service.Impl;

import com.yxg.his.user.dao.UserMapper;
import com.yxg.his.user.dto.UserDto;
import com.yxg.his.user.entity.User;
import com.yxg.his.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/10/19.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectByLoginNamePassword(UserDto userDto) {
        return userMapper.selectByLoginNamePassword(userDto);
    }
}
