package list;

import model.Animal;

public class SortedLinkedList<V extends Comparable<V>> implements SortedList<V> {
    Node<V> head;
    int size;


    @Override
    public void insert(V element) {
        Node<V> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        } else {
            Node<V> current = head;
            Node<V> prev = head;
            while (current != null && current.getValue().compareTo(newNode.getValue()) < 0) {
                prev = current;
                current = current.next;

            }
            if (current == head) {
                newNode.setNext(current);
                head = newNode;
            } else {
                prev.setNext(newNode);
                newNode.setNext(current);
            }
            size++;
        }

    }


    @Override
    public boolean delete(int index) {
        if(head == null){
            return false;
        }

        if (index <= size && index >= 0) {
            if(index == 0){
                head = head.next;
            } else{
                Node<V> current = head;
                int counter = 0;

                while (current != null && counter < index -1) {
                    current = current.next;
                    counter++;
                }
                current.setNext(current.next.next);
                size--;
                return true;
            }

        }
        return false;
    }

    @Override
    public V get(int index) {
        int indexCount = 0;
        Node<V> current = head;
        while (current != null) {
            if (index == indexCount) {
                return (V) current.getValue();
            }
            indexCount++;
            current = current.next;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String string = "";
        Node<V> current = head;
        while (current != null) {
            string += current.getValue() + "\n";
            current = current.next;
        }
        return string;
    }

    private class Node<V> {
        private final V value;
        private Node next;

        public Node(V value) {
            this.value = value;
        }

        public V getValue() {
            return value;
        }


        public void setNext(Node next) {
            this.next = next;
        }
    }
}
