package com.cydeo.tech_turtle.lambda_review;

public class MAinApp {
    public static void main(String[] args) {
        /*
        Service service= new Service() {
            @Override
            public void save() {
                System.out.println("Object saved");
            }
        };//make it anonomys class
   //we implemented interface //override it has no name
service.save();//Object saved


         */

        Service service=()-> System.out.println("Object saved");

service.save();
    }
}
