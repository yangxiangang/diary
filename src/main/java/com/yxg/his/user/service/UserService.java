package com.yxg.his.user.service;

import com.yxg.his.user.dto.UserDto;
import com.yxg.his.user.entity.User;

/**
 * Created by Administrator on 2016/10/19.
 */
public interface UserService {
    User selectByLoginNamePassword(UserDto userDto);
}
