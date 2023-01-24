package com.cydeo.taskAppleFarm;


public class Apple {
    //private String color;//color is a constant
    private Color color;
 //   private double heavy;
private int weight;
    public Apple(Color color, int weighy) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}
/*
In software engineering, user requirements will change.
Example : Imagine an application to help a farmer understand his inventory.
- Find all green apples in the inventory
- Find all apples heavier than 200 g
As a developer, we have to minimize our engineering effort
 */