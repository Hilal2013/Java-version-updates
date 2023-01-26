package com.cydeo;

import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {

        System.out.println("************PREDICATE***************");
        //   Predicate<T>
        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));

        System.out.println("************CONSUMER***************");
        //Consumer<T>
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);

        System.out.println("************BI CONSUMER***************");
        //BiConsumer<T, U>
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);

        System.out.println("************FUNCTION***************");
        // Function<T, R>
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));

        System.out.println("************BI FUNCTION***************");
//BiFunction<T, U, R>
        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        System.out.println(func.apply(2, 3));

        System.out.println("************SUPPLIER***************");

//Supplier<T>  //doesnt get any parameter and returns something T->returntype
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());


    }

}
