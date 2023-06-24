package marketApi;

import java.util.ArrayList;

public class RandomToy {
    public Toy choosePeriod(ArrayList<Toy> toys) {
        double period = 0.0;
        for (Toy toy : toys)
            period += toy.getPeriod();
        double rand = Math.random() * period;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getPeriod();
            if (countWeight >= rand)
                return toy;
        }
        throw new RuntimeException("Нет игрушек");
    }
}
