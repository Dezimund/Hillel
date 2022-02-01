package homework.task28;

public class Capuccino extends Coffee{


    public Capuccino(){super(40);}

    @Override
    public String toString() {
        return "Capuccino " + " cost = " + cost;
    }

    public void make() {
        System.out.println("Bzzzhhhh make a Capuccino");
    }
}
