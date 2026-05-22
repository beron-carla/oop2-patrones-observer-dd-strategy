package dd.ejercicio4;

import dd.ejercicio3.HistoriaUsuario;
import dd.ejercicio3.Tarea;
import dd.ejercicio3.TareaCompleja;
import dd.ejercicio3.TareaDesarrollo;

public class Main {
    public static void main(String[] args) {
        var historiaUsuario = new TareaCompleja(100, new HistoriaUsuario());
        var task_01 = new Tarea(10, new TareaDesarrollo());
        var task_02 = new Tarea(10, new TareaDesarrollo());
        historiaUsuario.agregarItem(task_02);
        historiaUsuario.agregarItem(task_01);
        
    }
}
