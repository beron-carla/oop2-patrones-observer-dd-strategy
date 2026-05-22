package dd.ejercicio3;

public abstract class TipoTarea {

    public static final String VALIDA_TAREA_COMPLEJA = "No puede crear Tarea de Desarrollo o Spike como Tarea Compleja";

    public abstract void puedeSerAgregadoPorEpica(TipoTarea tareaCompleja);

    public abstract void puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja);

    //1° dispatch - cada item sabe a quien llamar
    public void validarItem(ItemDeProyecto item) {

        throw new RuntimeException(VALIDA_TAREA_COMPLEJA);
    }
}
