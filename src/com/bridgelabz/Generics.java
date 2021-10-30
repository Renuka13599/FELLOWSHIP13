package com.bridgelabz;

public class Generics {
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is largest

        if (y.compareTo(max) > 0)
            max = y; // assume y is largest

        if (z.compareTo(max) > 0)
            max = z; // assume z is largest

        return max; // returns the largest object
    }

    public static void main(String args[]) {
        System.out.printf("Maximum number of (%d,%d,%d) is : %d\n\n", 102, 120,250, maximum(102, 120, 250)); //print the largest Integer number
        System.out.printf("Maximum of (%.1f, %.1f , %.1f) is : %.1f\n\n", 10.6, 2.8, 7.7, maximum(10.6, 2.8, 7.7)); //print the largest Float number
        System.out.printf("Maximum of (%s, %s,%s) is : %s\n", "mango", "apple", "icecream", maximum("mango", "apple", "icecraem"));//print the largest String

    }
}




