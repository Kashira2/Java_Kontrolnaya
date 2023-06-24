package ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import marketApi.Toy;
import presenter.Presenter;

public class ConsoleUi implements View {
    private Scanner scanner;
    private Presenter presenter;
    private boolean work = true;

    public ConsoleUi() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void start() {
        // presenter.loadFile();
        while (work) {
            String key = scan();
            switch (key) {
                case "1":
                    presenter.showToys();
                    break;
                case "2":
                    String name = scanName();
                    Integer quant = scanQuant();
                    Double period = scanPeriod();
                    presenter.addToys(name, quant, period);
                    break;
                case "3":
                    print("Вам выпала игрушка = " + presenter.playToys().getName());
                    break;
                case "4":
                    print("Программа завершена!");
                    // presenter.saveFile();
                    work = false;
                    scanner.close();
                    break;
                default:
                    break;
            }

        }
    }

    private String scan() {
        System.out.println("""
                \nВыберите цифру соответствующую нужному пункту:
                1) Вывести список игрушек
                2) Добавить игрушку
                3) Розыгрышь игрушки
                4) Выйти из программы
                    """);
        return scanner.next();
    }

    private String scanName() {
        print("Введите имя новой игрушки: ");
        return scanner.next();
    }

    private Integer scanQuant() {
        print("Введите колличество этих игрушек: ");
        return scanner.nextInt();
    }

    private Double scanPeriod() {
        print("Введите частоту выпадения от 1 до 100%: ");
        return scanner.nextDouble();
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}