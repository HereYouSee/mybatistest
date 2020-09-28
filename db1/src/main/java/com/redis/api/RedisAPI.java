package com.redis.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class RedisAPI {

    @Autowired
    RedisTemplate redisTemplate;

    @RequestMapping(value = "test1/test")
    public String getAPI(String name) {
        redisTemplate.opsForValue().set("name",name);
        return "123";
    }

    @RequestMapping(value = "test1/add")
    public String add() {
        redisTemplate.opsForValue().increment("testincrement", 1);
        return "123";
    }

    @RequestMapping(value = "test1/member")
    public String member(String member) {
        redisTemplate.opsForList().leftPush("llist", member);
        return "123";
    }

    @RequestMapping(value = "test1/getset")
    public Object member() {
        Object pridedemo = redisTemplate.opsForSet().randomMember("pridedemo");
        return pridedemo;
    }


    @RequestMapping(value = "test1/get")
    public Object testincrement() {
        Object testincrement1 = redisTemplate.opsForValue().get("testincrement");
        return testincrement1;
    }

    @RequestMapping(value = "test1/dianzan")
    public Object dianzan(String userId) {
        Long add = redisTemplate.opsForSet().add("dianzan:100", userId);
        return add;
    }

    @RequestMapping(value = "test1/quxiaodianzan")
    public Object quxiaodianzan(String userId) {
        Long add = redisTemplate.opsForSet().remove("dianzan:100", userId);
        return add;
    }


    @RequestMapping(value = "test1/dianzandetail")
    public Object dianzandetail(String userId) {
        Set members = redisTemplate.opsForSet().members("dianzan:100");
        return members;
    }


    @RequestMapping(value = "test1/ifdianzan")
    public Object ifdianzan(String userId) {
        Boolean member = redisTemplate.opsForSet().isMember("dianzan:100", userId);
        return member;
    }
}
