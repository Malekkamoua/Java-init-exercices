package com.tutorial.java.OOP;

class Car {
    private int price;
    private String model;

    public void start() {
        System.out.println("Car Starts");
    }

    public void stop() {
        System.out.println("Car stops");
    }

    public void move() {
        System.out.println("Car moves");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Driver {
    private String name;
    private int age;

    public String drive() {

        return ("Driver drives car");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Exercice1OOP{
    public static void main(String[] args) {
        Car c = new Car();
        c.move();

        Driver d = new Driver();
        System.out.println(d.drive());
    }
}
