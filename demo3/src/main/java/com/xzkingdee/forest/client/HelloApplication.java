package com.xzkingdee.forest.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qy
 * @date Created in 2020/8/25
 **/
@RestController
public class HelloApplication {

    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "hello gradle!";
    }
}
