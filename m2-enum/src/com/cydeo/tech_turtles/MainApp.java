package com.cydeo.tech_turtles;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {

        System.out.println(Days.MONDAY);
        System.out.println(Days.values());
//[Lcom.cydeo.tech_turtles.Days;@1d251891
        //address of the heap
        System.out.println(Arrays.toString(Days.values()));

//[MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY]    }
    }
}