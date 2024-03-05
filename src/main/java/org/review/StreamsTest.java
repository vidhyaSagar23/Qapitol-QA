package org.review;

import org.basics.operators.Operators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamsTest {
    public static void main(String[] args) {

        List<Integer> list=Arrays.asList(10,30,30,10,567,89);

        System.out.println("\nSort method");
        Stream<Integer> data=list.stream().sorted();
        data.forEach(n-> System.out.print(n+" "));

        System.out.println("\nMap method");
        list.stream().map(n-> n*2).forEach(n-> System.out.print(n+" "));

        System.out.println("\nFilter method");
        list.stream().filter(n-> n%2==1).forEach(n-> System.out.print(n+" "));

        System.out.println("\nmax");
        Optional<Integer> max =list.stream().max(Comparator.naturalOrder());
        System.out.println(max);

        System.out.println("\nmin");
        Optional<Integer> min =list.stream().min(Comparator.naturalOrder());
        System.out.println(min);

        System.out.println("distinct");
        list.stream().distinct().forEach(n-> System.out.println(n));
    }
}
