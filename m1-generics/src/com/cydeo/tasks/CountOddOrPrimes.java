package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CountOddOrPrimes {
    public static void main(String[] args) {
        List<Integer> ci = Arrays.asList(1, 2, 3, 4);
        System.out.println("Number of odd integers = " );


    }


    public static void countOddIf(){

    }
    public static void countPrime(){

    }

}






/*
Write a generic method to count the number of elements in a collection that
have a specific property (for example, odd integers, prime numbers).
Use following interface in your solution as well:
Sample output:
public interface UnaryPredicate<T> {
 public boolean test(T obj);
}
List<Integer> ci = Arrays.asList(1, 2, 3, 4);
int count = countIf(ci, new OddPredicate());
System.out.println("Number of odd integers = " + count);

 */