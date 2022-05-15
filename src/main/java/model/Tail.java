package model;

public class Tail implements Comparable<Tail>{
    boolean hasTail;

    public Tail(boolean hasTail) {
        this.hasTail = hasTail;
    }

    @Override
    public int compareTo(Tail t) {
        return Boolean.compare(this.hasTail, t.hasTail);
    }

    @Override
    public String toString() {
        return "Tail? " + hasTail + '\n' + "--------";
    }
}
