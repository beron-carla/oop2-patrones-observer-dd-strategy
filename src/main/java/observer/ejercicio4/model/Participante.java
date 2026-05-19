package observer.ejercicio4.model;

public class Participante {
    private final String nombre;
    private final Telefono telefono;
    private final String region;
    private final String email;

    public Participante(String nombre, String telefono, String region, String email) {
        this.email = email;
        if (nombre.isEmpty()) {
            throw new RuntimeException("Ingrese un nombre válido");
        }

        if (region.isEmpty()) {
            throw new RuntimeException("Ingrese un nombre válido");
        }
        this.nombre = nombre;
        this.telefono = new Telefono(telefono);
        this.region = region;
    }

    public String nombre() {
        return this.nombre;
    }

    public String telefono() {
        return this.telefono.string();
    }

    public String region() {
        return this.region;
    }

}
