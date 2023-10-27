package org.example;

 abstract class Vehicle {
    protected String brand; //this is protected variable, this means it can be accessd from subclass

     public Vehicle(String brand){ //this is constructor that can be accesed and used to initialize objects
         this.brand=brand;
     }
     public void start(){  //this is concrete method in abstract class Vehicle, it can be leave like it is or to be overidden in subclass
         System.out.println("Starting the vehicle");
     }
     public abstract String tobuy();

}
