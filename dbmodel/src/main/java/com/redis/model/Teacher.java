package com.redis.model;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {

    private int tid;

    private String tname;

    private int tage;

    private List<UserModel> users;


}
