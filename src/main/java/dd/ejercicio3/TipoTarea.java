package dd.ejercicio3;

public abstract class TipoTarea {

    public static final String VALIDA_TAREA_COMPLEJA = "No puede crear Tarea de Desarrollo o Spike como Tarea Compleja";

    //OPCION 1: VOID
    //Todos los tipos lanzan exception
//    public abstract void puedeSerAgregadoPorEpica(TipoTarea tareaCompleja);
//    public abstract void puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja);
    //retorna boolean
    //public abstract boolean puedeSerAgregadoPorHistoriaUsuario()


    //OPCION 2 : RETORNA UN BOOLEANO
    public abstract boolean puedeSerAgregadoPorEpica(TipoTarea tareaCompleja);

    public abstract boolean puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja);


//1° dispatch - cada item sabe a quien llamar
    //OPCION 1
//    public void validarItem(ItemDeProyecto item) {
//
//        throw new RuntimeException(VALIDA_TAREA_COMPLEJA);
//    }

    //OPCION 2
    public abstract boolean puedeAgregarA(ItemDeProyecto item);
}
