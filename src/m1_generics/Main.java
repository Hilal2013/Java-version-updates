package m1_generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        /*
        ArrayList items1=new ArrayList();//arraylist is a class and i created arraylist object
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

        
    }
    private static void printDoubled(ArrayList<Integer> items){
//We can say Integer
        for (int i : items) {
            System.out.println(i*2);
        }


        
    }
    

}
