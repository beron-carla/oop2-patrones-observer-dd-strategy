package observer.ejercicio4.model;

import java.util.List;

public class Participantes extends Observado {

    public Participantes(List<Observer> observers) {
        super(observers);

    }

    public void nuevoParticipante(String nombre, String telefono, String region, String email) {
        this.notificar(nombre, telefono, region, email);
    }
}
