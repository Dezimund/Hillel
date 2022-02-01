package homework.task28;

public class Tea extends Coffee{

    public Tea(){super(39);}


    @Override
    public String toString() {
        return "Tea " + "cost = " + cost;
    }

    public void make() {
        System.out.println("Bzzzhhhh make a Tea");
    }
}
