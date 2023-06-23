package ui;

import java.util.Scanner;

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
                case "2":
                    presenter.addToys();
                case "3":
                    presenter.playToys();
                case "4":
                    print("Программа завершена!");
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

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}