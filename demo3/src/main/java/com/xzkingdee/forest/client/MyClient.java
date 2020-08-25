package com.xzkingdee.forest.client;

import com.dtflys.forest.annotation.DataParam;
import com.dtflys.forest.annotation.DataVariable;
import com.dtflys.forest.annotation.Request;

/**
 * @author qy
 * @date Created in 2020/8/20
 **/
public interface MyClient {

    /**
     * 通过@Request注解，将simpleRequest()接口绑定一个http请求
     * 默认是get方式，且将请求后的数据以String方式返回
     *
     * @return string
     */
    @Request(url = "http://localhost:5000/hello")
    String simpleRequest();

    /**
     * http请求方式:GET,POST,PUT,HEAD,OPTIONS,DELETE
     *
     * @return string
     */
    @Request(url = "http://localhost:5000/hello/user",
            type = "POST")
    String simplePost();

    /**
     * 注解@DataParam作用是，在传入入参userName时，自动将userName值加入到http的请求参数中
     *
     * @param userName 用户名
     * @return string
     */
    @Request(url = "http://localhost:5000/hello/user",
            headers = "Accept: text/plan")
    String sendRequest(@DataParam("uname") String userName);

    /**
     * 支持多个请求头
     * <p>
     * GET http://localhost:5000/hello/user
     * HEADER:
     * Accept-Charset: utf-8
     * Content-Type: text/plain
     *
     * @return string
     */
    @Request(url = "http://localhost:5000/hello/user",
            headers = {
                    "Accept-Charset: utf-8",
                    "Content-Type: text/plain"
            })
    String multipleHeaders();

    /**
     * 绑定请求头
     * <p>
     * GET http://localhost:5000/hello/user
     * HEADER:
     * Accept-Charset: gbk
     * Content-Type: text/plain
     *
     * @param encoding 编码方式
     * @return String
     */
    @Request(
            url = "http://localhost:5000/hello/user",
            headers = {
                    "Accept-Charset: ${encoding}",
                    "Content-Type: text/plain"
            }
    )
    String bindingHeader(@DataVariable("encoding") String encoding);


    /**
     * 通过data属性绑定参数。仅支持post，put，patch请求
     * <p>
     * POST http://localhost:5000/hello/user
     * HEADER:
     * Accept: text/plan
     * BODY:
     * username=foo&password=bar
     *
     * @param username 用户名
     * @param password 密码
     * @return string
     */
    @Request(url = "http://localhost:5000/hello/user",
            type = "POST",
            data = "username=${0}&password={1}",
            headers = {"Accept:text/plan"}
    )
    String dataPost(String username, String password);


}
