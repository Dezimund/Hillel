package com.hillel.classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        System.out.println("as string\n" + str);

        double d = Double.parseDouble(str);
        System.out.println("as double " + d);

    }
}
