package com.redis.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {

    private int id;

    private String name;

    private String miaoshu;

    private Teacher teacher;


}
