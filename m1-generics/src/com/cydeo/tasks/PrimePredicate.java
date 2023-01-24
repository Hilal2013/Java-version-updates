package com.cydeo.tasks;

public class PrimePredicate implements UnaryPredicate<Integer>{
    @Override
    public boolean test(Integer obj) {

        for (int i = 2; i < obj; i++) {
            return obj%i != 0;
            }
       return false;
    }
}
/*
 if (num < 2) {
        return false;
    }

    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            return false;
        }
 */