package com.cydeo.java14;

public class UserTest {
    public static void main(String[] args) {
        //That is the proof
        User user = new User("Mike","VA");
     //   System.out.println(name);//compile error//why i cannot call directly because field is final private/
        //   /need getters
        System.out.println(user.name());//through original name
        System.out.println(user.toString());

    }
}
