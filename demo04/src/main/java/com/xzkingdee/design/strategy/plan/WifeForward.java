package com.xzkingdee.design.strategy.plan;

/**
 * @author qy
 * @date Created in 2020/8/20
 **/
public class WifeForward implements IStrategy{
    @Override
    public void operator() {
        System.out.println("Third step:wife come forward,enemy back");
    }
}
