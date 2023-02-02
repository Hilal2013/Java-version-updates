package com.cydeo.tech_turtles;

public enum Days {
    //name of convantion
    //static final unchangeable variable
    MONDAY(1),TUESDAY(2),WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;

    String value;
    int index;

    Days() {
    }

    Days( int index) {

        this.index = index;
    }
}
