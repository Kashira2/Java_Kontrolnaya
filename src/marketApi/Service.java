package marketApi;

import java.io.Serializable;
import java.util.logging.FileHandler;


public class Service implements Serializable {
    private Integer quantity;
    private Toys<Toy> toys;
    private FileHandler file = new FileHandler();

    public Service(Toys<Toy> toys) {
        this.toys = toys;
    }

    public String get() {
        String res = "";
        for (Toy toy : toys) {
            res = res + toy.getName() + "\n";
        }
        return res;
    }

    public void load() {
            this.toys = (Toys<Toy>) file.getFile().inPut();
    }

    public void save() {
            file.getFile().outPut(toys);
    }
}
