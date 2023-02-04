package com.cydeo.Tasks.states;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {


     StateData.getAllCities().stream()
            // .map(State::getCities)
             //.flatMap(city-> city.stream())
               // .flatMap(List::stream)
             .flatMap(city-> city.getCities().stream())
                .forEach(System.out::println);
//forloop withoutStream
        System.out.println("forLoop");
        for (State state : StateData.getAllCities()) {
            for(String city:state.getCities()){
                System.out.println(city);
            }
        }

    }
}
/*
 State state1 = new State();
        state1.addCity("Nashville");
        state1.addCity("New York");
        state1.addCity("Los Angelos");
        state1.addCity("Orlando");
        state1.addCity("Las Vegas");

        State state2 = new State();
        state2.addCity("x");
        state2.addCity("N");
        state2.addCity("L");
        state2.addCity("O");
        state2.addCity("Las ");

        State state3 = new State();
        state3.addCity("le");
        state3.addCity("k");
        state3.addCity("ngelos");
        state3.addCity("do");
        state3.addCity("s");
 */