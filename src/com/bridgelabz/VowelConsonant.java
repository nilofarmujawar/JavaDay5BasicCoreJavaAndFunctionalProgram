package com.bridgelabz;

public class VowelConsonant {

    public static void main(String[] args) {

        char ch = 'z';

        switch (ch) { // using switch case
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println(ch + " is vowel");
                break;

            default:
                System.out.println(ch + " is consonant");

   //If ch is either of cases: ('a', 'e', 'i', 'o', 'u'), vowel is printed. Else, default case is executed and consonant is printed
        }
    }

}
