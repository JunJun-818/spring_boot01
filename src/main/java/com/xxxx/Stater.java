package com.xxxx;

import com.xxxx.config.IocConfig;
import com.xxxx.dao.AccountDao;
import com.xxxx.dao.UserDao;
import com.xxxx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//测试
public class Stater {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(IocConfig.class);
        /*UserService userService=ac.getBean(UserService.class);
        userService.test();*/
        IocConfig iocConfig=ac.getBean(IocConfig.class);
        /*System.out.println(ac.isSingleton("iocConfig"));
        AccountDao accountDao01=iocConfig.accountDao();
        AccountDao accountDao02=iocConfig.accountDao();
        accountDao01.test();*/
        iocConfig.printInfo();
        ac.getBean(UserDao.class).test();
    }
}
