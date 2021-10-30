package com.bridgelabz;
/**Author:Renu
* Date:30/10/21
* Purpose:Extend the max method to take more then three parameters:
*/

public class Generics {
        public static <T extends Comparable<T>> T maximum(T... elements) {
            T max = elements[0];
            for (T element : elements) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
            return max;// returns the largest object
        }
        public static void main(String args[]) {
            System.out.printf("Maximum number of (%d,%d,%d,%d) is : %d\n\n", 12, 18, 5, 10, maximum(12, 18, 5, 10));
            System.out.printf("Max of %.1f,%.1f,%.1f,%.1f is : %.1f\n\n", 6.6, 5.0, 13.1, 18.8, 6.7, maximum( 6.6, 5.0, 13.1, 18.8, 7.7 ));
            System.out.printf("Max of %s, %s, %s, %s is : %s\n","lemon", "apple", "grapes", "pineapple", maximum("lemon", "apple", "grapes", "pineapple"));

        }
    }
}

