package com.cydeo.taskAppleFarm;

public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
       return apple.getWeight()>200;//check it is greater than 200
    }
}
