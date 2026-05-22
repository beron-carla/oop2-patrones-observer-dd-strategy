package dd.ejercicio3;

public class Epica extends TipoTarea {
    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";
    public static final String VALIDA_EPICA = "Solo spikes se permiten en una epica";

    //OPCION 1
//    @Override
//    public void puedeSerAgregadoPorEpica(TipoTarea tareaCompleja) {
//        throw new RuntimeException(VALIDA_EPICA);
//    }
//    @Override
//    public void puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja) {
//        throw new RuntimeException(VALIDA_HISTORIA);
//    }
//    @Override
//    public void validarItem(ItemDeProyecto item) {
//        item.puedeSerAgregadoPorEpica(this);
//    }
    //OPCION 2


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
