/*Given 2 variables a and b.
Output them to the console.
Swap the values of the variables so that the variable a contains the value from the variable b and the variable b contains the value from the variable a. */


package com.hillel.homework.homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a :");
        double a = in.nextDouble();
        System.out.println("Input b :");
        double b = in.nextDouble();

        System.out.printf("\na : %.2f\n", a);
        System.out.printf("b : %.2f\n", b);
        // Some C vibes


        a += b;
        b = a - b;
        a -= b;

        System.out.printf("\na :%.2f\n",a);
        System.out.printf("b :%.2f\n",b);




     /*   double replaceB = a;
        double replaceA = b;

        System.out.printf("\na : %.2f\n", replaceA);
        System.out.printf("b : %.2f\n", replaceB); */


    }

}
