package com.hillel.classwork.lesson4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Salary\n");
        System.out.println("Input salary month for first person\n");
        double first_person = in.nextDouble();
        System.out.println("Input salary month for second person\n");
        double second_person = in.nextDouble();
        System.out.println("Input salary per month for third person\n");
        double third_person = in.nextDouble();



        double salary_per_year1 = first_person * 12;
        double salary_per_year2 = second_person * 12;
        double salary_per_year3 = third_person * 12;

        System.out.println("Type years\n");
        int years = in.nextInt();

        double syears1 = salary_per_year1 * years;
        double syears2 = salary_per_year2 * years;
        double syears3 = salary_per_year3 * years;

        System.out.printf("For first person of this years : %f\n",syears1);
        System.out.printf("For second person of this years : %f\n",syears2);
        System.out.printf("For third person of this years : %f\n",syears3);

        /* % from salary */

        double perc = syears1 * 95 / 100;
        double perc2 = syears2 * 95 / 100;
        double perc3 = syears3 * 95 / 100;
        System.out.printf("For first person with tax : %f\n",perc);
        System.out.printf("For second person with tax : %f\n",perc2);
        System.out.printf("For third person with tax : %f\n",perc3);


        /// Average

        double avg = (perc + perc2 + perc3 )/3;
        System.out.printf("Average : %f\n",avg);



    }
}
