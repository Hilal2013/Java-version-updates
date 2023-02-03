package com.cydeo.Tasks;

import java.util.stream.Stream;

public class Fibonacci {

    public static void main(String[] args) {

        int sum = 0;
        int previousNumber = 0;
        int nextNumber = 1;
//1 1 2 3 5 8 13
        for (int i = previousNumber; i < 20; i++) {
            sum = previousNumber + nextNumber;//0+1=1 //1+1=2// 1+2//2+3//3+5
            previousNumber = nextNumber;//1//1//2//3//5
            nextNumber = sum;//next number=1//2//3//5//8
            System.out.print(previousNumber + " ");//1 1 2 3 5 8

        }
        System.out.println();
       //depends on my forloop solution
            Stream.iterate(new int[]{0, 1},
                            t -> new int[]{t[1], t[0] + t[1]})
                    //previous number wil be next number, next number will be sum
                    .limit(20)
                    .forEach(t -> System.out.println("(" + t[0] + "," + t[1] + ")"));

        Stream.iterate(new int[]{0, 1},
                        t -> new int[]{t[1],t[0] + t[1]})
                .limit(20)
                .map(t -> t[0])
                //we can print just previous numbers
                .forEach(System.out::println);

        }

}
