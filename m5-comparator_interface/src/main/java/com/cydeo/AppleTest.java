package com.cydeo;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;//if we do this import// no need Class.

public class AppleTest {

    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));
        inventory.add(new Apple(80, Color.YELLOW));
        inventory.add(new Apple(120, Color.YELLOW));
//im trying to compare to weights// give me the each object
        Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);
        System.out.println("Method Reference");
        //through method reference//// we know Apple make simplifier no need Apple
        Comparator<Apple> sortApple1 = comparing(Apple::getWeight);
        inventory.sort(sortApple1);
        System.out.println(inventory);
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);
//[Apple(weight=50, color=RED), Apple(weight=80, color=YELLOW),
        //   Collections.sort(inventory,sortApple1);
        //  System.out.println(inventory);
     //   Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());//it gives eror
        //this static method how ca we do without calling class //make static import
        Comparator<Apple> sortApple2= comparing((Apple apple) -> apple.getWeight());
       // before Comparator.compare now (afterimport static) no need Comparator.
        System.out.println("Reversed");
        inventory.sort(comparing(Apple::getWeight).reversed());//it wil give reversed order
        System.out.println(inventory);
//[Apple(weight=300, color=GREEN), Apple(weight=200, color=GREEN)....
        System.out.println("Chaining");
        inventory
                .sort(comparing(Apple::getWeight)
                        .reversed()
                        .thenComparing(Apple::getColor));
        System.out.println(inventory);

    }
}
