package ziegler.learn.stream;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test {

    @org.junit.Test
    public void of(){
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        integerStream.forEach(n -> System.out.println(n));
    }

    @org.junit.Test
    public void of2(){
        Stream<String> integerStream = Stream.of("A");

        integerStream.forEach(n -> System.out.println(n));
    }

    @org.junit.Test
    public void iterate(){
        Stream.iterate(1, item -> item + 1)
                .limit(10)
                .forEach(System.out::println);
    }


    @org.junit.Test
    public void generator(){
        Stream<Double> generateA = Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return java.lang.Math.random();
            }
        }).limit(10);

        generateA.forEach(n -> System.out.println(n));
    }

    @org.junit.Test
    public void generator2(){
        Stream<Double> generateB = Stream.generate(()-> java.lang.Math.random()).limit(10);

        generateB.forEach(n -> System.out.println(n));
    }

    @org.junit.Test
    public void generator3(){
        Stream<Double> generateC = Stream.generate(java.lang.Math::random).limit(10);

        generateC.forEach(n -> System.out.println(n));
    }

    @org.junit.Test
    public void array(){
        int ids[] = new int[]{1, 2, 3, 4};
        Arrays.stream(ids)
                .forEach(System.out::println);
    }

    @org.junit.Test
    public void concat(){
        Stream.concat(Stream.of(1, 2, 3), Stream.of(4, 5))
                .forEach(integer -> System.out.print(integer + "  "));
    }

    @org.junit.Test
    public void distinct(){
        Stream.of(1,2,3,1,2,3)
                .distinct()
                .forEach(System.out::println); // 打印结果：1，2，3
    }

    @org.junit.Test
    public void filter() {
        Stream.of(1, 2, 3, 4, 5).filter(item -> item > 3).forEach(n -> System.out.println(n + " "));
    }

    @org.junit.Test
    public void testEncode() {
        System.out.println("你好，世界！！！");
    }

    @org.junit.Test
    public void map() {
        Stream.of("a", "b", "c").map(item -> item.toUpperCase()).forEach(System.out::println);
    }

    @org.junit.Test
    public void map2() {
        Stream.of("1", "2", "3").mapToInt(item -> Integer.valueOf(item)).forEach(System.out::println);
        Stream.of("100000000000", "200000000000", "300000000000").mapToLong(item -> Long.valueOf(item))
                .forEach(System.out::println);
        Stream.of("100000000000", "200000000000", "300000000000").mapToDouble(item -> Double.valueOf(item))
                .forEach(System.out::println);
    }

    @org.junit.Test
    public void flatMap() {
        Stream.of(1, 2, 3).flatMap(n -> Stream.of(n * 10)).forEach(System.out::println);
        Stream.of(1, 2, 3).flatMap(n -> n>1?Stream.of(n * 10) : null).forEach(System.out::println);
    }

    @org.junit.Test
    public void peek() {
        Stream.of(1, 2, 3, 4, 5).peek(n -> System.out.println("accept:" + n)).forEach(System.out::println);

    }

    @org.junit.Test
    public void peek2() {
        Stream.of(1, 2, 3, 4, 5).peek(n -> System.out.println("accept:" + n)).filter(n -> n > 2)
                .forEach(System.out::println);
    }
}
