package com.xzkingdee.design.single;

/**
 * @author qy
 * @date Created in 2020/8/20
 **/
public class EmperorMulThread {
    private static final EmperorMulThread emperor = new EmperorMulThread();

    private EmperorMulThread(){}

    public synchronized static EmperorMulThread getEmperor(){
        return emperor;
    }
}
