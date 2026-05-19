package observer.ejercicio4;

import observer.ejercicio4.model.Participantes;
import observer.ejercicio4.model.RegistroDeParticipantes;
import observer.ejercicio4.model.ServicioDeEmail;
import observer.ejercicio4.ui.AgregarParticipante;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AgregarParticipante(new Participantes(List.of(new RegistroDeParticipantes(), new ServicioDeEmail())));
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
    }
}