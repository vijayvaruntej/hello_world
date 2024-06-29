package com.trainingmug.java.features.abstraction;


public class Main {
    public static void main(String[] args) {
        Customer customer2 = new Customer(1, "Vijay", "vijayvaruntej30@gmail.com", 10000000, (byte) 23);
        /*CustomerService customerService = new CustomerService();
        customerService.addCustomertoDb(customer2);*/
        //MySQLRepository repository = new MySQLRepository();
        MongoDb repository2 = new MongoDb();
        CustomerServiceImpl customerService = new CustomerServiceImpl(repository2);
        customerService.addCustomertoDb(customer2);
        customerService.display(customer2);
    }
}
