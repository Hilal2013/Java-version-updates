package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class CountOddOrEvenOrPrimes {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4,5,6,7);
        int count = countIf(list, new OddPredicate());
        System.out.println("Number of odd integers = "+count);//Number of odd integers = 4
        System.out.println(countIf(list,new EvenPredicate()));//3
        System.out.println(countIf(list,new PrimePredicate()));//3
    }

    //i need integerit wont change so  why i need generic I can have different classes find prime find even numbers
// that method can accept both of the classes
    //You write a method which is one parameter accepting an object belongs to old predicate class and
// if you try to pass another object belongs to even predicate class this method wont accept
//List<T> maybe double
    private static <T> int countIf(List<T> list, UnaryPredicate<T> p) {
        int count = 0;
        for (T element : list) {
            if (p.test(element)) {
                count++;//++count;
            }
        }
        return count;
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