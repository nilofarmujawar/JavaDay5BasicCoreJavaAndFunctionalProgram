package com.bridgelabz;

import java.util.Scanner; // import scanner class

public class LeapYear {

    public static void main(String[] args){

        int year;

        System.out.println("Enter Year");

        Scanner ab = new Scanner(System.in); // create object

        year = ab.nextInt();// nextInt() method used


// if the year is divided by 4,if the year is century if year is divided by 400

       // then it is a leap year

        if (((year%4 == 0) && (year%100!= 0)) || (year%400 == 0))

            System.out.println("It is a leap year");

        else
            System.out.println("It is not a leap year");
    }
}
