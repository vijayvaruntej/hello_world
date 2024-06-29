package com.trainingmug.java.features.abstraction;
//public class MongoDb implements Repository{
public class MongoDb extends Repository{
    @Override
    void connectToDb() {
        System.out.println("Connection to MongoDb is Successful");
    }

    @Override
    void addCustomerToDb(Customer customer) {
        System.out.println("Customer data is added to MangoDb database");
    }
}
