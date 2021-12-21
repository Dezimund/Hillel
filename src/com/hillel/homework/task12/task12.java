package com.hillel.homework.task12;

public class task12 {


    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            if (i % 10 == 4 || i % 100 == 4) {
                continue;
            } else if (i % 10 == 9 || i % 100 == 9) {
                continue;
            } else {
                System.out.println(i);
            }

        }

    }
}