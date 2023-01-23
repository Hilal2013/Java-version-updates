package com.cydeo;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access to constant ");
        //penny is an constant object of currency class.to access object
        Currency c = Currency.PENNY;
//c is reference and pointing object penny
        System.out.println(c);//PENNY// i dont see the hashcode
        //toString is already overriden in enum//where? I didnt override
        System.out.println(Currency.DIME);

        System.out.println("How to get all constants");
        Currency.values();//where is that values method?
        System.out.println(Currency.values());//hashcode
        Currency[] currencies = Currency.values();

        for (Currency currency : currencies) {
            System.out.println(currency);
        }
//PENNY//NICKLE//DIME//QUARTER
    }
}
