package homework.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Commercial {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {

        System.out.println("Square and taxK");

        Tax tax = new Tax(80,20);

        double revenue = Double.parseDouble(READER.readLine());

        if (revenue > 100){
            double formula = (tax.square * tax.taxK);

            System.out.println("Value of formule : " + formula);
        }else{
            System.out.println("No tax");
        }







    }


}
