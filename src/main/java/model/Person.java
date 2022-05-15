package model;

public class Person implements Comparable<Person> {
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age: " + age + '\n' + "--------";
    }

    @Override
    public int compareTo(Person p) {
        return Integer.compare(this.age, p.age);
    }
}
