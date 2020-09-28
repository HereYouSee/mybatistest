package com.redis.api;

import com.redis.model.Teacher;
import com.redis.model.UserModel;
import com.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserModelAPI {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "user/select")
    public UserModel get(int id) {
        return userService.getUser(id);
    }

    @RequestMapping(value = "user/selectname")
    public UserModel get(String name) {
        return userService.getUserByName(name);
    }


    @RequestMapping(value = "user/selecttwo")
    public UserModel get(String name,String miaoshu) {
        return userService.getUserByTwo(name,miaoshu);
    }

//    @RequestMapping(value = "user/getTeacher")
//    public UserModel getTeacher(int id) {
//        return userService.getTeacher(id);
//    }


    @RequestMapping(value = "user/getTeacherUnion")
    public UserModel getTeacherUnion(int id) {
        return userService.getTeacherUnion(id);
    }

    @RequestMapping(value = "teacher/getTeacher")
    public Teacher getTeacher(int id) {
        return userService.getTeacherById(id);
    }


    @RequestMapping(value = "teacher/getTeacherUnion")
    public Teacher getTeacherUnionMethod(int id) {
        return userService.getTeacherUnionMethod(id);
    }


    @RequestMapping(value = "teacher/getTeacherTypeById")
    public Teacher getTeacherTypeById(int id) {
        return userService.getTeacherTypeById(id);
    }

}
