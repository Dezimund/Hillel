package homework.task28;

public class Americano extends Coffee{


    public Americano(){super(35);}

    @Override
    public String toString() {
        return "Americano " + "cost = " + cost;
    }

    public void make() {
        System.out.println("Bzzzhhhh make a Americano");
    }

}
