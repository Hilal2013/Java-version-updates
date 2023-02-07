package com.cydeo.java9;

import java.time.LocalDate;

public interface PrivateMethodIinterface {

   boolean isHoliday(LocalDate date);
    default boolean isBusinessDay(LocalDate date){

        validate(date);
        return !isHoliday(date);
    }
    default LocalDate nextDay(LocalDate date){
        validate(date);
        LocalDate nextDate = date.plusDays(1);
        return isHoliday(nextDate) ? nextDay(nextDate): nextDate;
    }

    private void validate(LocalDate date){/// if I do default//it can be inherited and it can be called from other classes too
        if(date.isBefore(LocalDate.of(2001,1,1))){
            throw new IllegalArgumentException();
        }
    }

}
