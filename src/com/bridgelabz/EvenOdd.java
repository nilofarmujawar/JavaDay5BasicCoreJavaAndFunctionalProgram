package com.bridgelabz;

import java.util.Scanner; // import scanner class

    public class EvenOdd {

        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);  // create scanner class object

            System.out.print("Enter a number: ");

            int num = reader.nextInt(); // nextInt() method is used and store the value in num variable

            if (num % 2 == 0) { // using % operator and check if it is divisible by 2 or not.

                System.out.println(num + " is even");

            } else {

                System.out.println(num + " is odd");
            }
        }
        }


