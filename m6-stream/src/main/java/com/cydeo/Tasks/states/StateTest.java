package com.cydeo.Tasks.states;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
            cities.add("Richmond");
      cities.addAll(Arrays.asList("Norfolk","Fairfax","Virginia Beach","Arlington"));
        System.out.println(cities);
/*
        for(String each:cities){
            System.out.println(each);
        }
 */
     //   cities.stream()
               // .map(each->each)
             //   .flatMap(city->city.s)
              //  .forEach(System.out::println);



    }
}
