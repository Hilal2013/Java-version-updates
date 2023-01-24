package com.cydeo.tasks;

public class OddPredicate<T> implements UnaryPredicate<Integer>{

     @Override
     public boolean test(Integer obj) {
          return obj%2!=0;
     }
}
