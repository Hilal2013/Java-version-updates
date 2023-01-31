package com.cydeo.Tasks;

import java.util.Arrays;
import java.util.List;

public class PrintNumberOfCharacters {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("JAVA","APPLE","HONDA","DEVELOPER");

        words.stream()
                .map(word->word.length())
               // .map(String::length)
           //   .forEach(each-> System.out.println(each));
                .forEach(System.out::println);



    }
}
