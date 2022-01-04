package homework.task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task19 {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        int[] mas = new int [5];

        for (int i=0; i<mas.length; i++){

            System.out.println("Input array :");
            mas[i] = Integer.parseInt(READER.readLine());

        }
        Arrays.sort(mas);

        System.out.println();

        for (int i : mas) {
            System.out.print(i + " ");
        }
    }




}
