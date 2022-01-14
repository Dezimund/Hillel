package homework.task23;

public class CatMain {
    public static void main(String[] args) {

        Cat Barsik = new Cat("Barsik",7,5,"British");
        System.out.println(Barsik);

        Cat Morgan = new Cat("Morgan", 6);
        System.out.println(Morgan);

        Cat Diksy = new Cat("Diksy",3,3,"Sphynx");
        System.out.println(Diksy);


        System.out.println(Barsik.equals(Diksy));
        System.out.println(Morgan.equals(Barsik));
    }
}
