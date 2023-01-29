package com.cydeo.review;

public class Car {
    private String name;
    private int topSpeed;
    private int year;

    public Car(String name, int topSpeed, int year) {
        this.name = name;
        this.topSpeed = topSpeed;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", topSpeed=" + topSpeed +
                ", year=" + year +
                '}';
    }
}
