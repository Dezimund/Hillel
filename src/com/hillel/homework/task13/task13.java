package com.hillel.homework.task13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task13  {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = (int) (Math.random() * 10);

        for (int i = 0; i < 10;i++){
            System.out.println("Input number");
            int b = Integer.parseInt(reader.readLine());

            if (b == a){
                System.out.printf("U win i`ts %d",b);
                break;
            }
            else if (b != a){
                System.out.println("Try again");
                continue;
            }
        }



    }



}
