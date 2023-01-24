package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class Question4 {
    List<Integer> list = Arrays.asList(1, 2, 3, 4,5,6,7);
    public static void print(List<? extends Number> list) {//
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }


}
/*
Will the following method compile? If not, why?
public static void print(List<? extends Number> list) {
 for (Number n : list)
 System.out.print(n + " ");
 System.out.println();
}

 */