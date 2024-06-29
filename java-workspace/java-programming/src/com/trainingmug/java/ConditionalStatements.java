package com.trainingmug.java;

public class ConditionalStatements {
    public static void main(String[] args) {
        // calculation discount
        /*
        if person is Diamont - 20%
        gold - 15%
        silver - 10%
         */
        int productPrice;
        productPrice = 100;
        int discount;
        int discountPercentage;
        char membership;
        membership = 'D';
        if(membership == 'D'){
            discountPercentage = 20;
        }else if( membership == 'G'){
            discountPercentage = 15;
        }else if(membership == 'S'){
            discountPercentage = 10;
        }else {
            discountPercentage =0;
        }

        discount = productPrice * discountPercentage/100;
        System.out.println("Discount amount is " + discount);
    }
}
