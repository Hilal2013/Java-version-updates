package com.cydeo.tasks;

import java.util.Arrays;

public class SwapValues {

    public static void main(String[] args) {
        //I can use string array through generics//more dynamic
        Integer[] a = {1,2,3,4};
        String[] arr = {"Cydeo","to","Welcome"};
        swap(a,1,3);
        swap(arr,0,2);
        System.out.println(Arrays.toString(a)); //[1, 4, 3, 2]
        System.out.println(Arrays.toString(arr));//[Welcome, to, Cydeo]
    }
private static <T> void swap(T[] a ,int x,int y){
       T temp=a[x];
    a[x] = a[y];
    a[y] = temp;


}


}
//Write a generic method to exchange the positions of two different elements in
//array.