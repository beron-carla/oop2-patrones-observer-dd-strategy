package observer.ejercicio4.model;

import java.util.ArrayList;
import java.util.List;

public class RegistroDeParticipantes implements Observer {
    private List<Participante> participantes = new ArrayList<>();

    @Override
    public void update(String nombre, String telefono, String region, String email) {
        Participante participante = new Participante(nombre, telefono, region, email);
        participantes.add(participante);
    }

    public List<Participante> listaDeParticipantes() {
        return participantes;
    }
}
