package com.cydeo.practices;

enum MyEnums
{
    FIRST, SECOND, THIRD, FOURTH;
}
  
public class Test
{
   public static void main(String[] args)
   {
       MyEnums[] myEnums = new MyEnums[4];
  
       for (int i = 0; i < myEnums.length; i++)
       {
           System.out.println(myEnums[i]);
       }
   }
}
//null
//null
//null
//null