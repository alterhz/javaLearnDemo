package ziegler.learn.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class TestStream {

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
    public void flatMap2() {
        Stream<Integer> allInt = Stream.of(1, 2, 3, 4, 5);

        Stream<Integer> mapAllInt = allInt.map(o -> o * 10);

        //allInt.forEach(n -> System.out.print(n + " "));
        System.out.println();
        mapAllInt.forEach(n -> System.out.print(n + " "));
    }

    @org.junit.Test
    public void flatMap3() {
        Stream<Integer> allInt = Stream.of(1, 2, 3, 4, 5);

        //allInt.forEach(n -> System.out.print(n + " "));

        System.out.println();

        Stream<Integer> flatMapAllInt = allInt.flatMap(o -> Stream.of(o * 100));
        flatMapAllInt.forEach(n -> System.out.print(n + " "));
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

    @org.junit.Test
    public void skip() {
        Stream.of(1, 2, 3,4,5).skip(2).forEach(System.out::println);
    }

    @org.junit.Test
    public void sorted() {
        Stream.of(5, 2, 3, 4, 1).sorted().forEach(System.out::println);
        Stream.of(1, 2, 3, 4, 5).sorted().forEach(System.out::println);
    }

    @org.junit.Test
    public void sorted1() {
        Stream.of(1, 2, 3, 4, 5).sorted(Comparator.comparingInt(o -> o)).forEach(System.out::println);
    }

    @org.junit.Test
    public void sorted2() {
        Stream.of(1, 2, 3, 4, 5).sorted((o1, o2) -> o2 - o1).forEach(System.out::println);
    }


    @org.junit.Test
    public void count() {
        long count = Stream.of(1, 2, 3, 4, 5).count();
        System.out.println("count:" + count);
    }

    @org.junit.Test
    public void forEachOrdered() {
        Stream.of(5, 2, 3, 4, 1).forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream.of(5, 2, 3, 4, 1).forEachOrdered(n -> System.out.print(n + " "));
    }

    @org.junit.Test
    public void max() {
        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5).max(Comparator.comparingInt(o -> o));
        if (max.isPresent()) {
            System.out.println("max:" + max.get());
        }
    }

    @org.junit.Test
    public void min() {
        Optional<Integer> max = Stream.of(1, 2, 3, 4, 5).max((o1, o2) -> o2 - o1);
        if (max.isPresent()) {
            System.out.println("max:" + max.get());
        }
    }

    @org.junit.Test
    public void allMatch() {
        boolean allMatch = Stream.of(1, 2, 3, 4).allMatch(n -> n > 0);
        System.out.println("allMatch:" + allMatch);
    }

    @org.junit.Test
    public void anyMatch() {
        boolean allMatch = Stream.of(1, 2, 3, 4).anyMatch(n -> n > 3);
        System.out.println("anyMatch:" + allMatch);
    }

    @org.junit.Test
    public void noneMatch() {
        boolean noneMatch = Stream.of(1, 2, 3, 4, 5).noneMatch(n -> n > 10);
        System.out.println("noneMatch:" + noneMatch);

        boolean noneMatch2 = Stream.of(1, 2, 3, 4, 5).noneMatch(n -> n < 3);
        System.out.println("noneMatch2:" + noneMatch2);
    }

    @org.junit.Test
    public void findAny() {
        Optional<Integer> any = Stream.of(5, 2, 3, 4).findAny();
        System.out.println("findAny:" + any.get());
    }

    @org.junit.Test
    public void findFirst() {
        Optional<Integer> any = Stream.of(5, 2, 3, 4).findFirst();
        System.out.println("findFirst:" + any.get());
    }

    @org.junit.Test
    public void limit() {
        Stream.of(1, 2, 3,4,5)
                .limit(2)
                .forEach(System.out::println);
    }
}
