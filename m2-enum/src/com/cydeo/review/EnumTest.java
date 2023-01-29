package com.cydeo.review;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {

        User employee = new User("mikesmith", "Mike", Role.EMPLOYEE);

        System.out.println(employee);
//User{username='mikesmith', firstname='Mike', role=EMPLOYEE}
        System.out.println(Unit.POUNDS.value);//pounds
        System.out.println(Arrays.toString(Unit.values()));//[PCS, POUNDS, INCHES, MILES]


    }
}
