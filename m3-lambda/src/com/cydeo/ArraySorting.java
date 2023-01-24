package com.cydeo;

public class ArraySorting {

    public static void main(String[] args) {//QuickSort//BubbleSort
        ArraySorting as = new ArraySorting();//we are creating object through class
        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);//Quick Sorting//we call method through object
        as.sort(bs);//Bubble Sorting


    }

    private void sort(Sorting sorting) {
        sorting.sort();
    }

}
