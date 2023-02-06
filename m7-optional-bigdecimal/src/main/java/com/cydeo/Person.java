package com.cydeo;

public class Person {
 private Car car;
 
 public Car getCar(){
 return car;
 }
 public class Car {

  private Insurance insurance;

  public Insurance getInsurance() {
   return insurance;
  }
  public class Insurance {

   private String name;

   public String getName(){
    return name;
   }
 }

}
 public String getCarInsuranceName(Person person){
  return person.getCar().getInsurance().getName();
 }
/*
 public String getCarInsuranceName(Person person) {
  if (person != null) {
   Car car = person.getCar();
   if (car != null) {
    Insurance insurance = car.getInsurance();
    if (insurance != null) {
     return insurance.getName();
    }
   }
  }
  return "unknown";
 }
 */
}