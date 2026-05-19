package observer.ejercicio4.model;

public class ServicioDeEmail implements Observer {

    @Override
    public void update(String nombre, String telefono, String region, String email) {
        System.out.println("Destinatario: " + nombre + " - " + "Su Inscripcion fue exitosa");
    }
}
