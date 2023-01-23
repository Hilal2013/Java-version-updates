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

        System.out.println("How to use switch-case with enums");

        Currency myCurrency = Currency.QUARTER;
        switch(myCurrency){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }
        System.out.println("How top retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());//1
        System.out.println(Currency.QUARTER.getValue());//25
        System.out.println(Currency.QUARTER.ordinal());////index 3

//create enum for Math operations
        //calculate which accepts 3 parameters
        System.out.println("Operation Task");
        calculate(3,5,Operation.PLUS);

        System.out.println(ProjectStatus.PROGRESS.getStatus());//IN PROGRESS
        System.out.println(ProjectStatus.OPEN);//OPEN

    }
    private static void calculate(double x,double y,Operation operation){
        switch(operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;
        }




    }



}
