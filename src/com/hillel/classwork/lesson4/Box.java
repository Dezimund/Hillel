package com.hillel.classwork.lesson4;
import java.util.Scanner;

public class Box {

    public static void main(String[] args) {

        // Volume of box width, height, depth
        Scanner in = new Scanner(System.in);
        System.out.println("Input Width");
        double width = in.nextDouble();
        System.out.println("Input heigth");
        double heigth= in.nextDouble() ;
        System.out.println("Input depth");
        double depth= in.nextDouble();

        double volume = calcVolume(width,heigth,depth);
        System.out.println(volume);

        System.out.println(calcVolume(width,heigth,depth));


    }

    public static double calcVolume(double width,double height, double depth){

        return width * height * depth;

    }


}
