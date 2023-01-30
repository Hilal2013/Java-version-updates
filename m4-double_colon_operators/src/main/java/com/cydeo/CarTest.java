package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

        //No Argument Constructor//we didint have parameter==>Supplier
        //Supplier<T> doesnt accept parameter//it can return anything
        //T return type // abstract method is T get();
        Supplier<Car> c1=()-> new Car();//it will return car object
        System.out.println(c1.get().getModel());//we diddnt assign so->0
      //Im calling the constructor new keyword//but no need new Car//it allready knows from Car Class
       Supplier<Car> c2=Car:: new;
        System.out.println(c2.get().getModel());//0
        //One Argument Constructor
     //we have one parameter and returns a value so==> Function

        Function<Integer,Car> f1=model->new Car(model);
        Function<Integer,Car> f2=Car::new;
        System.out.println(f2.apply(2022));//Car(make=null, model=2022)
//Two argument Constructor
        BiFunction<String,Integer,Car> f3=(name,model)->new Car(name,model);
        BiFunction<String,Integer,Car> f4=Car::new;
      //  System.out.println(f4.apply("Honda",2020));//Car(make=Honda, model=2020)
Car honda =f4.apply("Honda",2015);
        System.out.println(honda.getMake()+" "+honda.getModel());//Honda 2015

    }
}
