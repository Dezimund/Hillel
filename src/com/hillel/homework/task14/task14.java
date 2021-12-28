package com.hillel.homework.task14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task14 {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {


        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(READER.readLine());

        }
        System.out.println(Arrays.toString(array));

        boolean Sequence = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {

                Sequence = false;
                break;
            }

        }
        if(Sequence){
            System.out.println("Increase");
        }
        else {
            System.out.println("Decrease");
        }


    }
}
