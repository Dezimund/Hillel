package com.hillel.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;

public class Array {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input array size :");
        int[] numbers = new int[Integer.parseInt(reader.readLine())];


      /*  int num = numbers[0];
        System.out.println(num);

        System.out.println(numbers[4]);

        numbers[3] = 500;
        System.out.println(numbers[3]);
*/

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("input " + i + " element");
           numbers[i] = Integer.parseInt(reader.readLine());

        }
        printArray(numbers);
    }

    public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i + " index " + numbers[i]);

        }
    }




}
