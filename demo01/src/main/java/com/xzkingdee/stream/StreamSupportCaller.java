package com.xzkingdee.stream;

import com.google.common.collect.Lists;
import com.xzkingdee.stream.entity.CustBook;

import java.util.Spliterator;

/**
 * @author qy
 * @date Created in 14:39 2020/7/1
 **/
public class StreamSupportCaller {

    public static void main(String[] args) {
        //testMethods();
        testSplit();
    }

    private static void testMethods(){
        Spliterator<CustBook> originalSpliterator = StreamSupportDemo.generateElements().spliterator();
        Spliterator<CustBook> nextSpliterator = originalSpliterator.trySplit();

        System.out.println("before tryAdvance:"+originalSpliterator.estimateSize());
        System.out.println("trySplit:"+nextSpliterator.estimateSize());
        System.out.println("Characteristics:"+originalSpliterator.characteristics());
        System.out.println(StreamSupportDemo.callMethod(originalSpliterator));
        System.out.println(StreamSupportDemo.callMethod(nextSpliterator));
        System.out.println("after tryAdvance:"+originalSpliterator.estimateSize());
    }

    private static void testSplit(){
        Spliterator<String> sample = Lists.newArrayList("10", "2", "3", "4").spliterator();
        Spliterator<String> sampleChild1 = sample.trySplit();
        Spliterator<String> sampleChild2 = sample.trySplit();

        sample.forEachRemaining(System.out::println);
        System.out.println("===");
        sampleChild1.forEachRemaining(System.out::println);
        System.out.println("===");
        sampleChild2.forEachRemaining(System.out::println);
    }
}
