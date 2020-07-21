package com.xzkingdee.stream;

import java.util.Optional;

/**
 * @author qy
 * @date 2020/7/21
 */
public class OptionalLearn {

    public static void optionConstrution(String str) {
        Optional<String> s1 = Optional.ofNullable(str);
        //if (null != s) {
        //    System.out.println(s);
        //}
        s1.ifPresent(System.out::println);
    }

    public static void optionOrElse(String str){
        Optional<String> s1 = Optional.ofNullable(str);
        //if (null == s) {
        //    System.out.println(s);
        //}
        System.out.println(s1.orElse("ni hao a shi jie"));
    }

    public static void optionOrThrow(String str)throws Exception{
        Optional<String> str1 = Optional.ofNullable(str);
        System.out.println(str1.orElseThrow(()->new Exception("string not found")));
    }
}
