package com.xxxx.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
    @Value("${user.userName}")
    private String userName;
    @Value("${user.password}")
    private String pa;

    public void test(){
        System.out.println(userName+"->"+pa);
    }
}
