package com.cydeo;

public enum Operation {
    PLUS,MINUS,MULTIPLY,DIVIDE; //each constant is object(new) of Operation
// how can assign value to enum constants/Can I assign?
    Operation() {
        System.out.println("constructor");//we created 4 objects so when we call in method it will print 4 times constructor
        //each new keyword(new object) executes constructor
    }
    //constructor cannot be public. is gonna be private
}
