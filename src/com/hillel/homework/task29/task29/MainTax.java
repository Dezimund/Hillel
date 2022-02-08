package homework.task29;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTax {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input square");
        double square = Double.parseDouble(READER.readLine());
        System.out.println("Input tax");
        double taxK = Double.parseDouble(READER.readLine());


        Choice(square, taxK);

    }

    private static void Choice(double square, double taxK) throws IOException {
        double revenue = 0;
        double resTax = 0;
        System.out.println("1 Residential");
        System.out.println("2 Commercial");
        System.out.println("3 Industrial");

        int a = Integer.parseInt(READER.readLine());
        switch (a){
            case 1 ->{
                System.out.println("Input residential tax");
                resTax = Double.parseDouble(READER.readLine());
                Residential residential = new Residential(square, taxK,resTax);
                System.out.println("Calculate :" + residential.calculateTax());

            }
            case 2 ->{
                System.out.println("Input revenue");
                revenue = Double.parseDouble(READER.readLine());
                Commercial commercial = new Commercial(square, taxK,revenue);
                System.out.println("Commercial" + commercial.calcRev());
            }
            case 3 ->{
                Industrial industrial = new Industrial(square, taxK);
                System.out.println("Industrial" + industrial.calculateTax());
            }
        }
    }


}
