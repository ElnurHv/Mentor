package Leson_6;

public class Actor {
    String name;
    int age;

    public Actor(String actor, int age) {
        this.name = actor;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "actor=" + name +
                ", age=" + age +
                '}';
    }
}

