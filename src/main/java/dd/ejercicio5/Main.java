package dd.ejercicio5;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        var gestorDePrestamos = new GestorDePrestamosMultimedia();

        var libro = new Articulo(new Revista(), "forbes", 2000, Estado.NUEVO, LocalDate.now(), 20);

        var persona = new Persona("carla", "beron", "38548234");

        gestorDePrestamos.generarPrestamo(persona, libro);


    }
}
