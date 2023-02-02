package com.cydeo.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairsOfNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> numbers1 = Arrays.asList(1,2,3);
        List<Integer> numbers2 = Arrays.asList(3,4);
//Task 1
        System.out.println("return a list of the square of each number");
numbers= numbers.stream()
        .map(each->each*each)
        .collect(Collectors.toList());
       System.out.println(numbers);//[1, 4, 9, 16, 25]
        //Task2
//first solution
        List<int[]> pairs =
                numbers1.stream()
                .flatMap(i->numbers2.stream()
                        .map(j->new int[]{i,j}))
                        .collect(Collectors.toList());
        System.out.println(pairs);
    }
}
/*
1. Given a list of numbers how would you return a list of the square of each
number? For example, given [1,2,3,4,5] you should return [1,4,9,16,25]
2. Given two lists of numbers, how would you return all pairs of numbers? For
example, given a list [1,2,3] and a list [3,4] you should return [(1,3),(1,4),(2,3),
(2,4),(3,3),(3,4)
• List<Integer> numbers1 = Arrays.asList(1,2,3);
• List<Integer> numbers2 = Arrays.asList(3,4);
• List<int[]> pairs = ????
 */