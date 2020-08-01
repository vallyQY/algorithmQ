package completable;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;

import static java.util.concurrent.Executors.newSingleThreadExecutor;

/**
 * @author qy
 * @date Created in 2020/7/22
 **/
public class CompletableFutureTest {

    @Test
    public void testApply(){
        String world = CompletableFuture.supplyAsync(() -> "hello ")
                .thenApply(s -> s.concat("world")).getNow("hi");
        System.out.println(world);
    }

    @Test
    public void testAccept() {
        CompletableFuture.supplyAsync(() -> "hello ").thenAccept(s -> System.out.println(s.concat("world")));
    }

    @Test
    public void testRun() {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello";
        }).thenRun(() -> System.out.println("hello world"));
        while (true) {
        }
    }

    public void testConstrution() {
        // 直接创建
        CompletableFuture c0 = new CompletableFuture();
        // 直接创建一个已经做完的线程
        CompletableFuture c1 = CompletableFuture.completedFuture("cake");
        // 无返回值异步任务，会采用内部forkjoin线程池
        CompletableFuture c2 = CompletableFuture.runAsync(() -> {
        });
        // 无返回值异步任务，采用定制的线程池
        CompletableFuture c3 = CompletableFuture.runAsync(() -> {
        }, newSingleThreadExecutor());
        // 返回值异步任务，采用定制的线程池
        CompletableFuture c4 = CompletableFuture.supplyAsync(() -> "cake", newSingleThreadExecutor());
        // 返回值异步任务，采用内部forkjoin线程池
        CompletableFuture c5 = CompletableFuture.supplyAsync(() -> "cake");
        // 只要有一个完成，则完成，有一个抛异常，则携带异常
        CompletableFuture.anyOf(c1, c2, c3, c4, c5);
        // 当所有的 future 完成时,新的 future 同时完成
        // 当某个方法出现了异常时,新 future 会在所有 future 完成的时候完成,并且包含一个异常.
        CompletableFuture.allOf(c1, c2, c3, c4, c5);
    }

    @Test
    public void noonBreak() {
        // 返回值异步任务，采用定制的线程池
        CompletableFuture.supplyAsync(() -> {
            System.out.println("订外卖");
            return "caijianbing";
        }).thenApplyAsync(cake -> {
            System.out.println("外卖在配送中...");
            System.out.println("我继续工作中...");
            return "running...";
        }).thenAcceptAsync(milk -> {
            System.out.println("收到外卖");
        }).thenRunAsync(() -> {
            System.out.println("吃外卖，睡午觉");
        });
        while (true) {
        }
    }
}
