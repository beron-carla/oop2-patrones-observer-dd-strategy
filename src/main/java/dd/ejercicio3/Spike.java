package dd.ejercicio3;

public class Spike extends TipoTarea {
    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";

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

    //OPCION 1 - LANZANDO EXCEPCIONES POR TODOS LADOS
//    @Override
//    public void puedeSerAgregadoPorEpica(TipoTarea tareaCompleja) {
//        //Valido
//    }
//
//    @Override
//    public void puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja) {
//        throw new RuntimeException(VALIDA_HISTORIA);
//    }
}
