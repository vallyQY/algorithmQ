package com.xzkingdee.design.stategy;

import com.xzkingdee.design.strategy.executor.SilkBag;
import com.xzkingdee.design.strategy.plan.FakeNew;
import com.xzkingdee.design.strategy.plan.Propaganda;
import org.junit.Test;

/**
 * @author qy
 * @date Created in 2020/8/20
 **/
public class StrategyTest {

    @Test
    public void test(){
        SilkBag silkBag;

        silkBag = new SilkBag(new Propaganda());
        silkBag.execute();

        silkBag = new SilkBag(new FakeNew());
        silkBag.execute();
    }
}
