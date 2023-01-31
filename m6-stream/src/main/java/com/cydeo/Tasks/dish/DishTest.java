package com.cydeo.Tasks.dish;

import java.util.Arrays;
import java.util.List;

public class DishTest {
    public static void main(String[] args) {
        List<Dish> menu = Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.OTHER),
                new Dish("rice",true,350,Type.OTHER),
                new Dish("fruit",true,120,Type.OTHER),
                new Dish("pizza",true,550,Type.OTHER),
                new Dish("prawns",false,300,Type.FISH),
                new Dish("salmon",false,450,Type.FISH)
        );
//Print all dish’s name that has less than 400 calories
        menu.stream()
                .filter(each->each.getCalories()<400)
                .forEach(Dish::getName);
//.forEach(each->each.getName());

 //Print the length of the name of each dish



        //Print three high caloric  dish’s name (>300)

        //Print all dish name that are below 400 calories in sorted


    }
}
