package dd.ejercicio3;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTareas {
    @DisplayName("Calculo total de horas.")
    @Test
    public void calculoHoras() {

        var historiaUsuario = new TareaCompleja(100, new HistoriaUsuario());
        var task_01 = new Tarea(10, new TareaDesarrollo());
        var task_02 = new Tarea(10, new TareaDesarrollo());
        historiaUsuario.agregarItem(task_02);
        historiaUsuario.agregarItem(task_01);
        assertEquals(120, historiaUsuario.horasTotales());
    }

    @DisplayName("Un Spike no se puede añadir en una Historia de Usuario")
    @Test
    public void historiaUsuarioNoPuedeTenerSpike() {

        var history = new TareaCompleja(110, new HistoriaUsuario());
        var spike = new Tarea(10, new Spike());
        var e = assertThrows(RuntimeException.class, () -> {
            history.agregarItem(spike);
        });
        assertEquals(Spike.VALIDA_HISTORIA, e.getMessage());
    }

    @DisplayName("Una Tarea de Desarrollo no se puede añadir en una Epica")
    @Test
    public void epicaNoPuedeTenerTareaDeDesarrollo() {
        var epica = new TareaCompleja(100, new Epica());
        var tareaDesarrollo = new Tarea(10, new TareaDesarrollo());
        var e = assertThrows(RuntimeException.class, () -> {
            epica.agregarItem(tareaDesarrollo);
        });

        assertEquals(TareaDesarrollo.VALIDA_EPICA, e.getMessage());
    }

    @DisplayName("Una historia de usuario tiene una tarea")
    @Test
    public void historiaDeUsuarioPuedeTenerTareaDesarrollo() {

        var history = new TareaCompleja(100, new HistoriaUsuario());
        var task = new Tarea(10, new TareaDesarrollo());
        history.agregarItem(task);
        assertTrue(history.tieneTarea(task));
    }

    @DisplayName("una epica tiene un spike")
    @Test
    public void epicaPuedeTenerSpike() {
        var epica = new TareaCompleja(100, new Epica());
        var spike = new Tarea(10, new Spike());
        epica.agregarItem(spike);
        assertTrue(epica.tieneTarea(spike));
    }
}
