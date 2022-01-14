package homework.task23;

import java.util.Objects;

public class Cat {

    String name;
    int age;
    float weigh;
    String breed;

    public Cat() {
        System.out.println("Cat has been created!");
    }

    public Cat(String name,int age,float weigh,String breed) {
        this.breed = breed;
        this.age = age;
        this.name = name;
        this.weigh = weigh;

    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigh=" + weigh +
                ", breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Float.compare(cat.weigh, weigh) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, weigh);
    }
}
