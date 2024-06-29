package com.trainingmug.java.features;



public class Customer {

        int id;
        String name;
        String email;
        int salary;
        byte age;

        public Customer(){
            System.out.println("Customer() is called.");
        }

        public Customer( int id, String name, String email, int salary, byte age){
            System.out.println("Coutomer (int, String, String, int, byte");
            this.id = id;
            this.name = name;
            this.email = email;
            this.salary = salary;
            this.age = age;
        }

        public void display(){
            System.out.println("id :" + id);
            System.out.println("Name :" + name);
            System.out.println("Email :" + email);
            System.out.println("Salary :"+ salary);
            System.out.println("Age :" + age);
        }

        // method overloading
        public void display(String location){
            System.out.println("Location :" + location);
        }
}
