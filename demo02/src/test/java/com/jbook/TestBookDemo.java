package com.jbook;

import com.letcode.jbook.TestArgs;
import org.junit.Test;

/**
 * @author qy
 * @date Created in 2020/8/25
 **/
public class TestBookDemo {

    @Test
    public void testArgs(){
        TestArgs.argsTransfer(new String[]{"1","2"});
    }
}
