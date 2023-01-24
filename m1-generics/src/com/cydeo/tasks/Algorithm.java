package com.cydeo.tasks;

public final class Algorithm {

    public static  <T> T  max(T x, T y) {

        return  (Integer)x >(Integer) y ? x : y;
    }
}
/*
Will the following class compile? If not, why?
public final class Algorithm {
 public static <T> T max(T x, T y) {

 return x > y ? x : y;
 }
}

    public static  <T> T  max(T x, T y) {

        return
    }
 */