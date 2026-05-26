package dd.ejercicio3;

public class HistoriaUsuario extends TipoTarea {

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
        return item.puedeSerAgregadoPorHistoriaUsuario(this);
    }

    @Override
    public String toString() {
        return "Historia de Usuario";
    }


}
