package homework.task27;

import java.util.Random;

public class Person {

    private String name;
    private String secondName;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String second_Name, int age, int weight, int height) {
        this.name = name;
        this.secondName = second_Name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }


    @Override
    public String toString() {
        return
                " Name = " + name +
                ", Second_Name = " + secondName +
                ", age = " + age +
                ", weight = " + weight +
                ", height = " + height
                ;
    }
}
