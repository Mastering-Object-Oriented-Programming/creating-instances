package com.trainingmug.java;

public class Main {
    public static void main(String[] args) {
        // Creating Employee Objects
        // instances (synonym for object)
        // Two Types of data
        // Primitives (byte, short, int, long, float, double, char, boolean)
        // Object

        // byte age= 100;

        new Employee(); //create a new Employee object
        new Employee(); //create another new Employee object

        Employee emp; // emp is a reference variable only, no object will be created here
        byte age;
        age = 100;

        emp = new Employee(); // A new Employee object will be created and will be referred by emp

        Employee emp1;
        emp1 = new Employee();
    }
}
