package com.xzkingdee.stream;

import com.xzkingdee.stream.entity.CustBook;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author qy
 * @date Created in 14:28 2020/7/1
 **/
class StreamSupportDemo {

    static List<CustBook> generateElements(){
        return Stream.generate(()->new CustBook("Harry")).limit(1000).collect(Collectors.toList());
    }

    static String callMethod(Spliterator<CustBook> spliterator) {
        int current = 0;
        while (spliterator.tryAdvance(custBook -> custBook.setBookName("Harry".concat("Poter")))) {
            current++;
        }
        return Thread.currentThread().getName() + ":" + current;
    }
}
