package com.xzkingdee.design.single;

/**
 * @author qy
 * @date Created in 2020/8/20
 **/
public class Emperor {
    private static Emperor emperor = null;

    private Emperor(){}

    public static Emperor getEmperor(){
        if (emperor == null) {
            return new Emperor();
        }
        return emperor;
    }

    public String getEmperorYearNumber(){
        return String.format("---%s:%d---","kangxi",61);
    }
}
