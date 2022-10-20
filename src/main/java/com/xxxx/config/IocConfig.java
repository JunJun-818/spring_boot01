package com.xxxx.config;

import com.xxxx.dao.AccountDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 配置类
 */
@Configuration
@ComponentScan("com.xxxx")
@PropertySource(value = {"classpath:jdbc.properties","classpath:user.properties"})
public class IocConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;
    @Value("${user.userName}")
    private String userName;
    @Value("${user.password}")
    private String pa;
    @Bean
    public AccountDao accountDao(){
        return new AccountDao();
    }

    public void printInfo(){
        System.out.println(driver+"->"+url+"->"+username+"->"+password);
        System.out.println(userName+"->"+pa);
    }
}
