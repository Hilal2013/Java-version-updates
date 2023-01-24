package com.cydeo.taskAppleFarm;

public interface ApplePredicate { //why it is interface?There might be bunch of actions/for different behaviors
    boolean test(Apple apple);
}
