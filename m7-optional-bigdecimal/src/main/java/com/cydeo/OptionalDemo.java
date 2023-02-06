package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,4,2,10,23);
      //optional is a class basically type//is returning like string like integer//optional
        //how you gonna create instance from that

        //empty() - isPresent() - Optional.of() methods check out

        Optional<String> empty =Optional.empty();
        System.out.println(empty);//Optional.empty
        System.out.println(empty.isPresent());//false//inside nothing returns false
        System.out.println(Optional.of(number));//Optional[[2, 4, 2, 10, 23]]
        System.out.println(Optional.of(number).isPresent());//true

    //    System.out.println(empty.get());// NoSuchElementException: No value present
//im not gonna throw null point exception
        //ifPresent() method//taking consumer
        Optional<Integer> bigNumber = number.stream()
                .filter(x -> x>100).findAny();
        bigNumber.ifPresent(System.out::println);//it didnt give error

        //get() method
      //  System.out.println(bigNumber.get());
//NoSuchElementException: No value present
        //orElse() method
       System.out.println(bigNumber.orElse(5));//5
   //that is one of the advantage     //if there is no condition existing get as a default for example 5
//you can give default value

//how we are gonna deal with the subject
        //of()
        Optional<Integer> intOptional = Optional.of(34);//34
//filter()
        Optional<Integer> evenIntOptional = intOptional.filter(i -> i%2==0);
        System.out.println(evenIntOptional.orElse(0));


      //  FactoryMethodsDemo f1 = new FactoryMethodsDemo();

    }

}
