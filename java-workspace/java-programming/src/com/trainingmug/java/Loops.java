package com.trainingmug.java;

public class Loops {
    public static void main(String[] args) {

        int maxLimit;
        maxLimit = 100;
         /*
       int no;
        no = 9;
        while( no <= maxLimit ){
            if(no%2 == 0)
                System.out.println(no);
            no++;
        }
        */
        // for loop
        /*
        for(int no=1; no<= maxLimit; no++){
            System.out.println(no);
        }
        */
        // do while for menu driven applications
        int no;
        no=10;
        do {
            System.out.println( no);
            no++;
        }while(no<=10);
    }
}
