package dd.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemDeProyecto {

    public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";
    public static final String VALIDA_EPICA = "Solo spikes se permiten en una epica";
    public static final String VALIDA_TAREA_COMPLEJA = "No puede crear TS o Spike como Tarea Compleja";
    private List<ItemDeProyecto> items;
    private int horasEstimadas;
    private TipoTarea tipoTarea;

    public TareaCompleja(int horasEstimadas, TipoTarea tipoTarea) {
        if (tipoTarea.getClass() == TareaDesarrollo.class || tipoTarea.getClass() == Spike.class) {
            throw new RuntimeException(VALIDA_TAREA_COMPLEJA);
        }
        this.horasEstimadas = horasEstimadas;
        this.tipoTarea = tipoTarea;
        items = new ArrayList<>();
    }

    public void agregarItem(ItemDeProyecto item) {
        //Una historia de usuario solo puede tener tareas de desarrollo
        //Una Epica solo puede tener Apikes

//        if (this.tipoTarea.equals(TipoTarea.HISTORIA_USUARIO)
//                && !item.tipoTarea().equals(TipoTarea.TAREA_DESARROLLO)) {
//            throw new RuntimeException(VALIDA_HISTORIA);
//        }
//        if (this.tipoTarea.equals(TipoTarea.EPICA)
//                && !item.tipoTarea().equals(TipoTarea.SPIKE)) {
//            throw new RuntimeException(VALIDA_EPICA);
//        }
//
//        this.tipoTarea.validarItem(item);
        //el metodo polimorfico TipoTarea con dd retorna un booleano
        //Si no puede ser agregado, Tarea compleja tira  exception
        //throw new RuntimeException()
        if (!this.tipoTarea.puedeAgregarA(item)) {
            throw new RuntimeException(this.tipoTarea.toString() + " no puede agregarse en: " + item.toString());
        }
        this.items.add(item);
    }


    @Override
    public int horasTotales() {
        int horasTotales = this.horasEstimadas;
        for (ItemDeProyecto item : items) {
            horasTotales += item.horasTotales();
        }
        return horasTotales;
    }

    @Override
    public TipoTarea tipoTarea() {
        return this.tipoTarea;
    }

    //OPCION 1
//    @Override
//    public void puedeSerAgregadoPorHistoriaUsuario(TipoTarea historia) {
//        this.tipoTarea.puedeSerAgregadoPorHistoriaUsuario(historia);
//    }
//
//    @Override
//    public void puedeSerAgregadoPorEpica(TipoTarea epica) {
//        this.tipoTarea.puedeSerAgregadoPorEpica(epica);
//    }

    //OPCION 2 - RETORNO DE BOOLEANO - RESUELVO EL LANZAMIENTO DE EXCEPCIONES EN TAREA COMPLEJA
    @Override
    public boolean puedeSerAgregadoPorHistoriaUsuario(TipoTarea historia) {
        return this.tipoTarea.puedeSerAgregadoPorHistoriaUsuario(historia);
    }

    @Override
    public boolean puedeSerAgregadoPorEpica(TipoTarea epica) {
        return this.tipoTarea.puedeSerAgregadoPorEpica(epica);
    }

    public boolean tieneTarea(ItemDeProyecto tarea) {
        for (ItemDeProyecto t : this.items) {
            if (t.equals(tarea)) return true;
        }
        return false;
    }
}
