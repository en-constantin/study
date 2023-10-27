package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      Person person1=new Person("Arseni"); // using the Constroctor method from the Person class to initialize an object(person1)

        System.out.println("In this example we are using Encapsulation, Inheritance, Polimorphism, Abstraction, Interface");
        System.out.println("This private name is accesed from another class using Encapsulation:  "+person1.getName()); //Accesing data from the Person class using getter method

        person1.setName("Constantin"); //Using the Setter method from Person class to modify the name
        System.out.println("This private name is accesed from another class using Encapsulation: "+person1.getName()); //Accesing data from the Person class using getter method

        Car myCar =new Car("Toyota","Prius");

        System.out.println("The brand of the car is accesed from superclass: " + myCar.brand); //Accessing the superclass member
        System.out.print("This is called from the overriden method from Car class: ");
        myCar.start(); //Calling overriden method from the Car class
        System.out.print("This is called from Car subclass: ");
        myCar.drive(); //Calling the sublass method from the Car class
        System.out.print("This is called from the same Car subclass +speed argument(overloaded): ");
        myCar.drive(60); //Calling overloaded method with speed argument

        System.out.println("This car is "+myCar.carAge+" old. "+myCar.tobuy()); //calling the overriden method from Car class, which original is an abstract metod in Vehicle class

        myCar.stop(); //calling method from Car class that was implemented from Auto interface
    }
}