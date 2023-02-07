package com.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {
        var str = "Mike \n Ozzy \n Tom \n Emmy";
//lines() returning stream
        str.lines().forEach(System.out::println);
        //Mike
        //Ozzy
        System.out.println(str.repeat(2));
        System.out.println(str.isEmpty());//false
        System.out.println(str.isBlank());//false
var str1="";
        System.out.println(str1.isBlank());//true
        System.out.println(str1.isEmpty());//true
  var str2=" ";
        System.out.println(str2.isBlank());//true
        System.out.println(str2.isEmpty());//false
    }
}
