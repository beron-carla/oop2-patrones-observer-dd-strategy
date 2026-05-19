package observer.ejercicios123;
//Subject
//Siempre es una clase abstracta

public abstract class Observado {

    //Conoce una lista de observers
    //sin decorator
//    private List<Observer> observers;

    //con decorator
    private Observer observers;

    protected Observado(Observer observers) {
        this.observers = observers;
    }

    //siempre va este metodo
    public void notificar(String temperatura) {
        //sin decorator
//        for (Observer observer : observers) {
//            observer.update(temperatura);
//        }

        //con decorator
        observers.update(temperatura);
    }
}
