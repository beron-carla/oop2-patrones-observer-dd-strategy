package dd.ejercicio5opcion2IA;

import java.time.LocalDate;

public class Articulo {
    private static int contadorId = 0;
    private Tipo tipo;
    private String nombre;
    private int anio;
    private Estado estado;
    private LocalDate fechaPublicacion;
    private int cantPaginas;
    private int id;

    // Constructor Revista
    public Articulo(Revista tipo, String nombre, int anio, Estado estado, LocalDate fechaPublicacion, int cantidadPaginas) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
        this.fechaPublicacion = fechaPublicacion;
        this.cantPaginas = cantidadPaginas;
        this.id = contadorId++;
    }

    // Constructor Libro
    public Articulo(Libro tipo, String nombre, int anio, Estado estado, int cantPaginas) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
        this.cantPaginas = cantPaginas;
        this.id = contadorId++;
    }

    // Constructor Disco
    public Articulo(Disco tipo, String nombre, int anioInicioBanda, Estado estado) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.anio = anioInicioBanda;
        this.estado = estado;
        this.id = contadorId++;
    }

    // Inicia el DD — delega en el estado
    public int calcularDuracionPrestamo() {
        return this.estado.calcularDuracionPrestamo(this);
    }

    public Tipo tipo() {
        return this.tipo;
    }

    public Estado estado() {
        return this.estado;
    }

    public int anio() {
        return this.anio;
    }

    public int cantPaginas() {
        return this.cantPaginas;
    }

    public LocalDate fechaPublicacion() {
        return this.fechaPublicacion;
    }

    public String nombre() {
        return this.nombre;
    }

    public int aniosDesdePublicacion() {
        return LocalDate.now().getYear() - this.fechaPublicacion.getYear();
    }
}
