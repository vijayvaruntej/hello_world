package com.trainingmug.java;

import java.util.Scanner;

public class WorkingWithStrings {
    public static void main(String[] args) {
        String str1 = new String("Hello Vijay");

        System.out.println(str1.charAt(1));
        System.out.println(str1.length());

        //string literal
        String str2 = "Hello vijay";

        //split
        String details = "1-97/2, puttakota, velugumatla, khammam, 507318";
        String[] values = details.split(", ");
        for( String str:values){
            System.out.println(str);
        }
    


    }
}
