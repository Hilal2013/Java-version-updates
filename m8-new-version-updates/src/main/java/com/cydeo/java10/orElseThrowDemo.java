package com.cydeo.java10;

import java.util.Optional;

public class orElseThrowDemo {
    public static void main(String[] args) {

        Optional<String> str=Optional.empty();
 /*     //  System.out.println(str.get());//NoSuchElementException
        if(str.isPresent()){
            System.out.println(str.get());
        }else{
            //exception handling
        }

 */
        //get is directly returning  it doesnt check if it is present or not.
        // But orElseThrow is already checking if the value is null or nott//
//you can directly

       // System.out.println(str.orElseThrow());//NoSuchElementException

        System.out.println(str.orElseThrow(()-> new RuntimeException()));
        //here you can give your custom exception
    }


}
