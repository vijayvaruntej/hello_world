package com.trainingmug.java.features;

public class RegularCustomer extends Customer{

    int cashBackPoints;

    public RegularCustomer(){
        super();
        System.out.println("RegularCustomer() is called....");
    }

    public RegularCustomer(int id, String name, String email, int salary, byte age, int cashBackPoints) {
        super(id, name, email, salary, age);
        this.cashBackPoints = cashBackPoints;
    }
// method overriding
    public void display(){
        super.display();
        System.out.println("Cashback points :" + cashBackPoints);
    }
}
