package strategy.ejercicio2;

public class Persona {
    private String nombre;
    private String apellido;
    private FechaDeNacimiento fechaDeNacimiento;

    public Persona(String nombre, String apellido, FechaDeNacimiento fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String fechaDeNacimiento() {
        return this.fechaDeNacimiento.fechaDeNacimiento();
    }
}
