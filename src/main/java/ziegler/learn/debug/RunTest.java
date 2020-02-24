package ziegler.learn.debug;

import java.util.stream.Stream;

public class RunTest {

    void printTrackTest() {
        // 1.打印调用堆栈
        RuntimeException e = new RuntimeException("print stacktrace");
       // e.fillInStackTrace();

        System.out.println("1.打印调用堆栈");
        Stream.of(e.getStackTrace()).forEach(System.out::println);

        // 2.打印调用堆栈
        System.out.println("2.打印调用堆栈");
        Stream.of(Thread.currentThread().getStackTrace()).forEach(System.out::println);
    }
}
