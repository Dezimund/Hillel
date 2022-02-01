package homework.task28;

public class Latte extends Coffee{

    public Latte(){super(35);}

    @Override
    public String toString() {
        return "Latte " + "cost = " + cost ;
    }

    public void make() {
        System.out.println("Bzzzhhhh make a Latte");
    }
}
