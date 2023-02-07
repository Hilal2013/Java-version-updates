package com.cydeo.java14;

public record User(String name, String address) {
    // you ca create no arg cons
    public User{}

    //now you have
    //ALL ARG CONST
    //GETTER
    //TO STRING
    //EQUALS
    //HASH CODE

   // but there is no Setter why because it is immutable, final
}
