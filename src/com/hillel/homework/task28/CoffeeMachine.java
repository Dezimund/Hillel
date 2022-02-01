package homework.task28;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Coffee americano = new Americano();
        Coffee latte = new Latte();
        Coffee tea = new Tea();
        Coffee capuccino = new Capuccino();

        List<Coffee> coffee = new ArrayList<>();
        int a = 0;
        int sum = 0;

        System.out.println("____Coffee machine is ready, choose what u want below____");
        System.out.println("    Input 1 for Americano    ");
        System.out.println("    Input 2 for Latte    ");
        System.out.println("    Input 3 for Capuccino    ");
        System.out.println("    Input 4 for Tea    ");
        System.out.println("    Input 5 if u finish ur choice    ");



        machine(americano, latte, tea, capuccino, coffee,a);

        int finalSum = Summ(coffee, sum);


        System.out.println("Ur order is " + coffee);
        make(coffee);
        System.out.println("Sum is " + finalSum);




    }

    private static void make(List<Coffee> coffee) {
        for (Coffee coffees: coffee) {
            coffees.make();

        }
    }

    private static int Summ(List<Coffee> coffee, int sum) {
        for (int i = 0; i < coffee.size(); i++) {
            sum = coffee.stream().mapToInt(Coffee::sum).sum();
        }
        return sum;
    }

    private static void machine(Coffee americano, Coffee latte, Coffee tea, Coffee capuccino, List<Coffee> coffee, int a) throws IOException {
        do {
            a = Integer.parseInt(READER.readLine());
            switch (a){
                case 1 -> {
                    coffee.add(americano);
                    System.out.println("Added Americano");
                }
                case 2 -> {
                    coffee.add(latte);
                    System.out.println("Added Latte");
                }
                case 3 -> {
                    coffee.add(capuccino);
                    System.out.println("Added Capuccino");
                }
                case 4 -> {
                    coffee.add(tea);
                    System.out.println("Added Tea");
                }
                default -> {
                    System.out.println("Exit from choice selector");
                }

            }

        } while (a < 5);
    }






}
