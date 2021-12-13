package com.hillel.homework.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task7 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number of cats");
        int cats = Integer.parseInt(reader.readLine());
        System.out.println("Input number of dogs");
        int dogs = Integer.parseInt(reader.readLine());
        System.out.println("Input grams of feed");
        int feed = Integer.parseInt(reader.readLine());
        System.out.println("Input cost of cost");
        int cost = Integer.parseInt(reader.readLine());

        int eat_per_day = 3;

        double feedCatsMonth = feed_month_cats(cats,feed,eat_per_day);
        System.out.printf("Quantity feed for cats : %.2f\n",feedCatsMonth);
        double feedDogsMonth = feed_month_dogs(dogs,feed,eat_per_day);
        System.out.printf("Quantity feed for cats : %.2f\n",feedDogsMonth);
        double overallFeed = feedDogsMonth + feedCatsMonth;

        double overallMoney = moneyMonth(overallFeed,cost,feed);
        System.out.printf("Overall Money : %.2f",overallMoney);

    }

    public static double feed_month_dogs(int dogs,int feed, int eat_per_day)
    {return feed * dogs * eat_per_day * 30;}

    public static double feed_month_cats(int cats,int feed, int eat_per_day)
    {return feed * cats * eat_per_day * 30;}

    public static double moneyMonth (double overallFeed,int cost,int feed){return overallFeed / feed / cost;}



}
