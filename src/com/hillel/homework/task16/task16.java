package com.hillel.homework.task16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task16 {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int[] big = new int[20];
        int[] smaller1 = new int[10];
        int[] smaller2 = new int[10];

        for (int i = 0; i < big.length; i++) {
            System.out.println("Input numbers");
            big[i] = Integer.parseInt(READER.readLine());
        }

            smaller1 = Arrays.copyOfRange(big, 0,9);
            smaller2 = Arrays.copyOfRange(big, 10,20);



        for (int i = 0; i < smaller1.length; i++) {
            System.out.println(smaller1[i]);




        }
        System.out.println("End of first");


            for (int i = 0; i < smaller2.length; i++) {
                System.out.println(smaller2[i]);




        }
        System.out.println("End of second");

    }
}
