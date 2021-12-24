/*
In Japan, numbers 4 and 9 are considered unlucky. You only need to output the lucky numbers between 0 and 100.

It is necessary to exclude from the output all numbers that contain 4 and 9.

(there should not be numbers 4 and 9, not only in the first ten, but also 14, 19, 24, 39, etc.)
*/

package com.hillel.homework.task12;

public class task12 {


    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            if (i / 10 == 4) {
                continue;
            } else if (i / 10 == 9) {
                continue;
            } else if (i % 10 == 4) {
                continue;
            } else if (i % 10 == 9) {
                continue;
            } else {
                System.out.println(i);
            }

        }

    }
}
