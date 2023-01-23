package com.cydeo;
import java.lang.Enum;
public enum Currency {
    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);//not mandotory to put semi colon ; if you add some variables etc you shoul put semicolon
    //Everything you put in the enum  is a constant object of this class
//penny is an constant object of currency class
//quarter is an constant object of currency class
    //How im gonna accesss

    //we can add constructor or variables
    // how can assign value to enum constants/Can I assign?
    private int value;//how can access create getter

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
