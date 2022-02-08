package homework.task21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class task21 {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input array");
        int n = Integer.parseInt(READER.readLine());
        int[][] a = new int[n][n];
        Random randomnumbers = new Random();


        Standart(a, randomnumbers);


        System.out.println("Negative cells");

        Negative(a);
    }

    private static void Negative(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[i][j] < 0){
                    System.out.println("row : " +  i  + " line : " +  j);
                }

            }
            System.out.println();
        }
    }

    private static void Standart(int[][] a, Random randomnumbers) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = randomnumbers.nextInt(50) - 25;
                System.out.print( a[i][j]);
            }
            System.out.println();
        }
    }

}
