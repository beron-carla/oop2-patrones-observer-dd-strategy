package dd.ejercicio3;

public class Spike extends TipoTarea {
    @Override
    public boolean puedeSerAgregadoPorEpica(TipoTarea tareaCompleja) {
        return true; //válido, solo spike pueden ser agregados en epicas
    }

    @Override
    public boolean puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja) {
        return false;
    }

    @Override
    public boolean puedeAgregarA(ItemDeProyecto item) {
        return false; //NO PUEDE AGREGAR
    }

    @Override
    public String toString() {
        return "Spike";
    }

}
