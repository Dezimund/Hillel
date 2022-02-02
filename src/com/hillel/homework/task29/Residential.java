package homework.task29;

public class Residential {

    public static void main(String[] args) {

        System.out.println("Square and taxK");

        Tax tax = new Tax(60,20);

        double formula = (tax.square * tax.taxK);

        System.out.println("Value of formule : " + formula);

        formula *= 0.15;

        System.out.println("Tax with percentage");
        System.out.println(formula);
    }



}
