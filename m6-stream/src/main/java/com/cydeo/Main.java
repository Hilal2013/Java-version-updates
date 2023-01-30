package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //Creating stream array
        String[] courses={"Java","Spring","Agile"};
        //convert to Stream
       // Arrays.stream(courses);// to return
        Stream<String> courseStream=Arrays.stream(courses);

        List<String> courseList=Arrays.asList("Java","Spring","Agile");
        Stream<String> courseStream1=courseList.stream();

        List<Course> myCourses=Arrays.asList(new Course("Java",100),
                new Course("DS",101),new Course("MS",102));

        Stream<Course> myCourceStream=myCourses.stream();

    }
}
