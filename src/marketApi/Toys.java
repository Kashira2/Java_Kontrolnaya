package marketApi;

import java.util.HashSet;

public class Toys<Toy> {
    private HashSet<Toy> toys;

    public Toys(HashSet<Toy> toys) {
        this.toys = toys;
    }

    public Toys() {
        this(new HashSet<>());
    }

    public HashSet<Toy> getTree() {
        return toys;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }
}
