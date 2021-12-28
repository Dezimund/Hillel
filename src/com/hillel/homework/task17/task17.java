package com.hillel.homework.task17;

import java.util.Arrays;

public class task17 {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];

        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + (int) (Math.random()*12);

        }
        System.out.println("Ages of team 1");
        System.out.println(Arrays.toString(team1));

        for (int i = 0; i < team2.length; i++) {
            team2[i] = 18 + (int) (Math.random()*12);

        }
        System.out.println("Ages of team 2");
        System.out.println(Arrays.toString(team2));

        double avg1 = 0;
        double avg2 = 0;

        for (int i = 0; i < 25; i++) {
            avg1 += team1[i];
            avg2 += team2[i];
        }

        avg1/=25;
        avg2/=25;

        System.out.printf("\nAverage of first team : %.2f\n" , avg1);
        System.out.printf("\nAverage of first team : %.2f\n" , avg2);
    }
}
