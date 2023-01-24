package com.cydeo.tasks;

public final class Algorithm {

    public static  <T> T  max(T x, T y) {//generics doesnt accept primitive types

        return  (Integer)x >(Integer) y ? x : y;//we can use < or > for non primitive numbers
    }
}
