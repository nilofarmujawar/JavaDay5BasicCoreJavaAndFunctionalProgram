package com.bridgelabz;

public class QuotientRemainder {

    public static void main(String[] args) {

        int dividend = 25, divisor = 4; //we have created two variables dividend and divisor

        int quotient = dividend / divisor; // we have used the / operator We have divided dividend (25) by divisor (4). Since both dividend and divisor are integers, the result will also be integer.

        int remainder = dividend % divisor; //find the remainder we use the % operator. Here, the dividend is divided by the divisor and the remainder is returned by the % operator.



        System.out.println("Quotient = " + quotient);//25 / 4 results 6.5, convert 6.5 to integer ,output will be 6

        System.out.println("Remainder = " + remainder);//25 % 4  results 1
    }
}

