package homework.task30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Converter {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        System.out.println("Input Temperature in Cels");

        double temp = Double.parseDouble(READER.readLine());



        Celsius tempC = new Celsius(temp);

        System.out.println("1 for Fahrenheit");
        System.out.println("2 for Kelvin");

        int a = Integer.parseInt(READER.readLine());


        switch (a){

            case 1 -> {
                Fahrenheit tempF = new Fahrenheit(temp);
                tempF.convert();
            }

            case 2 ->{
                Kelvin tempK = new Kelvin(temp);
                tempK.convert();
            }
            default -> System.out.println("No temp from the list");

        }






    }







}
