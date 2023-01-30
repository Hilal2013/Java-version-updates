package com.cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,0,15,5,20);
        System.out.println(list);//[10, 0, 15, 5, 20]
//sort it
        Collections.sort(list);
        System.out.println(list);//[0, 5, 10, 15, 20]
//Descending
//Why they put the comporative interface here// Because we are gonna pass different behaviors
        Collections.sort(list,new MyComparator());
        System.out.println(list);//[20, 15, 10, 5, 0]

        System.out.println("Lambda");

        Comparator<Integer> equal=(o1, o2) -> (o1>o2)? -1 :(o1<o2) ?  1: 0;
        System.out.println(equal.compare(25,25));//0

        Collections.sort(list,(o1, o2) -> (o1>o2)? -1 :(o1<o2) ?  1: 0);
        System.out.println(list);//[20, 15, 10, 5, 0]

        //Ascending order //CompareTo()method
      //  Collections.sort(list,(o1,o2)->o1.compareTo((o2)));
     //   System.out.println(list);//[0, 5, 10, 15, 20]
        list.sort((o1,o2)->o1.compareTo((o2)));
        System.out.println(list);//[0, 5, 10, 15, 20]
        //Descending order //CompareTo()method
        list.sort((o2,o1)->o1.compareTo((o2)));
        System.out.println(list);//[20, 15, 10, 5, 0]
    }
}
