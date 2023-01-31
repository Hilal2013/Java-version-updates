package com.cydeo.Tasks.dish;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Dish {

    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;

}
