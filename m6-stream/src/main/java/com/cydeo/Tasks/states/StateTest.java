package com.cydeo.Tasks.states;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {
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

        List<State> states = Arrays.asList(state1, state2, state3);
        states.stream()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

        for (State state : states) {
            for(String city: state.getCities()){
                System.out.println(city);
            }
        }
    }
}
