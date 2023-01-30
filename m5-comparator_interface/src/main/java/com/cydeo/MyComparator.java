package com.cydeo;

import java.util.Comparator;

//behavioral parameterazation
public class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

       return (o1>o2)? -1 :(o1<o2) ?  1: 0;//descending
       // return (o1<o2)? -1 :(o1>o2) ?  1: 0;//ascending


    }
}
