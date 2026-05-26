package dd.ejercicio3;

public abstract class TipoTarea {

    public abstract boolean puedeSerAgregadoPorEpica(TipoTarea tareaCompleja);

    public abstract boolean puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja);

    public abstract boolean puedeAgregarA(ItemDeProyecto item);
}
