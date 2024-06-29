package com.trainingmug.java.features.abstraction;
//public interface class CustomerService {
// no need of abstract keyword due to usage of interface
// but interface will not work with abstract and non abstract methods
public abstract class CustomerService {


     abstract void addCustomertoDb(Customer customer);

     void display(Customer customer){
          System.out.println("id :" + customer.id);
          System.out.println("Name :" + customer.name);
          System.out.println("Email :" + customer.email);
          System.out.println("Salary :"+ customer.salary);
          System.out.println("Age :" + customer.age);
     }
}
