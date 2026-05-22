package dd.ejercicio3;

public interface ItemDeProyecto {
    int horasTotales();

    TipoTarea tipoTarea();

    //OPCION 1
//    public abstract void puedeSerAgregadoPorHistoriaUsuario(TipoTarea historia);
//
//    public abstract void puedeSerAgregadoPorEpica(TipoTarea epica);

    //OPCION 2
    public abstract boolean puedeSerAgregadoPorHistoriaUsuario(TipoTarea historia);

    public abstract boolean puedeSerAgregadoPorEpica(TipoTarea epica);

}
