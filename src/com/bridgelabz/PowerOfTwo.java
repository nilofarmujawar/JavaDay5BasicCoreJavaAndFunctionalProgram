package com.bridgelabz;

import java.util.Scanner; // import scanner class

public class PowerOfTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create object

        System.out.println("Enter value of n");

        int n = sc.nextInt();

        if(n>0&&n<31){

            // using for loop

            for(int i=1;i<=n;i++){

                System.out.println(i+" "+Math.pow(2,i));// using Math.pow method
            }
        }
        else
        {
            System.out.println("Exceed max value, please enter lower value");
        }
    }

}