package com.hillel.homework.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task6 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input type of plane");
        String type = reader.readLine();
        System.out.println("Input model of plane");
        String model = reader.readLine();
        System.out.println("Input Economy class passengers of plane");
        int economyClass = Integer.parseInt(reader.readLine());
        System.out.println("Input Business class passengers of plane");
        int businessClass = Integer.parseInt(reader.readLine());

        String jet = printAirplaneInfo(type,model);
        System.out.println(jet);

        String plane1 = printAirplaneInfo (type,model,economyClass);
        System.out.println(plane1);

        String plane2 = printAirplaneInfo(type,model,economyClass,businessClass);
        System.out.println(plane2);

    }


    public static String printAirplaneInfo(String type,String model){
        return (type + model);
    }

    public static String printAirplaneInfo(String type,String model,int economyClass){
        return (type + model + economyClass);
    }
    public static String printAirplaneInfo(String type,String model,int economyClass,int businessClass){
        return (type + model + economyClass + businessClass);
    }







}
