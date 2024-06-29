package com.trainingmug.java.features.exceptions;
import java.sql.SQLOutput;
import java.util.*;
public class ExceptionsTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no1 :");
        int no1 = scanner.nextInt();
        System.out.println("Enter no2 :");
        int no2 = scanner.nextInt();
        try {
            int sum = no1 / no2;
            System.out.println("Rem is " + sum);
        }
        /*catch (ArithmeticException e){
            System.out.println("Enter into exception");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index exception2");
        }catch (NullPointerException e){
            System.out.println("Null point exception");
        }
        */
        catch (Exception e){
            System.out.println("Some internal error occured. please try again");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println(" Hey! How are you ?");

    }
}
