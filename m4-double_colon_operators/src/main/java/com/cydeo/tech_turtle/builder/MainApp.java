package com.cydeo.tech_turtle.builder;

public class MainApp {
    public static void main(String[] args) {
        Animal animal1=new Animal("HOOK",10,"Dog",10,"white");
        Animal animal2=Animal.builder().age(10).color("white").build();//it will create an object
        System.out.println("animal2 = " + animal2);
        //animal2 = Animal(name=null, age=10, type=null, weight=0, color=white)
    }
}
