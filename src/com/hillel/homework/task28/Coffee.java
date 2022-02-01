package homework.task28;

public class Coffee {

    protected int cost;


    public Coffee(int cost) {
        this.cost = cost;
    }


    public void make(){
        System.out.println("Make a coffee");
    }

    public int sum(){
        return cost;
    }


    @Override
    public String toString() {
        return "Coffee" + "cost = " + cost;
    }
}
