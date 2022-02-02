package homework.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Industrial {



    public static void main(String[] args) {

        System.out.println("Square and taxK");

        Tax tax = new Tax(100,20);

        double formula = (tax.square * tax.taxK);

        System.out.println("Value of formule : " + formula);



    }

}
