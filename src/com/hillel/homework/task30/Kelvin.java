package homework.task30;

public class Kelvin extends Celsius{


    public Kelvin(double tempCels) {
        super(tempCels);
    }

    public void convert(){

        double K = tempCels + 273.15;
        System.out.println("Kelvin is " + K);

    }

}
