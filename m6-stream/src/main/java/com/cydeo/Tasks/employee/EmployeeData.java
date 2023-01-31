package com.cydeo.Tasks.employee;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {


    public static Stream<Employee> readAll() {//return direcly Stream
        // you can put each value// now you will put each employee object
        return Stream.of(new Employee(100, "Mike", "mike.cydeo.com", Arrays.asList("2002345", "78904563")),
                new Employee(101, "Ozzy", "ozzy.cydeo.com", Arrays.asList("290023457", "12334567")),
                new Employee(102, "Peter", "peter.cydeo.com", Arrays.asList("45678912", "98765432")));

        //now no need EmployeeData.stream()//because returns Stream
    }

}
