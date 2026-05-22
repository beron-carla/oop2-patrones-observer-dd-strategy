package dd.ejercicio3;

public class Spike extends TipoTarea {
    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";

    @Override
    public void puedeSerAgregadoPorEpica(TipoTarea tareaCompleja) {
        //Valido
    }

    @Override
    public void puedeSerAgregadoPorHistoriaUsuario(TipoTarea tareaCompleja) {
        throw new RuntimeException(VALIDA_HISTORIA);
    }
}
