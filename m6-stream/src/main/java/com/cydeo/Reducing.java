package com.cydeo;

import com.cydeo.Tasks.dish.Dish;
import com.cydeo.Tasks.dish.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4, 5, 3, 9);
        int sum = 0;
        for (Integer each : numbers) {
            //  sum+=each;
            sum = sum + each;
        }
        System.out.println(sum);//21
        int result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);//21
        //if you dont give initial value
        Optional<Integer> result1 = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(result1);//Optional[21]

        int sumCal = DishData.getAll().stream()
                .map(Dish::getCalories)
                //.map(each->each.getCalories())
                .reduce(0, (a, b) -> a + b);//when i put initial not return Optional
        //..reduce((a, b) -> a + b);//get();
                  //.reduce(Integer::sum)
        System.out.println(sumCal);//4200
        //Max and Min
       Optional<Integer> min= numbers.stream()
               .reduce(Integer::min);
        Optional<Integer> max= numbers.stream()
                .reduce(Integer::max);
        Optional<Integer> sum1= numbers.stream()
                .reduce(Integer::sum);

        System.out.println(max.get());//9
        System.out.println(min.get());//3
        System.out.println(sum1.get());//21
        //


    }
}
