package homework.task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task10 {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input first number");
        double number1 = Double.parseDouble(READER.readLine());

        System.out.println("Input second number");
        double number2 = Double.parseDouble(READER.readLine());

        System.out.println("Input sign");
        String sign = READER.readLine();

        System.out.println("You Input :" + number1 + sign + number2);

        switch (sign) {
            case "+" -> System.out.println("Expression = " + sum(number1, number2));
            case "-" -> System.out.println("Expression = " + difference(number1, number2));
            case "/" -> System.out.println("Expression = " + division(number1, number2));
            case "*" -> System.out.println("Expression = " + multiplication(number1, number2));
            default -> System.out.println("Something wrong");
        }





    }

    private static double sum(double number1, double number2){
        return number1 + number2;
    }
    private static double difference(double number1, double number2){
        return number1 - number2;
    }
    private static double division(double number1, double number2){
        return number1/number2;
    }
    private static double multiplication(double number1, double number2){
        return number1*number2;
    }

}
