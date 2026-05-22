package dd.ejercicio3;

public class Tarea implements ItemDeProyecto {
    public static final String VALIDA_TAREA_SIMPLE = "No puede crear una Epica o HS como tarea simple";
    private int horasEstimadas;
    private TipoTarea tipoTarea;

    public Tarea(int horasEstimadas, TipoTarea tipoTarea) {
        if (tipoTarea.getClass() == Epica.class || tipoTarea.getClass() == HistoriaUsuario.class) {
            throw new RuntimeException(VALIDA_TAREA_SIMPLE);
        }
        this.horasEstimadas = horasEstimadas;
        this.tipoTarea = tipoTarea;
    }

    @Override
    public int horasTotales() {
        return this.horasEstimadas;
    }

    @Override
    public TipoTarea tipoTarea() {
        return tipoTarea;
    }

    @Override
    public void puedeSerAgregadoPorHistoriaUsuario(TipoTarea historia) {
        this.tipoTarea.puedeSerAgregadoPorHistoriaUsuario(historia);
    }

    @Override
    public void puedeSerAgregadoPorEpica(TipoTarea epica) {
        this.tipoTarea.puedeSerAgregadoPorEpica(epica);
    }
}
