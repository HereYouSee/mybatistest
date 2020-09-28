package com.redis.mapper;

import com.redis.model.Teacher;

public interface TeacherMapper {

    Teacher selectTeacherById(int id);
    Teacher selectTeacherUnionById(int id);
    Teacher selectTeacherTypeById(int id);
}
