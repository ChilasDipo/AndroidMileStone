package model;

import java.util.ArrayList;

public class Model {
    String Text;
    public Model() {
    }

    public String getText() {
        return Text;
    }

    public void setText(String input) {
        Text = input;
        notifyObservers();
    }

    private ArrayList<TextChangeObserver> observers = new ArrayList<TextChangeObserver>();

    private void notifyObservers() {
        for (TextChangeObserver observer : observers) {
            observer.update();
        }
    }
    public void addTextChangeObserver(TextChangeObserver observer) {
        if (!observers.contains(observers))
            observers.add(observer);
    }
    public void removeTextChangeObserver(TextChangeObserver observer) {
        observers.remove(observer);
    }
    public interface TextChangeObserver {
        public void update();
    }


}
