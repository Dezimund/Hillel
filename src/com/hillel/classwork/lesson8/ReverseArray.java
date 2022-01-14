package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input numbers on array");

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = numbers.length - 1; i >= 0; i--) {

            System.out.println(numbers[i]);

        }
    }
}
