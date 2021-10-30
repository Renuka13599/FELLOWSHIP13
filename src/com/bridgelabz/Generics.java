package com.bridgelabz;
/**
*Author : Renu
 * date : 30/10/2021
 * Purpose:find the Integer,char,float value to print using generic
 */


public class Generics {
    public static <R> void toPrint(R[] inputArray) {
        for (R element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'A', 'B', 'C'};
        Generics.toPrint(intArray);
        Generics.toPrint(doubleArray);
        Generics.toPrint(charArray);
    }
}
