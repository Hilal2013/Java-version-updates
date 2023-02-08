package com.cydeo.java12;

import java.util.Arrays;
import java.util.List;

public class GuestData {

    public static List<Guest> getAll(){
        return Arrays.asList(
                new Guest("Marco", true, 3),
                new Guest("David", false, 2),
                new Guest("Roger", true, 6)
        );
    }

}
