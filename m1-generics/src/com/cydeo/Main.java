package com.cydeo;

import m1_generics.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        ArrayList items1=new ArrayList();//raw type(without generics)//arraylist is a class and i created arraylist object
        for (Object o : items1) {//Arraylist is collectionn. collection is the combination of the objects
                                 //the type is gonna be object
            System.out.println(i*2);why it is complaining//i is object it cannot multiply we need to casted
              System.out.println((Integer)i*2);

        }
There was no generic people was doing this.
//        items.add("Apple");if i addd here doesnt show error. because arraylist accepts error. when I run exception .
 string doesn't cast integer.This was the problem
 What is the main problem here?Arraylist has able to accepts any object right now
         */

        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);

        printDoubled(items);

        System.out.println("***********************");
//lets created
        FootballPlayer joe = new FootballPlayer("Joe");
//Joe register himself as a football player//they are not inthe team yet they are registering  in administration
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");
        Team<SoccerPlayer> liverpool = new Team("Liverpool");
//liverpool.addPlayer(joe);
//liverpool.addPlayer(pat);
        liverpool.addPlayer(beckham);//it seems nothing wrong with code.
// we created a team your team accept anyone. team accepts any object.there is no restriction/filter.
// you didnt tell//I wan team to accept only what Im creating for example soccer
        //you need to put some filtering you need to mention How?go to team class and make generic
        System.out.println(liverpool);
        //  Beckham picked for teamLiverpool
        //   m1_generics.Team@380fb434 ?? tostring
//Team{name='Liverpool', members=[Player{name='Beckham'}]}
/*
        Team<String> brokenTeam =new Team<>("What kind of team is this?");
//When t accepts any object
        Team<Integer> t2=new Team<>("Very weird"); //nothing wrong
      //should accept only Player class and subclasses so go to team class//Team<T extends Player>

 */
    }

    private static void printDoubled(ArrayList<Integer> items) {
//We can say Integer
        for (int i : items) {
            System.out.println(i * 2);
        }


    }


}
