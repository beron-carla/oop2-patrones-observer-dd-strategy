package dd.ejercicio1;

public class Papel extends ElementoDeJuego {
    @Override
    public boolean leGanaA(ElementoDeJuego eleccionComputadora) {
        return eleccionComputadora.pierdeContraPapel();
    }

    @Override
    public boolean pierdeContraPapel() {
        return false;
    }

    @Override
    public boolean pierdeContraTijera() {
        return true;
    }

    @Override
    public boolean pierdeContraPiedra() {
        return false;
    }
}
