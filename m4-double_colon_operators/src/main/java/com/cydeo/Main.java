package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
//lambda review
        //     Predicate<Integer> pred= (p)->p%2==0 ? true:false;

        Calculate sum = (x, y) -> System.out.println(x + y);
//look at calculator class there are two methods
//can I pass the other method if it is same signature you can // method is static
        Calculate sum1 = (x, y) -> Calculator.findSum(x, y);
        //Reference to Static method     //Double Colon
        Calculate sum2 = Calculator::findSum;

        sum2.calculate(10, 20);//look interface abstract method//Sum= 30

        //the other method is instance
        //Reference to Instance method
        //create an object
        Calculator obj = new Calculator();
        Calculate multiply = obj::findMultiply;
        multiply.calculate(10, 20);//Multiply= 200

        //for ready FunctionalInterface

        BiFunction<String,Integer,String> func=(str,i)->str.substring(i);
        //where the substring method is // coming from string class
        //substring method is not static
        BiFunction<String,Integer,String> func1=String::substring;

        System.out.println(func1.apply("Cydeo",3));//eo

//in myclass there is method//instance method so create new object//i wanna use double colon
        Function<Integer,Double> b=new MyClass() :: method;
        System.out.println( b.apply(2));//5.0
BiFunction<MyClass,Integer,Double> b1=MyClass :: method;
//if you have functional inteface //and accepting class as a parameter no need new
//im already mentioning my class so no need new myClass
        //like String class we dont need object



    }

}
