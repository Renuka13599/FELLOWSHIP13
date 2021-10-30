package com.bridgelabz;
/**
*Author:Renu
*Date:30/10/21
*Purpose:To print element using array
*/


public class Generics {
        public static void toPrint(Integer[] inputArray) {
            for(int element : inputArray)
            {
                System.out.printf("%s",element);
            }
        }
        public static void toPrint(Double[] inputArray) {
            for(double element : inputArray)
            {
                System.out.printf("%s",element);
            }
        }
        public static void toPrint(Character[] inputArray) {
            for(char element : inputArray)
            {
                System.out.printf("%s",element);
            }
        }

        public static void main(String[] args) {
            Integer[] intArray={1, 2, 3, 4, 5};
            Double[] doubleArray={  1.1, 2.2,  3.3, 4.4};
            Character[] charArray={  'A', 'B', 'C'};
            com.bridgelabz.Generics.toPrint(intArray);
            com.bridgelabz.Generics.toPrint(doubleArray);
            com.bridgelabz.Generics.toPrint(charArray);
        }
    }


