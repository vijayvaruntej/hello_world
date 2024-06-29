package com.trainingmug.java;

import java.sql.SQLOutput;

public class SwitchStatement {
    public static void main(String[] args) {
         String brand = "Samsung";
        int productPrice;
        productPrice = 1000;
        int discount;
        int discountPercentage = 0;
        char membership;
        membership = 'D';

         switch(brand){
             case "Samsung" :
                 if(membership == 'D')
                     discountPercentage = 30;
                 else if(membership == 'G')
                     discountPercentage = 20;
                 break; // break must
             case "Apple":
                 if(membership == 'D')
                     discountPercentage = 20;
                 else if(membership == 'G')
                     discountPercentage = 10;
                 break;
             default:
                 discountPercentage = 5;

         }
        System.out.println("Discount percentage is " + discountPercentage);
    }
}
