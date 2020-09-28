package com.redis.service;

import com.redis.mapper.UserModelMapper;
import com.redis.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired(required = false)
    UserModelMapper userModelMapper;

    public UserModel getUser(int id) {
        return userModelMapper.selectUser(id);
    }

    public UserModel getUserByName(String name) {
        return userModelMapper.getUserByName(name);
    }

    public UserModel getUserByTwo(String name, String miaoshu) {
        return userModelMapper.getUserByTwo(name,miaoshu);
    }

    public UserModel getTeacher(int id) {
        return userModelMapper.selectTeacher(id);
    }

    public UserModel getTeacherUnion(int id) {
        return userModelMapper.selectTeacherUnion(id);
    }
}
