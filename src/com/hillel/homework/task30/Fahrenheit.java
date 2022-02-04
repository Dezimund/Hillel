package homework.task30;

public class Fahrenheit extends Celsius{


    public Fahrenheit(double tempCels) {
        super(tempCels);
    }

    @Override
    public void convert() {

        double F = 32 + (tempCels * 9 / 5) ;
        System.out.println("Farenheit is " + F);


    }
}
