package dd.ejercicio1;

public class Piedra extends ElementoDeJuego {
    @Override
    public boolean leGanaA(ElementoDeJuego eleccionComputadora) {
        return eleccionComputadora.pierdeContraPiedra();
    }

    @Override
    public boolean pierdeContraPapel() {
        return true;
    }

    @Override
    public boolean pierdeContraTijera() {
        return false;
    }

    @Override
    public boolean pierdeContraPiedra() {
        return false;
    }
}
