package dd.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemDeProyecto {

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

        if (!this.tipoTarea.puedeAgregarA(item)) {
            throw new RuntimeException(this.tipoTarea.toString() + " no puede agregarse en: " + item.tipoTarea().toString());
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
