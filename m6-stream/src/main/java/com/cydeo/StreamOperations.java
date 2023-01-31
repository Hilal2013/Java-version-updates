package com.cydeo;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3,2, 4);
        //   list.forEach(x-> System.out.println(x));//we can convert double colon
        list.forEach(System.out::println);//1 //2 //3 //2 //4
//forEach coming Iterable interface
//FILter
        System.out.println("Filter");
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);//2 //2 //4
        //distinct methodFiltering unique elements//returns a ste =>remove duplicates
        System.out.println("Distinct");
        list.stream()
                .filter(i->i%2==0)
                .distinct()
                .forEach(System.out::println);//2  //4
/*
     Stream<Integer> str= list.stream()
                .filter(i->i%2==0)
                .distinct()
               str.forEach(System.out::println);
 */
        System.out.println("Limit");
        list.stream()
                .filter(i->i%2==0)
                .limit(1)
                .forEach(System.out::println);//2

        System.out.println("Skip");//
        list.stream()
                .skip(3)
                .forEach(System.out::println);//2 //4

        System.out.println("MAp");//
        list.stream()
                .map(number->number*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);//6


    }
}
