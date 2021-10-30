package com.bridgelabz;

public class Generics {
    public static <T extends Comparable<T>> T maximum(T... elements) {
        T max = elements[0];
        for (T element : elements) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
            else if(element.compareTo(max)>0)
            {
                max=element;
            }
        }
        return max;
    }
    public static void main(String args[]) {
        System.out.printf("Maximum number of (%d,%d,%d) is : %d\n\n", 12, 81, 10, maximum(12, 8, 10));
    }




