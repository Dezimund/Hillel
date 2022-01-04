package homework.task18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class task18  {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int [] first = new int[7];
        int [] second = new int[7];


        for (int i = 0; i < first.length; i++) {
            first[i] = (int) (Math.random() * 9 );

        }




        for (int i = 0; i < second.length; i++) {
            System.out.println("Input 7 numbers ");
            second[i] = Integer.parseInt(READER.readLine());
        }


        Arrays.sort(first);
        System.out.println(Arrays.toString(first));

        Arrays.sort(second);
        System.out.println(Arrays.toString(second));





        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if(j == i){
                    continue;
                }
                else if(second[j] == first[i]){
                    System.out.println();
                    System.out.println(first[i]);
                    System.out.println("Guessed");
                    break;

                }
            }
        }

    }



   /* private static int arrays() {
        int [] array = new int[6];
        return array;
    }
    */

}
