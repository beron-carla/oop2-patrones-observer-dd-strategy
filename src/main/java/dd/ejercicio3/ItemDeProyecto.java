package dd.ejercicio3;

public interface ItemDeProyecto {
    int horasTotales();

    TipoTarea tipoTarea();

    public abstract void puedeSerAgregadoPorHistoriaUsuario(TipoTarea historia);

    public abstract void puedeSerAgregadoPorEpica(TipoTarea epica);

}
