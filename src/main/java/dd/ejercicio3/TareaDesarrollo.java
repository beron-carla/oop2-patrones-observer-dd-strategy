package dd.ejercicio3;

public class TareaDesarrollo extends TipoTarea {

    public static final String VALIDA_EPICA = "Solo spikes se permiten en una epica";

    //OPCION 1 : LANZANDO EXCEPCIONES POR TODOS LADOS
//    @Override
//    public void puedeSerAgregadoPorEpica(TipoTarea tareaCompleja) {
//        throw new RuntimeException(VALIDA_EPICA);
//        //false
//    }
//
//    @Override
//    public void puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja) {
//        //Válido, solo tareas de desarrollo se permiten en una historia de usuario
//        //true
//    }
    @Override
    public boolean puedeSerAgregadoPorEpica(TipoTarea tareaCompleja) {
        return false; //solo spike puede ser agregado en epica
    }

    @Override
    public boolean puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja) {
        return true; //si, es válido
    }

    @Override
    public boolean puedeAgregarA(ItemDeProyecto item) {
        return false;
    }

    @Override
    public String toString() {
        return "Tarea de Desarollo";
    }

}
