package com.yxg.his.user.dao;

import com.yxg.his.common.persistence.annotation.MyBatisDao;
import com.yxg.his.user.dto.UserDto;
import com.yxg.his.user.entity.User;
@MyBatisDao
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByLoginNamePassword(UserDto userDto);
}