package dd.ejercicio3;

public class HistoriaUsuario extends TipoTarea {
    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";
    public static final String VALIDA_EPICA = "Solo spikes se permiten en una epica";

    @Override
    public void puedeSerAgregadoPorEpica(TipoTarea tareaCompleja) {
        throw new RuntimeException(VALIDA_EPICA);
    }

    @Override
    public void puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja) {
        throw new RuntimeException(VALIDA_HISTORIA);
    }


    @Override
    public void validarItem(ItemDeProyecto item) {
        item.puedeSerAgregadoPorHistoriaUsuario(this);
    }
}
