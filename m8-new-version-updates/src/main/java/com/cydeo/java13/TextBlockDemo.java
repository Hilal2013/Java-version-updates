package com.cydeo.java13;

public class TextBlockDemo {
    public static void main(String[] args) {
var address="7925 Jones Branch Drive \n" + "Mclean,VA 22104";
        System.out.println(address);
//7925 Jones Branch Drve
//Mclean,VA 22104
        //just open three double quotes//it is coming from java13
        var address2= """
               7925 Jones Branch Drive 
                 22104
                """;
        System.out.println(address2);

    }
}
