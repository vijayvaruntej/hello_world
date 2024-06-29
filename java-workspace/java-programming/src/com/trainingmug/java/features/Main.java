package com.trainingmug.java.features;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        //customer.display();

        Customer customer2 = new Customer(1, "Vijay", "vijayvaruntej30@gmail.com", 10000000, (byte) 23);
        //customer2.display();

        RegularCustomer regularCustomer = new RegularCustomer(1, "Vijay", "vijayvaruntej30@gmail.com", 10000000, (byte) 23, 100);
        //regularCustomer.display();
        //regularCustomer.display();

        PremiumCustomer premiumCustomer = new PremiumCustomer(1, "Vijay", "vijayvaruntej30@gmail.com", 10000000, (byte) 23, "Gold");
        //premiumCustomer.display("Khammam");

        CustomerService customerService = new CustomerService();
        customerService.display(customer2);


    }
}
