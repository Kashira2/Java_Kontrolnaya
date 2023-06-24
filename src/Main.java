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

        service.add("Кукла", 5, 30.00);
        service.add("Машинка", 5, 50.00);

        view.start();
    }
}