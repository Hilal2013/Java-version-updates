package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {

        String s ;
        s = "Ozzy";
//why I need mention agin it is so obiviuos that it is String
        var str = "Cydeo";
//you can use this for local variables we cant use for instance variables
        var number = 5;//understand as an int

        byte x = 1;
        var y = 1; //int

        var price = 12.50;

        var numbers = Arrays.asList(3,4,5,6);
//we dont need to mention type
        var sum = 0;
        for(var eachNumber : numbers){
            sum = sum+eachNumber;
        }




    }
}
