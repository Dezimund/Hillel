package com.hillel.homework.task8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task8 {
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input length");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Input height");
        int height = Integer.parseInt(reader.readLine());
        System.out.println("Input width");
        int width = Integer.parseInt(reader.readLine());

        if (height >= 40 && height <= 53 && width >= 20 && width <= 22 && length >= 40 && length <=55){
            System.out.println("Your luggage fits your carry-on baggage");
        }
        else {
            System.out.println("Not suitable for carry-on luggage");
        }
    }
}
