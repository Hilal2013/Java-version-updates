package com.cydeo.Tasks.dish;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DishTest {
    public static void main(String[] args) {

//Print all dish’s name that has less than 400 calories
        System.out.println("Print all dish’s name that has less than 400 calories");
        DishData.getAll().stream()
                .filter(each->each.getCalories()<400)
                .map(Dish::getName)
               // .map(each->each.getName())
                .forEach(System.out::println);//rice //fruit //prawns
 //Print the length of the name of each dish
        System.out.println("Print the length of the name of each dish");
        DishData.getAll().stream()
                .map(each->each.getName().length())
                //.map(Dish::getName)
                //.map(String::length)
                .forEach(System.out::println);

        System.out.println("Print three high caloric  dish’s name (>300)");
      // DishData.getAll().sort(Comparator.comparing(Dish::getCalories));

        DishData.getAll().stream()
                .filter(each->each.getCalories()>300)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())//pork beef pizza
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("Print all dish name that are below 400 calories in sorted");
         DishData.getAll().stream()
                .filter(each->each.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
              //  .sorted(Comparator.comparing(each->each.getCalories())
                 .map(Dish::getName)
                .forEach(System.out::println);//rice prawns fruit




    }
}
