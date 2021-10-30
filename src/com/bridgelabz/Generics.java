package com.bridgelabz;
/**
* Author : Renu
 * date : 30/10/2021
 * Purpose:find the Integer value which is maximum"
 */



public class Generics {
    public static void main(String[] args) {
        Integer s1 = 10;
        Integer s2 = 20;
        Integer s3 = 30;
        System.out.println(getMax(s1,s2,s3));
    }

    private static <T extends Comparable> T getMax(T a, T b, T c) {

        if (a.compareTo(b) > 0 && a.compareTo(c) > 0)
            return a;
        else if (b.compareTo(a) > 0 && b.compareTo(c) > 0)
            return b;
        else
            return c;
    }
}

