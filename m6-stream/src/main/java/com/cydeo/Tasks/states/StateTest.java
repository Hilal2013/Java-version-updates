package com.cydeo.Tasks.states;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Virginia");
        cities.addAll(Arrays.asList("New York","California"));
        System.out.println(cities);
/*
        for(String each:cities){
            System.out.println(each);
        }
 */
        cities.stream()
                .map(each->each)
                .forEach(System.out::println);



    }
}
