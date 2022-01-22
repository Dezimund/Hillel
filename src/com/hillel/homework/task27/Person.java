package homework.task27;

public class Person {

    private String Name;
    private String Second_Name;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String second_Name, int age, int weight, int height) {
        this.Name = name;
        this.Second_Name = second_Name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String second_Name) {
        Name = name;
        Second_Name = second_Name;
    }


    @Override
    public String toString() {
        return
                " Name = " + Name +
                ", Second_Name = " + Second_Name +
                ", age = " + age +
                ", weight = " + weight +
                ", height = " + height
                ;
    }
}
