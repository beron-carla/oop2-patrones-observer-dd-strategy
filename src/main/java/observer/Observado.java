package observer;
//Subject
//Siempre es una clase abstracta

import java.util.List;

public abstract class Observado {

    //Conoce una lista de observers
    private List<Observer> observers;

    protected Observado(List<Observer> observers) {
        this.observers = observers;
    }

    //siempre va este metodo
    public void notificar(String temperatura) {
        for (Observer observer : observers) {
            observer.update(temperatura);
        }
    }
}
