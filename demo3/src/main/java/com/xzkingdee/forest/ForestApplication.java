package com.xzkingdee.forest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @author qy
 * @date Created in 2020/8/20
 **/
@SpringBootApplication
@Configuration
//@ForestScan(basePackages = "com.forest.client")
public class ForestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForestApplication.class, args);
    }
}
