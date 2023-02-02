package com.cydeo.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Practice_words {
    public static void main(String[] args) {
        ArrayList<String> listWords=new ArrayList<>( Arrays.asList("Hello", "World") );

        System.out.println("remove duplicates chars use flatMap and distinct");

  List<String>   list=   listWords.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                  .distinct()
                .collect(Collectors.toList());
        System.out.println(list);//[H, e, l, o, W, r, d]
    }
}
