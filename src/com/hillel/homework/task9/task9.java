package com.hillel.homework.task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task9 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input mark Math");
        int math = Integer.parseInt(reader.readLine());
        System.out.println("Input mark Algorithms");
        int algorithms = Integer.parseInt(reader.readLine());
        System.out.println("Input mark Data Structure");
        int dataStructure = Integer.parseInt(reader.readLine());
        System.out.println("Input mark English");
        int english = Integer.parseInt(reader.readLine());
        System.out.println("Input mark Physics");
        int physics = Integer.parseInt(reader.readLine());

        double average = avgMark(math,algorithms,dataStructure,english,physics);
        System.out.printf("Average mark : %.2f\n",average);

        if (average >=8 && average <=10){
            System.out.println("Scholarships\n");
        }
        else if(average >= 10){
            System.out.println("Increased scholarships\n");
        }
        else{
            System.out.println("No scholarship\n");
        }

    }

    public static int avgMark (int math,int algorithms,int dataStructure, int english,int physics )
    {return (math + algorithms + dataStructure + english + physics) / 5;}
}
