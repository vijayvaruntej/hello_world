package com.trainingmug.java.features;

public class PremiumCustomer extends Customer{

    String membership;

    public PremiumCustomer(int id, String name, String email, int salary, byte age, String membership) {
        super(id, name, email, salary, age);
        this.membership = membership;
    }

    public void display(){
        super.display();
        System.out.println("Membership Type :" + membership);
    }


}
