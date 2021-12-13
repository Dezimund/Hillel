package com.hillel.classwork.lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input lenght");
        double lenght = in.nextDouble();
        System.out.println("Input width");
        double width = in.nextDouble();
        System.out.println("Input height");
        double height = in.nextDouble();

        int maxWight = 58;

        double volume = calculateVolume(lenght, width, height);
        System.out.printf("Volume : %.2f\n",volume);

        double weight = totalWeight(maxWight,volume);
        System.out.printf("Weight : %.2f\n",weight);

    }

    public static double calculateVolume(double lenght, double width, double height) {
        return lenght * height * width;
    }

    public static double totalWeight(int maxWight, double volume) {
        return  maxWight * volume;



    }

}
