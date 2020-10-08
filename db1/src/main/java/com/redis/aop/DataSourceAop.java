package com.redis.aop;

import com.redis.datasource.DBContextHolder;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DataSourceAop {

    @Pointcut("execution(* com.redis.mapper..*.select*(..))" +
            "|| execution(* com.redis.mapper..*.get*(..))")
    public void readPointcut(){

    }

    @Pointcut("execution(* com.redis.mapper..*.insert*(..))" +
            "|| execution(* com.redis.mapper..*.update*(..))" +
            "|| execution(* com.redis.mapper..*.delete*(..))")
    public void writePointcut(){

    }


    @Before("readPointcut()")
    public void read(){
        DBContextHolder.slave();
    }

    @Before("writePointcut()")
    public void write(){
        DBContextHolder.master();
    }

}
