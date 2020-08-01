package com.xzkingdee.stream;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author qy
 * @date 2020/7/20
 */
public class StreamLearn {

    public static void consumerDemo() {
        Consumer former = System.out::println;
        Consumer next = o -> System.out.println(o + "-next");

        //执行完F后再执行F2的Accept方法
        former.andThen(next).accept("QY");
    }

    public static void functionDemo() {
        Function<Integer, Integer> f1 = s -> s + 1;
        Function<Integer, Integer> f2 = s -> s * 3;

        System.out.println(f1.compose(f2).apply(1));
        System.out.println(f1.andThen(f2).apply(1));

        //identity方法会返回一个不进行任何处理的Function，即输出与输入值相等；
        System.out.println(Function.identity().apply(1));
    }

    public static void predicateDemo() {
        Predicate<String> p1 = str -> str.startsWith("a");
        Predicate<String> p2 = s -> s.length() > 5;

        System.out.println(p1.negate().and(p2).test("helloWorld"));
    }

    public static void streamConstruction() {
        Stream empty = Stream.empty();

        Stream integerStream = Stream.of(1, 2, 3, 4, 5);

        List<Integer> conList = Arrays.asList(1, 3, 5, 7, 9);
        Stream serialStream = conList.stream();
        Stream paralleStream = conList.parallelStream();

        System.out.println(empty);
        System.out.println(integerStream);
        System.out.println(serialStream);
        System.out.println(paralleStream);
    }

    public static void streamIterate() {
        //生成10个基数
        Stream.iterate(1, n -> n + 1).filter(n -> n % 2 == 1).limit(10).forEach(item -> System.out.print(item + "---"));
        System.out.println();
        //斐波那契数列
        Stream.iterate(new int[]{0, 1}, ints -> new int[]{ints[1], ints[0] + ints[1]})
                .limit(20)
                .map(n -> n[0])
                .forEach(ints -> System.out.print(ints + "---"));
        System.out.println();
        //斐波那契数列求和
        int sum = Stream.iterate(new int[]{0, 1}, ints -> new int[]{ints[1], ints[0] + ints[1]})
                .limit(10)
                .map(n -> n[0])
                .mapToInt(n -> n)
                .sum();
        System.out.println("Sum of the first ten columns:" + sum);
    }

    public static void streamGenerate() {
        Stream.generate(() -> Math.random() * 100).limit(10).forEach(item -> System.out.println(String.format("%.2f", item)));
    }

    /**
     * 每个元素添加后缀
     */
    public static void streamMap() {
        Stream<String> temp = Stream.of("a", "b", "c", "d", "e", "f");
        temp.map(str -> str.concat(".txt")).forEach(System.out::println);
    }

    /**
     * flatMap的使用
     */
    public static void streamFlatMap() {
        Stream<String> temp = Stream.of("hello", "world", "banana", "green");
        temp.flatMap(str -> Stream.of(str.split(""))).forEach(System.out::println);
    }

    public static void streamMaxMinAvg() {
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29);
        IntSummaryStatistics stats = primes.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());
    }
}
