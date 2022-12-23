package com.gift.infrastructure.repository;

import com.gift.infrastructure.gatewayimpl.database.UserMapper;
import com.gift.infrastructure.gatewayimpl.database.dataobject.UserInfoDo;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    @Resource
    private UserMapper userMapper;



    public void save(UserInfoDo userInfoDo){


        userMapper.insert(userInfoDo);
    }







}
