package com.xzkingdee.design.single;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

/**
 * @author qy
 * @date Created in 2020/8/20
 **/
public class EmperorTest {

    @Test
    public void test() {
        System.out.println("First Day:");
        Emperor emperor1 = Emperor.getEmperor();
        System.out.println(emperor1.getEmperorYearNumber());

        System.out.println("Second Day:");
        Emperor emperor2 = Emperor.getEmperor();
        System.out.println(emperor2.getEmperorYearNumber());

        System.out.println("Third Day:");
        Emperor emperor3 = Emperor.getEmperor();
        System.out.println(emperor3.getEmperorYearNumber());
    }

    @Test
    public void testMultiply() {
        List<String> diffCountries = Lists.newArrayList("1", "2", "3");
        diffCountries.parallelStream().forEach(str -> {
            EmperorMulThread mulThread = EmperorMulThread.getEmperor();
            System.out.println(mulThread.hashCode());
            System.out.println("---not support multiply threads---");
            Emperor emperor = Emperor.getEmperor();
            System.out.println(emperor.hashCode());
        });
    }
}
