package marketApi;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Service implements Serializable {
    private Integer quantity;
    private ArrayList<Toy> toys;
    private int id;
    private FileHandler file = new FileHandler();

    public Service(ArrayList<Toy> toys) {
        this.toys = toys;
    }

    public String get() {
        String res = "";
        for (Toy toy : toys) {
            res = res + toy.toString() + "\n";
        }
        return res;
    }

    public void add(String name, Integer quant, Double period) {
        Toy newToy = new Toy(++id, name, quant, period);
        toys.add(newToy);
    }

    public void save() {
        RandomToy random = new RandomToy();
        Toy toy = random.choosePeriod(toys);
        String text = toy.toString();
        try (FileWriter writer = new FileWriter("Toys.txt", true)) {
            writer.write(text);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        toys.remove(toy);
        toy.setQuantity(toy.getQuantity() - 1);
        toys.add(toy);
    }

    public void load() {
        this.toys = (ArrayList<Toy>) file.getFile().inPut();
    }

    public void savefile() {
        file.getFile().outPut(toys);
    }
}
