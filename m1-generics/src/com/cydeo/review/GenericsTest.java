package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));
        printInfo(studentList);
//Student{name='Mike', id=101}
//Student{name='Joe', id=102}
//Student{name='Adam', id=103}
//3
        printInfo2(teacherList);

//Teacher{name='Albus', id=201}
//Teacher{name='Severus', id=202}
//2
        System.out.println("getLastItem(studentList) = " + getLastItem(studentList));
        System.out.println(getLastItem(studentList));
        System.out.println(" through class");
        MyUtils<Student> obj1=new MyUtils();
        obj1.printInfo2(studentList);
        MyUtils<Teacher> obj2=new MyUtils();
        obj2.printInfo2(teacherList);
    }

    // Write a method that takes a list of students, prints each student and the total student count.
    public static void printInfo(List<Student> students) {

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }

    ///Generic type
    public static <T> void printInfo2(List<T> list) {

        for (T each : list) {
            System.out.println(each);
        }
        System.out.println(list.size());
    }

    public static <E> E getLastItem(List<E> list){
return list.get(list.size()-1);

    }




}
