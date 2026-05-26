package dd.ejercicio3;

public class Epica extends TipoTarea {
    @Override
    public boolean puedeSerAgregadoPorEpica(TipoTarea tareaCompleja) {
        return false;
    }

    @Override
    public boolean puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja) {
        return false;
    }

    @Override
    public boolean puedeAgregarA(ItemDeProyecto item) {
        return item.puedeSerAgregadoPorEpica(this);
    }

    @Override
    public String toString() {
        return "Epica";
    }

}
