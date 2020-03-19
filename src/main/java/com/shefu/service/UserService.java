package com.shefu.service;

import com.shefu.entity.User;
import com.shefu.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User getUser(int id){
        return userMapper.Sel(id);
    }

    public List<User> getUserAll(){
        return userMapper.SelAll();
    }
}
