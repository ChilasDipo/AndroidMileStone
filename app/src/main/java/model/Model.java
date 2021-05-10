package model;

import java.util.ArrayList;

public class Model {
    private String text;
    public Model() {
    }

    public String getText() {
        return text;
    }

    public void setText(String input) {
        text = input;
        notifyObservers();
    }

    private ArrayList<TextChangeObserver> observers = new ArrayList<TextChangeObserver>();

    private void notifyObservers() {
        for (TextChangeObserver observer : observers) {
            observer.update();
        }
    }
    public void addTextChangeObserver(TextChangeObserver observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }
    public void removeTextChangeObserver(TextChangeObserver observer) {
        observers.remove(observer);
    }
    public interface TextChangeObserver {
        public void update();
    }


}
