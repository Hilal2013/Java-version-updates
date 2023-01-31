package com.cydeo.Tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Practice_words {
    public static void main(String[] args) {
        String str = "Hello World";//print Hello World
        String[] words = str.split(" ");
        Arrays.stream(words)
            //  .map(w -> w.split(" "))
                .forEach(w -> System.out.print(w));

        System.out.println();
        System.out.println("remove duplicates chars use flatMap and distinct");
        Arrays.stream(words)
                .map(w -> w.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::print);//HelloWorld

List<String> listWords=Arrays.asList(str);
        System.out.println(listWords);
        listWords.stream()
                .map(w -> w.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());

    }
}
