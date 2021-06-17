package ObserverPattern;

import java.util.ArrayList;

public abstract class MySubject {
    protected ArrayList observers = new ArrayList();

    public void attach(MyObserver obs){
    	observers.add(obs);
    }

    public void detach(MyObserver obs){
    	observers.remove(obs);
    }

    public abstract void cry();

}
