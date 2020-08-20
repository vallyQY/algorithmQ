package com.xzkingdee.design.strategy.executor;

import com.xzkingdee.design.strategy.plan.IStrategy;

/**
 * @author qy
 * @date Created in 2020/8/20
 **/
public class SilkBag {
    private IStrategy strategy;

    public SilkBag(IStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.operator();
    }
}
