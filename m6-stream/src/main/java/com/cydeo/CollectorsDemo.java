package com.cydeo;

import com.cydeo.Tasks.dish.Dish;
import com.cydeo.Tasks.dish.DishData;
import com.cydeo.Tasks.dish.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 6, 7);

        System.out.println("toCollection(Supplier)");//is used to create collection usuing Collector

        List<Integer> numberList = numbers.stream()
                .filter(x -> x % 2 == 0)
                //now i need to capture these because i want to use them somewherelse
                .collect(Collectors.toCollection(ArrayList::new));
        //first stream.collect()//secondly=>toCollection method we call it through className(Collectors)
        //result will be new arrayList

        System.out.println(numberList);//[4, 6, 6]
        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x % 2 == 0)
                //now i need to capture these because i want to use them somewherelse
                .collect(Collectors.toCollection(HashSet::new));//
        System.out.println(numberSet);//[4, 6] doesnt allow duplication

        System.out.println("toList");
        //returns a Collector interface that gathers the input data into a new list
        List<Integer> numberList1 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numberList1);//[4, 6, 6]
        System.out.println("toSet");
        //returns a Collector interface that gathers the input data into a new Set
        Set<Integer> numberSer1 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());
        System.out.println(numberList1);//[4, 6, 6]????

        System.out.println("toMap(Funtion,Function)");
        //returns a Collector interface that gathers the input data into a new Map

        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println(dishMap);

        //{chicken=400, pizza=550, fruit=120, salmon=450, fries=530, beef=700, pork=800, rice=350, prawns=300}
        System.out.println("Counting()");
       // returns a Collector  that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());//3

        System.out.println(evenCount);

        System.out.println("summingInt(ToIntFunction)");
//returns a Collector that produces the sum of a Integer-valued func
      Integer sum=  DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);//4200

        System.out.println("averagingInt(ToIntFunction)");
        //returns the average of the integers passed valeues
        Double average= DishData.getAll().stream()
        .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(average);//466.6666666666667
        System.out.println("Joining");
//is used to join various elements of a character or string into a single object
List<String> courses=Arrays.asList("Java","JS","TS");
   String str=     courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);//Java,JS,TS

        System.out.println("partitioningBy()");
//is used to partition a stream of objects (or a set elements(based on a given predicate)
        //Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate)
        //returns map(key =>boolean value =>list
    Map<Boolean, List<Dish>> veggieDish=   DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);
//{false=[Dish(name=chicken, vegetarian=false, calories=400, type=MEAT), ...
 //true=[Dish(name=fries, vegetarian=true, calories=530, type=OTHER),
        System.out.println("groupingBy()");
    //is used for grouping objects by some property and storing results in a MAp instance

        Map<Type,List<Dish>> dishType=   DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);
//{FISH=[Dish(name=prawns, vegetarian=false, calories=300, type=FISH),...
//OTHER=[Dish(name=fries, vegetarian=true, calories=530, type=OTHER), ....
// MEAT=[Dish(name=chicken, vegetarian=false, calories=400, type=MEAT),...
    }
}
