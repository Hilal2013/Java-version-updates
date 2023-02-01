package com.cydeo;

import com.cydeo.Tasks.dish.Dish;
import com.cydeo.Tasks.dish.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {
        System.out.println("ALl MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        //allof them needs to match with the condition
        System.out.println(isHealthy);//true

        System.out.println("Any Match");
        //if any data any of them matches with condition it willl return true
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is vegetarian friendly");
        }
        System.out.println("Non Match");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
//none of them element match with condition
        //all of them not matching
        System.out.println(isHealthy2);//true
        System.out.println("Find Any");//no parameter return optional
        //optional because to prevent nulllpointerexception
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);
        //Optional[Dish(name=fries, vegetarian=true, calories=530, type=OTHER)]
        //get method returning object not as an optional/Java
        System.out.println(dish.get());//it just picking random
        //Dish(name=fries, vegetarian=true, calories=530, type=OTHER)

        System.out.println("Find First");

        Optional<Dish> dish1 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish1.get());
        System.out.println("Parallel Streams(Async)");
        System.out.println(IntStream.range(0, 100).parallel().findAny());//OptionalInt[62]//it is Async
        System.out.println(IntStream.range(0, 100).parallel().findFirst());//OptionalInt[0]

//IntStream it is creating number 0-100

        List<String> list1= Arrays.asList("Johhny","David","Jack","DAny","Julia");
        List<String> list2= Arrays.asList("Johhny","David","Jack","DAny","Julia");
        Optional<String> findFirst=  list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
   Optional<String> findAny=  list2.parallelStream().filter(s->s.startsWith("J")).findAny();
        System.out.println(findFirst.get());//david
        System.out.println(findAny.get());//jack

        System.out.println("min and Max");
     Optional<Dish> dmin=   DishData.getAll().stream()
                .min(Comparator.comparing(Dish::getCalories));//it sorts and gives min
        System.out.println(dmin.get());//Dish(name=fruit, vegetarian=true, calories=120, type=OTHER)

        Optional<Dish> dmax=   DishData.getAll().stream()
                .max(Comparator.comparing(Dish::getCalories));//it sorts and gives min
        System.out.println(dmax.get());//Dish(name=pork, vegetarian=false, calories=800, type=MEAT)

    }

}
