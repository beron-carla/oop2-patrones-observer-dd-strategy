package dd.ejercicio5;

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


    //constructor de Revista
    public Articulo(Revista tipo, String nombre, int anio, Estado estado, LocalDate fechaPublicacion, int cantidadPaginas) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.anio = anio;
        this.estado = estado;
        this.fechaPublicacion = fechaPublicacion;
        this.cantPaginas = cantidadPaginas;
        this.id = contadorId++;
    }

    //constructor de Libro
    public Articulo(Libro tipo, String nombre, int anio, Estado estado, int cantPaginas) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.anio = anio; //anio de publicacion del libro
        this.cantPaginas = cantPaginas;
        this.id = contadorId++;
    }

    //Contructor de Disco
    public Articulo(Disco tipo, String nombre, int anioInicioBanda) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.anio = anioInicioBanda; //anio de inicio de la banda
        this.id = contadorId++;
    }

    public int calcularDuracionPrestamo() {
        return this.tipo.calcularDuracionPrestamo(this);
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

}
