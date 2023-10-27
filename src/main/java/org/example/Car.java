package org.example;

class Car extends Vehicle implements Auto{  //this is a subclass of Vehicle class, means it INHERIT all the methods, protected and public variable from there

    private String model;
    int carAge = 5;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    //using overriding to implement own fuctionality of start method here, different from superclass, having the same signature
    public void start() {
        System.out.println("Starting the car");
    }

    public void drive() {
        System.out.println("Driving the car");
    }

    public void drive(int speed) {  //using overloading to add speed argument to the metod drive
        System.out.println("Driving the car at " + speed + " km/h.");
    }


    @Override  //using override to impement the the abstract metod to buy from the avbstract class vehicle
    public String tobuy() {
        if (carAge >= 10) {
            return "Consider buying a new car.";
        } else {
            return "Your car is still in good condition.";
        }
    }
    public void stop(){ //implementation of the method from Auto interface
        System.out.println("The car stopped");
    }
}