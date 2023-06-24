import java.util.ArrayList;
import marketApi.Service;
import marketApi.Toy;
import presenter.Presenter;
import ui.ConsoleUi;

public class Main {
    public static void main(String[] args) {
        ArrayList<Toy> toys = new ArrayList<Toy>();
        Service service = new Service(toys);
        ConsoleUi view = new ConsoleUi();
        Presenter presenter = new Presenter(view, service);
        view.start();
    }
}