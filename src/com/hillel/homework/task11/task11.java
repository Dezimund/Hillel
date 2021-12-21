package com.hillel.homework.task11;

public class task11 {
    public static void main(String[] args) {


        double a = (double) (Math.random()*(600+1)) - 200;
        double b = (double) (Math.random()*(600+1)) - 200;
        double c = (double) (Math.random()*(600+1)) - 200;

        System.out.printf("Number a : %f\n",a);
        System.out.printf("Number b : %f\n",b);
        System.out.printf("Number c : %f\n",c);


        if (a<b && a<c){
            System.out.printf("Min : %f",a);
        }
        else if (b<a && b<c){
            System.out.printf("Min : %f",b);
        }
        else if (c<a && c<b){
            System.out.printf("Min : %f",c);
        }
        else {
            System.out.println("Numbers the same one");
        }

    }
}
