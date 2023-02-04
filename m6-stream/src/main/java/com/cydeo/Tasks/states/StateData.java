package com.cydeo.Tasks.states;

import java.util.Arrays;
import java.util.List;

public class StateData {

    public static List<State> getAllCities() {
        return Arrays.asList(
                new State(Arrays.asList("London", "Ilderton", "Kitchner")),
                new State(Arrays.asList("Nicosia", "Waterloo", "Strathroy")),
                new State(Arrays.asList("Brampton", "Statford", "Kingston"))
        );
    }
}