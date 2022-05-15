package application;

import list.SortedLinkedList;
import model.Animal;
import model.Person;
import model.Tail;

public class Main {
    public static void main(String[] args) {
       /*
            test your implementation here
        */

        Animal a1 = new Animal("Dog");
        Animal a2 = new Animal("Cat");
        Animal a3 = new Animal("Sheep");
        Animal a4 = new Animal("Bird");

        Person p1 = new Person(12);
        Person p2 = new Person(55);
        Person p3 = new Person(23);
        Person p4 = new Person(43);

        Tail t1 = new Tail(true);
        Tail t2 = new Tail(false);
        Tail t3 = new Tail(false);
        Tail t4 = new Tail(true);




        SortedLinkedList listAnimal = new SortedLinkedList();

        listAnimal.insert(a1);
        listAnimal.insert(a2);
        listAnimal.insert(a3);
        listAnimal.insert(a4);

        SortedLinkedList listPerson = new SortedLinkedList();

        listPerson.insert(p1);
        listPerson.insert(p2);
        listPerson.insert(p3);
        listPerson.insert(p4);

        SortedLinkedList listTail = new SortedLinkedList();

        listTail.insert(t1);
        listTail.insert(t2);
        listTail.insert(t3);
        listTail.insert(t4);


        System.out.println(listAnimal);

        listAnimal.delete(1);

        System.out.println(listAnimal);

        System.out.println(listAnimal.get(2));

        System.out.println(listPerson);

        listPerson.delete(0);

        System.out.println(listPerson);

        System.out.println(listTail);

        listTail.delete(3);

        System.out.println(listTail);




    }
}

