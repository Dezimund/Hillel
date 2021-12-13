package com.hillel.classwork.lesson5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ifelse {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input a");
        int number = Integer.parseInt(reader.readLine());
        System.out.println("number " + number);

        if (number > 0 ){
            System.out.println("Your number > 0");
        }
        else if (number == 0){
            System.out.println("Number is 0");
        }
        else {
            System.out.println("Your number < 0");
        }
    }
}