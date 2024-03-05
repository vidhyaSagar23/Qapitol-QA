package org.regex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamApiSamples {
    public static void main(String[] args) {

        List<Integer> a=Arrays.asList(56,44,66,54,75,12,33,43,43);

        Predicate<Integer> predicate=new Predicate<>() {
            @Override
            public boolean test(Integer i) {
                return i%2==1;
            }
        };

        Predicate<Integer> predi= n-> n%2==1;

        a.stream()
                .filter(predi)
                .sorted()
                .distinct()
                .map(n-> n*2)
                .forEach(n-> System.out.print(n+" "));
//
        a.stream()
                .filter(n-> n%2==1)
                .sorted()
                .distinct()
                .map(n-> n*2)
                .forEach(n-> System.out.print(n+" "));
//
//        Stream<Integer> data=a.stream().sorted().distinct();
//        Stream<Integer>mappedData =data.map(n-> n*2);
//        mappedData.forEach(n-> System.out.print(n+" "));

//        To find max number

//       Optional<Integer> data=a.stream().max(Comparator.naturalOrder());
//       data.ifPresent(d-> System.out.println(d));

//        to find min
//        a.stream().min(Comparator.naturalOrder()).ifPresent(d-> System.out.println(d));

//
//        int a[]={2,3,33,44,33,3,44,2,55,47,376};
//
//        int max= Arrays.stream(a).max().getAsInt();
//        System.out.println(max);
//
//        int min=Arrays.stream(a).max().getAsInt();
//        System.out.println(min);
//
//        int distinct[]=Arrays.stream(a).distinct().toArray();
//        System.out.println(Arrays.toString(distinct));
//
//        long count=Arrays.stream(a).count();
//        System.out.println(count);
//
//        long stringLength="vidhyasagar".chars().count();
//        System.out.println(stringLength);
//
//        String[] strings = {"apple", "banana", "orange", "grape"};
//        // Using streams to find the sum of lengths of strings in the array
//        int sumOfLengths = Arrays.stream(strings)
//                .mapToInt(String::length) // Convert each string to its length
//                .sum(); // Sum up the lengths
//
//        System.out.println("Sum of lengths of strings in the array: " + sumOfLengths);
//
//        String[] strings1 = {"apple", "banana", "orange", "grape", "apple", "banana"};
//
//        // Using streams to find the count of each distinct string in the array
//        Map<String, Long> counts = Arrays.stream(strings)
//                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//
//        System.out.println("Counts of each string in the array:");
//        counts.forEach((string, count1) -> System.out.println(string + ": " + count1));
    }
}
