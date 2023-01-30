package com.cydeo;

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
        //through method reference
        Comparator<Apple> sortApple1 = comparing(Apple::getWeight);
        inventory.sort(sortApple1);
        System.out.println(inventory);
        inventory.sort(comparing(Apple::getWeight));
        System.out.println(inventory);

        //   Collections.sort(inventory,sortApple1);
        //  System.out.println(inventory);
// we know Apple make simplifier
     //   Comparator<Apple> sortApple = comparing((Apple apple) -> apple.getWeight());//it gives eror
        //this static method how ca we do without calling class //make static import
        Comparator<Apple> sortApple2= comparing((Apple apple) -> apple.getWeight());
       // before Comparator.compare now (afterimport static) no need Comparator.

        //Do I need Apple ->no



    }
}
