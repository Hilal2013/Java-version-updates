package com.cydeo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

    public static void main(String[] args) {
        double amount1 = 374.56;
        double amount2 = 374.26;
        System.out.println(amount1-amount2);//0.30000000000001137

        BigDecimal b1 = new BigDecimal("374.56");// in the paranthesis constructor
        BigDecimal b2 = new BigDecimal("374.26");
     //   System.out.println(b1-b2);//it is compiling error//object -object :))//XXX
//b1 object is coming from BigDecimal
        System.out.println(b1.subtract(b2));//0.30
//there is one more way
        BigDecimal b3 = BigDecimal.valueOf(374.56);
        BigDecimal b4 = BigDecimal.TEN;
        System.out.println(b1.add(BigDecimal.TEN));//384.56
        BigDecimal b5 = BigDecimal.ONE;
        System.out.println(b1.add(b5));//374.56 + 1= 375.56
        System.out.println(b1.multiply(new BigDecimal("15.00")));//5618.4000
        System.out.println(b1.multiply(b2));//140182.8256
        System.out.println(b1.multiply(BigDecimal.valueOf(15.56)));//5828.1536
        //Scaling
        BigDecimal number1 = new BigDecimal("23.12");
      /*
       public BigDecimal setScale(int newScale, RoundingMode roundingMode) {
     I have a method here called setScale this method returning BigDecimal
     this method is acepting two parameters //one of them integer
     the other one RoundingMode (ENUM-> which constans-> UP(BigDecimal.ROUND_UP)//DOWN//CEILING//FLOOR)
        return setScale(newScale, roundingMode.oldMode);
    }
       */
        System.out.println(number1.setScale(1, RoundingMode.CEILING));
        // it is ceiling 1 up//23.2
        System.out.println(number1.setScale(1, RoundingMode.FLOOR));//23.1
        //
        System.out.println(number1.setScale(2, RoundingMode.FLOOR));//23.12
        System.out.println(number1.setScale(2, RoundingMode.CEILING));//23.12

        //Do not use equals(). Use compareTo() because they are objects
        //compareTo comes from Comparator interface  purpose is  sorting//logic -1 1 0
        System.out.println(new BigDecimal("2").compareTo(new BigDecimal("2")));//0
        System.out.println(new BigDecimal("3").compareTo(new BigDecimal("2")));//1//descending
        System.out.println(new BigDecimal("1").compareTo(new BigDecimal("2")));//-1//ascending



    }
    class Employee {
        private String name;
        private BigDecimal salary;
//    private double salary;we ara not gonna say double //anymore BigDecimal class
        //public class BigDecimal extends Number implements Comparable<BigDecimal>
   //it Is extending number class and implements Comparable interface it means they override certain methods
        // basically there are methods inside here

    }

/*

  DecimalFormat df=new DecimalFormat("0.0");
        double radius=5;
        double area = Math.PI*radius*radius;
        double perimeter= 2*Math.PI*radius;
        System.out.println("Area of the circle is "+df.format(area)+"\nPerimeter of the circle is "+df.format(perimeter));
 */
}
