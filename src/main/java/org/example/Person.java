package org.example;

public class Person {
    private String name;  // this field is private, means it can not be accesed direclty from other class. This privatet field is ENCAPSULATED.

    public Person (String name){ //this is a constructor that can be accesed from outside(public) and used to initialize Perons object with String variable(name)
        this.name=name;
    }

    public String getName(){ //this is Getter method, in that way we can access the name from outside the class
        return name;
    }

    public void setName(String name){ //this is Setter, in this way we can access and modify the name from outside of this class
        this.name=name;
    }
}
