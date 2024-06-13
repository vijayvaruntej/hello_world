package com.trainingmug.java;

public class Customer {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("hi!!!");
        /*
            working with primitives
         */
        byte age=35;    //size is -128 to +127
        System.out.println("Age : " + age);

        short orderValue = 499; // size 2 bytes
        System.out.println("Order value is " + orderValue);

        int annualSalary = 150000;
        System.out.println("Annual salary is " + annualSalary);

        long totalSavings = 1000000000;
        System.out.println("Total salary is " + totalSavings);

        float avgSalary = 234342.34f;
        System.out.println("Average salary is " + avgSalary);

        double avgAnnualRevenue = 237483648463.29373;
        System.out.println("Average Annual Revenue is " + avgAnnualRevenue);

        char gender;
        gender = 'M';
        System.out.println("Gender is " + gender);

        boolean isEligible;
        isEligible = true;
        System.out.println("  Is eligible : " + isEligible);

        // implicit type conversion
        // explicit type conversion

        float value;
        value = 3;
        int intValue;
        intValue = (int) value;
        System.out.println("Int value is "+ intValue);
        
    }
}
