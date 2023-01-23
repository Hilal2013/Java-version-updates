package m1_generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        ArrayList items1=new ArrayList();//arraylist is a class and i created arraylist object
        for (Object o : items1) {//Arraylist is collectionn. collection is the combination of the objects
             //the type is gonna be object
        }

         */

        ArrayList<Integer> items = new ArrayList<Integer>();  //ArrayList only accepts objects belongs to Integer class

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
//        items.add("Apple");



        printDoubled(items);


        System.out.println("***********************");




        
    }
    private static void printDoubled(ArrayList<Integer> items){





        for (Integer i : items) {

        }


        
    }
    

}
