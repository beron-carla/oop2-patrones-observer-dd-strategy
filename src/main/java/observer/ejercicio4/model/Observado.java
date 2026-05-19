package observer.ejercicio4.model;

import java.util.List;

public abstract class Observado {
    private List<Observer> observers;

    public Observado(List<Observer> observers) {
        this.observers = observers;
    }

    public void agregarObserver(Observer observer) {
        observers.add(observer);
    }

    protected final void notificar(String nombre, String telefono, String region, String email) {
        for (Observer observer : observers) {
            observer.update(nombre, telefono, region, email);

        }
    }
}



