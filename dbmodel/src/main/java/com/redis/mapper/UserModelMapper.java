package com.redis.mapper;

import com.redis.model.UserModel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserModelMapper {

    UserModel selectUser(int id);


    @Select("select * from user_model where name=#{name}")
    UserModel getUserByName(String name);


    @Select("select * from user_model where name=#{name} and miaoshu=#{miaoshu}")
    UserModel getUserByTwo(String name,String miaoshu);

    UserModel selectTeacher(int id);

    UserModel selectTeacherUnion(int id);


    @Insert("insert into user_model(name,miaoshu) values(#{user.name},#{user.miaoshu})")
    int insertUser(@Param(value = "user")UserModel user);


}
