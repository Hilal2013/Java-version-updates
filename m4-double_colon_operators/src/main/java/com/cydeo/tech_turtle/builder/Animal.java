package com.cydeo.tech_turtle.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Builder
public class Animal {
    String name;
    int age;
    String type;
    int weight;
    String color;

}
