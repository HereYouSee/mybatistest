package com.redis.service;

import com.redis.mapper.TeacherMapper;
import com.redis.mapper.UserModelMapper;
import com.redis.model.Teacher;
import com.redis.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired(required = false)
    UserModelMapper userModelMapper;
    @Autowired(required = false)
    TeacherMapper teacherMapper;

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

    public Teacher getTeacherById(int id) {
        return teacherMapper.selectTeacherById(id);
    }

    public Teacher getTeacherUnionMethod(int id) {
        teacherMapper.selectTeacherUnionById(id);
        teacherMapper.selectTeacherUnionById(2);
        System.out.println("2222222222222");
        return teacherMapper.selectTeacherUnionById(id);
    }

    public Teacher getTeacherTypeById(int id) {
        return teacherMapper.selectTeacherTypeById(id);
    }

    public boolean saveUser(UserModel userModel) {
        userModelMapper.insertUser(userModel);
        return true;
    }
}
