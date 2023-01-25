package com.cydeo.taskAppleFarm;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory=new ArrayList<>();
        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));
        inventory.add(new Apple(80,Color.YELLOW));
        inventory.add(new Apple(120,Color.YELLOW));

        prettyPrintApple(inventory,apple->"An apple of "+ apple.getWeight()+"g");
        //An apple of 300g ...

        PrettyAppleFunction prettyAppleMix=apple -> {
            if(apple.getWeight()>100){return "A Heavy "+ apple.getColor()+ " apple";}
            else{return"A Light "+ apple.getColor()+" apple";}
        };
        prettyPrintApple(inventory,prettyAppleMix);
        //A Heavy GREEN apple //A Light RED apple.....
        System.out.println(inventory);
      //  [Apple{color=GREEN, weight=300}, Apple{color=RED, weight=100}, Apple{color=GREEN, weight=200}, Apple{color=RED, weight=50}]
        AppleHeavyPredicate abc = new AppleHeavyPredicate();
        List<Apple> heavyApple=filterApples(inventory,abc);
        System.out.println(heavyApple);//[Apple{color=GREEN, weight=300}]
        List<Apple> greenApple=filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);//[Apple{color=GREEN, weight=300}, Apple{color=GREEN, weight=200}]

        System.out.println("Lambda Expression");
    // .....(type)    weightApple=(Apple apple)->apple.getWeight()>200;
        //our type is interface
        ApplePredicate weightApple = (Apple apple)-> apple.getWeight()>200;
        //you need to pass action to method
        System.out.println(filterApples(inventory,weightApple));//[Apple{color=GREEN, weight=300}]
        //or Type Inference// we can remove Apple(type)
        ApplePredicate weightApple1 = apple -> apple.getWeight()>200;

       // System.out.println(filterApples(apple-> apple.getColor().equals(Color.GREEN)));


    }
    private static List<Apple> filterApples(List<Apple> inventory,ApplePredicate applePredicate){
//why ApplePredicate => to accept different behaviours/parameterization
        List<Apple> result = new ArrayList<>();

        for(Apple apple : inventory){
            if(applePredicate.test(apple)){//our method //if it is true
                result.add(apple);
            }
        }
        return result;
    }
    public static void prettyPrintApple(List<Apple> inventory,PrettyAppleFunction prettyApple){

        for(Apple apple : inventory){
String output= prettyApple.test(apple);
            System.out.println(output);
        }


}

}
