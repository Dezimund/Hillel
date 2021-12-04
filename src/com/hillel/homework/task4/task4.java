/*
Children made a snowman from 3 perfectly shaped snow balls. The balls were made with radius of 1m, 0.5m and 0.2m.
Considering that the density ratio of the snowballs is 0.7kg / m3, find how much the snowman weighs.
 */


package com.hillel.homework.task4;

public class task4 {
    public static void main(String[] args) {

        double part1 = 1.0;
        double part2 = 0.5;
        double part3 = 0.2;
        double densityRatio = 0.7;



        double weigh = (part1 + part2 + part3) * densityRatio;
        System.out.println("----------------------------------");
        System.out.printf("\nSnowman weigh : %.2f kilo\n",weigh);
        System.out.println("\n----------------------------------");


    }
}
