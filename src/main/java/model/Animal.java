package model;

public class Animal implements Comparable<Animal> {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Animal a) {
            return this.name.compareTo(a.name);
    }

    @Override
    public String toString() {
        return name + '\n' + "--------";
    }
}

