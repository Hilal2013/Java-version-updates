package com.cydeo.taskUser;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Mike","Smith",35));
        users.add(new User("Tom","Evan",25));
        users.add(new User("Emma","Pollard",55));

        //Print all elements in the list
        printName(users,user->true);

        //Print all people last name starts with E
        printName(users,user->user.getLastname().startsWith("E"));
       // User{firstName='Tom', lastname='Evan', age=25}

    }
    private static void printName(List<User> users, Predicate<User> p){
        for(User user : users){
            if(p.test(user)){//whenever i give user my object//return me boolean
                System.out.println(user.toString());
            }
        }
    }
}
