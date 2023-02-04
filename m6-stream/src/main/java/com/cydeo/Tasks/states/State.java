package com.cydeo.Tasks.states;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class State {
    private List<String> cities = new ArrayList<>();
    public void addCity(String city){
        cities.add(city);
    }
    public List<String> getCities(){
        return this.cities;
    }


}
