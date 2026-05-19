package observer.ejercicios123;

public abstract class ObserverDecorator implements Observer {
    protected Observer observer;

    public ObserverDecorator(Observer observer) {
        this.observer = observer;
    }

    @Override
    public void update(String string) {
        this.observer.update(string);
    }
}
