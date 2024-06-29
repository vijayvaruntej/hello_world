package com.trainingmug.java.features.abstraction;
//public class MySQLRepository implements Repository{
public class MySQLRepository extends Repository{

    @Override
    void connectToDb() {
        System.out.println("Connection to MySQL is Successful");
    }

    @Override
    void addCustomerToDb(Customer customer) {
        System.out.println("Customer data is added to MySQL database");
    }


}
