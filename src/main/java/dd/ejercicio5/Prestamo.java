package dd.ejercicio5;

import java.time.LocalDate;

public class Prestamo {
    private static int contadorId = 0;
    private Persona persona;
    private Articulo articulo;
    private LocalDate fechaInicioPrestamo;
    private LocalDate fechaDevolucionPrestamo;
    private int id;

    public Prestamo(Persona persona, Articulo articulo, LocalDate fechaInicioPrestamo, LocalDate fechaDevolucionPrestamo) {
        this.persona = persona;
        this.articulo = articulo;
        this.fechaInicioPrestamo = fechaInicioPrestamo;
        this.fechaDevolucionPrestamo = fechaDevolucionPrestamo;
        this.id = contadorId++; // asigna 0, luego contadorId pasa a 1
    }

    public LocalDate fechaDevolucion() {
        return fechaDevolucionPrestamo;
    }

    public int getId() {
        return this.id;
    }
}
