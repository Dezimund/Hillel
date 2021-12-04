/*
Find the result of an expression
| a- b | / (a + b) ^3 - √c
Any values into the variables a, b, c
 */




package com.hillel.homework.task5;
import java.util.Scanner;


public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a :");
        double a = in.nextDouble();
        System.out.println("\nInput b :");
        double b = in.nextDouble();
        System.out.println("\nInput c ");
        double c = in.nextDouble();



        double answer = Math.abs(a - b) / Math.pow((a + b),3) - Math.sqrt(c);
        System.out.printf("\n%.2f",answer);
    }
}
