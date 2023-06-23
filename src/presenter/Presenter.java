package presenter;

import ui.View;
import marketApi.*;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view, Service service) {
        this.view = view;
        this.service = service;
        view.setPresenter(this);
    }

    public void showToys() {
        String answer = service.get();
        view.print(answer);
    }

    public void addToys() {
    }

    public void playToys() {
    }
}
