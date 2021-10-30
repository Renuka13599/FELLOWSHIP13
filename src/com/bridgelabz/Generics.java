package com.bridgelabz;

public class Generics {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "banana";
        String s3 = "peach";

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