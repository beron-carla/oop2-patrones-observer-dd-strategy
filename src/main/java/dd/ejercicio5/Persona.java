package dd.ejercicio5;

public class Persona {
    private static int contadorId = 0;
    private int id;
    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.id = contadorId++;
    }

    public String nombre() {
        return this.nombre;
    }

    public String apellido() {
        return this.apellido;
    }

    public String dni() {
        return this.dni;
    }
}
