package bean;

import java.util.Objects;

public class Dog {
    int age;
    String name;
    String color;

    public Dog(int age, String name, String color) {
    this.age = age;
    this.color = color;
    this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

      @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && name.equals(dog.name) && color.equals(dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, color);
    }
}
