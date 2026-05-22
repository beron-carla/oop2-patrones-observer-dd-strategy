package dd.ejercicio1;

public class Tijera extends ElementoDeJuego {
    @Override
    public boolean leGanaA(ElementoDeJuego eleccionComputadora) {
        return eleccionComputadora.pierdeContraTijera();
    }

    @Override
    public boolean pierdeContraPapel() {
        return false;
    }

    @Override
    public boolean pierdeContraTijera() {
        return false;
    }

    @Override
    public boolean pierdeContraPiedra() {
        return true;
    }
}
