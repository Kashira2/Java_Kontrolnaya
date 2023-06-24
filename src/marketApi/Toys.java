package marketApi;

import java.util.ArrayList;

public class Toys<Toy> {
    private ArrayList<Toy> toys;

    public Toys(ArrayList<Toy> toys) {
        this.toys = toys;
    }

    public Toys() {
        this(new ArrayList());
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }
}
