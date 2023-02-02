package com.cydeo.Tasks.transaction;

import com.cydeo.Tasks.dish.Dish;
import com.cydeo.Tasks.dish.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class DataGenerator {

    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Trader> traders = Arrays.asList(raoul, mario, alan, brian);

//1.Find all transactions in the year 2011 and sort them by value(small to high)
        System.out.println("1.Find all transactions in the year 2011 and sort them by value(small to high)");
        transactions.stream()
                .filter(each -> each.getYear() == 2011)
                // .map(each->each.getValue())
                .sorted(Comparator.comparing(Transaction::getValue).reversed())//high to small
                .forEach(System.out::println);
        //Transaction{trader=Trader{name='Raoul', city='Cambridge'}, year=2011, value=400}
        //Transaction{trader=Trader{name='Brian', city='Cambridge'}, year=2011, value=300}
//2. What are all the unique cities where the traders work?
        System.out.println("2. What are all the unique cities where the traders work?");

        System.out.println("First solution");
        traders.stream()
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);//Cambridge //Milan
        System.out.println("Second solution");
        Set<String> setCities = traders.stream()
                .map(Trader::getCity)
                .collect(Collectors.toSet());
        System.out.println(setCities);//[Milan, Cambridge]

        //3. Find all traders from Cambridge and sort them by name.
        System.out.println("3.Find all traders from Cambridge and sort them by name?");

        traders.stream()
                .filter(trader->trader.getCity().equalsIgnoreCase("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);
        //Trader{name='Alan', city='Cambridge'}
        //Trader{name='Brian', city='Cambridge'}
        //Trader{name='Raoul', city='Cambridge'}
        System.out.println("4. Return a string of all traders’ names sorted alphabetically?");
        String sortedNAmes= traders.stream()
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(sortedNAmes);//Alan,Brian,Mario,Raoul
        System.out.println("5. Are any traders based in Milan?");

       boolean anyMatch= traders.stream()
                       .anyMatch(trader->trader.getCity().equalsIgnoreCase("Milan"));
        System.out.println(anyMatch);//true

        System.out.println("6.Print the values of all transactions from the traders living in Cambridge?");

        transactions.stream()
                .filter(each->each.getTrader().getCity().equalsIgnoreCase("Cambridge"))
                        .map(Transaction::getValue)
                .sorted()
                                .forEach(System.out::println);

        System.out.println("7. What is the highest value of all the transactions?");

        Optional<Transaction> max=   transactions.stream()
                .max(Comparator.comparing(Transaction::getValue));
        System.out.println(max.get());

        System.out.println("8. Find the transaction with the smallest value?");

        Optional<Transaction> min=   transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(min.get());
//Transaction{trader=Trader{name='Brian', city='Cambridge'}, year=2011, value=300}
        System.out.println("Second solution");
        transactions.stream()
                .map(Transaction::getValue)
                .sorted()
                .limit(1)
                .forEach(System.out::println);//300


    }
}
/*
Find all transactions in the year 2011 and sort them by value(small to high)
2. What are all the unique cities where the traders work?
3. Find all traders from Cambridge and sort them by name.
4. Return a string of all traders’ names sorted alphabetically.
5. Are any traders based in Milan?
6. Print the values of all transactions from the traders living in Cambridge.
7. What is the highest value of all the transactions?
8. Find the transaction with the smallest value
 */