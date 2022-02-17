package com.bridgelabz;

import java.util.Scanner; // import scanner class

class HarmonicNumber {
     // create public static method

    public static double Harmonic(int n){

        double sum =0;
        if(n>0)
        {
            for(double i=1;i<=n;i++){
                sum+=(1/i);

            }

        }
        else
        {
            System.out.println("Enter a positive number:");
        }
        return sum;

    } // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create object

        System.out.println("Enter the value of n");

        int n = sc.nextInt();// using nextInt() method for getting i/p from user

        System.out.println(Harmonic(n));
    }

}