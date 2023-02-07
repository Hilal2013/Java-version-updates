package com.cydeo.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GuestTask {
    public static void main(String[] args) {

        var result =
                Stream.of(
                                new Guest("Marco", true, 3),
                                new Guest("David", false, 2),
                                new Guest("Roger", true, 6))
                        .collect(Collectors.teeing(
                                //first collector,we select only who confirmed the participitation
                                Collectors.filtering(Guest::isParticipating, Collectors.mapping(Guest::getName, Collectors.toList())),
//we want to collect only first name in a list
                                Collectors.filtering(Guest::isParticipating, Collectors.summingInt(Guest::getParticipantsNumber)),
//second collector we want the total number of participants
                                EventParticipation::new
                  //we merge the collectors in a new object
                  //the values are implictly passed
                        ));
        System.out.println(result);
//EventParticipation{guestNameList=[Marco, Roger], totalNumberOfParticipants=9}


        //try without teeing  with stream

    }
}
