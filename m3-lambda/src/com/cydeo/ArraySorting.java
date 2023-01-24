package com.cydeo;

import java.sql.SQLOutput;

public class ArraySorting {

    public static void main(String[] args) {//QuickSort//BubbleSort
        ArraySorting as = new ArraySorting();//we are creating object through class
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);//Quick Sorting//we call method through object
        as.sort(bs);//Bubble Sorting

        System.out.println("Lambda expression");
        //our type is interface
        Sorting quickSort=()-> System.out.println("Quick Sorting");
        as.sort(quickSort); //Quick Sorting
        as.sort(() -> System.out.println("Quick Sorting"));//Quick Sorting

    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }

}
