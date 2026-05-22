package dd.ejercicio1;

public abstract class ElementoDeJuego {
    public abstract boolean leGanaA(ElementoDeJuego eleccionComputadora);

    public abstract boolean pierdeContraPapel();

    public abstract boolean pierdeContraTijera();

    public abstract boolean pierdeContraPiedra();

    public boolean empataCon(ElementoDeJuego elementoDeJuego) {
        return this.getClass().equals(elementoDeJuego.getClass());
    }
}
